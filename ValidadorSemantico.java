import java.util.ArrayList;
import java.util.List;

/**
 * Validador
 */
public class ValidadorSemantico {
  private static List<Variavel> tabelaVariaveis = new ArrayList<>();

  public static List<Exception> validar(List<Token> tokens) throws Exception {
    List<Exception> errosSintaticos = new ArrayList<>();

    int iterator = 0;

    while (iterator < tokens.size()) {
      if (tokens.get(iterator).tipoToken.equals("TIPO")) {
        // verificar valor da variável
        // adicionar variável a tabela de váriaveis
        // dar update no iterador
        try {
          int novaPosicao = validarAtribuicao(tokens, iterator);
          iterator = novaPosicao;
        } catch (Exception e) {
          errosSintaticos.add(e);
        }
      } else if (tokens.get(iterator).tipoToken.equals("ID")) {
        // verificar se existe na tabela de variaveis
        try {
          validarVariavel(tokens, iterator);
        } catch (Exception e) {
          errosSintaticos.add(e);
        }
      } else if (tokens.get(iterator).tipoToken.equals("OP_AR")) {
        // verificar que as variaveis envolvidas existem
        // garantir que variaveis sejam de tipos válidos (int ou float)
        try {
          int novaPosicao = validarOperacaoAritmetica(tokens, iterator);
          iterator = novaPosicao;
        } catch (Exception e) {
          errosSintaticos.add(e);
          int novaPosicao = encontrarPontoVirgula(tokens, iterator);
          iterator = novaPosicao;
        }
      } else if (tokens.get(iterator).tipoToken.equals("ATRIBUICAO")) {
        // verificar se é op_ar ou variavel
        // se for op_ar deixar que o bloco de op_ar valide
        // se for var checar que os tipos das variaveis são compativeis
        try {
          validarTrocaDeValor(tokens, iterator);
        } catch (Exception e) {
          errosSintaticos.add(e);
        }
      } else if (tokens.get(iterator).tipoToken.equals("WRITE") || tokens.get(iterator).tipoToken.equals("READ")) {
        // garante que a variável sendo lida/escrita é int ou float
        try {
          validarInputOutput(tokens, iterator);
        } catch (Exception e) {
          errosSintaticos.add(e);
        }
      }

      iterator++;
    }

    return errosSintaticos;
  }

  private static int validarAtribuicao(List<Token> tokens, int posicaoAtual) throws Exception {
    if (tokens.get(posicaoAtual + 2).tipoToken.equals("PONTO_VIRGULA")) {
      // apenas adicionar na tabela de variáveis
      tabelaVariaveis.add(new Variavel(tokens.get(posicaoAtual + 1), tokens.get(posicaoAtual).conteudo));
      // retorna a posicao do ponto_virgula
      return posicaoAtual + 2;
    } else {
      // verificar se o tipo da variável e o valor sendo adicionado são compativeis
      if ((tokens.get(posicaoAtual).conteudo.equals("int") || tokens.get(posicaoAtual).conteudo.equals("float"))
          && tokens.get(posicaoAtual + 3).tipoToken.equals("VALOR_BOOLEANO")) {
        throw new ErroSemanticoException(
            "Tipo de variável sendo declarada incompatível com o valor sendo recebido na linha "
                + tokens.get(posicaoAtual).numLinha);
      }

      if (tokens.get(posicaoAtual).conteudo.equals("boolean")
          && tokens.get(posicaoAtual + 3).tipoToken.equals("VALOR")) {
        throw new ErroSemanticoException(
            "Tipo de variável sendo declarada incompatível com o valor sendo recebido na linha "
                + tokens.get(posicaoAtual).numLinha);
      }
      // adicionar na tabela de variáveis
      tabelaVariaveis.add(new Variavel(tokens.get(posicaoAtual + 1), tokens.get(posicaoAtual).conteudo));
      // retorna a posicao do ponto_virgula
      return posicaoAtual + 4;
    }
  }

  // garante que a variável foi declarada
  private static void validarVariavel(List<Token> tokens, int posicaoAtual) throws Exception {
    for (int i = 0; i < tabelaVariaveis.size(); i++) {
      // System.out.println("Comparando " + tabelaVariaveis.get(i).conteudo + " com "
      // + tokens.get(posicaoAtual).conteudo);
      if (tabelaVariaveis.get(i).token.conteudo.equals(tokens.get(posicaoAtual).conteudo)) {
        return;
      }
    }

    throw new ErroSemanticoException(
        "Variável sendo usada sem ter sido inicializada na linha " + tokens.get(posicaoAtual).numLinha);
  }

  private static int encontrarPontoVirgula(List<Token> tokens, int posicaoAtual) {
    int iterator = posicaoAtual;

    while (!tokens.get(iterator).tipoToken.equals("PONTO_VIRGULA")) {
      iterator++;
    }
    return iterator;
  }

  private static boolean variavelEhBooleana(String nomeVar) {
    for (int i = 0; i < tabelaVariaveis.size(); i++) {
      if (tabelaVariaveis.get(i).token.conteudo.equals(nomeVar)) {
        if (tabelaVariaveis.get(i).tipoPrimitivo.equals("boolean")) {
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }

  private static boolean ehOperacaoAritmetica(List<Token> tokens, int posicaoAtual) {
    int iterator = posicaoAtual;
    while (!tokens.get(iterator).tipoToken.equals("PONTO_VIRGULA")) {
      if (tokens.get(iterator).tipoToken.equals("OP_AR")) {
        return true;
      }
      iterator++;
    }
    return false;
  }

  private static int validarOperacaoAritmetica(List<Token> tokens, int posicaoAtual) throws Exception {
    try {
      List<Token> variaveisEnvolvidas = new ArrayList<>();

      variaveisEnvolvidas.add(tokens.get(posicaoAtual - 1));
      int iterator = posicaoAtual;

      // obtendo todas as variaveis
      while (!tokens.get(iterator).tipoToken.equals("PONTO_VIRGULA")) {
        if (tokens.get(iterator).tipoToken.equals("ID")) {
          // validando que a variavel já foi declarada
          validarVariavel(tokens, iterator);
          variaveisEnvolvidas.add(tokens.get(iterator));
        }
        iterator++;
      }

      // validar que os valores das variáveis são numéricos
      for (int i = 0; i < variaveisEnvolvidas.size(); i++) {
        if (variavelEhBooleana(variaveisEnvolvidas.get(i).conteudo)) {
          throw new ErroSemanticoException(
              "Variavel booleana sendo usada em operacao aritmetica na linha " + variaveisEnvolvidas.get(i).numLinha);
        }
      }

      return iterator;
    } catch (Exception e) {
      throw e;
    }
  }

  private static void validarTrocaDeValor(List<Token> tokens, int posicaoAtual) throws Exception {
    if (ehOperacaoAritmetica(tokens, posicaoAtual) && variavelEhBooleana(tokens.get(posicaoAtual - 1).conteudo)) {
      throw new ErroSemanticoException(
          "Variável booleana recebendo resultado de operacão aritmética na linha " + tokens.get(posicaoAtual).numLinha);
    } else if (!ehOperacaoAritmetica(tokens, posicaoAtual)) {
      // verificar se valor a direita e variavel a esquerda são do mesmo tipoPrimitivo
      if (!variavelEhBooleana(tokens.get(posicaoAtual - 1).conteudo)
          && tokens.get(posicaoAtual + 1).tipoToken.equals("VALOR_BOOLEANO")) {
        throw new ErroSemanticoException(
            "Variável e valor sendo atribuido são incompativeis na linha " + tokens.get(posicaoAtual).numLinha);
      }

      if (variavelEhBooleana(tokens.get(posicaoAtual - 1).conteudo)
          && tokens.get(posicaoAtual + 1).tipoToken.equals("VALOR")) {
        throw new ErroSemanticoException(
            "Variável e valor sendo atribuido são incompativeis na linha " + tokens.get(posicaoAtual).numLinha);
      }
    }
  }

  private static void validarInputOutput(List<Token> tokens, int posicaoAtual) throws Exception {
    if (tokens.get(posicaoAtual + 2).tipoToken.equals("ID")) {
      if (variavelEhBooleana(tokens.get(posicaoAtual + 2).conteudo)) {
        throw new ErroSemanticoException(
            "Não se pode ler/escrever valor booleano, na linha " + tokens.get(posicaoAtual + 2).numLinha);
      }
    }
  }
}