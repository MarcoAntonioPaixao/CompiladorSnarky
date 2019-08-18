import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Validador
 */
public class Validador {

  public static List<Exception> SLR(Tabela tabela, List<Token> tokens) throws Exception {
    // adicionando simbolo $ no final da cadeia
    tokens.add(new Token("$", "$"));
    List<Exception> errosSintaticos = new ArrayList<>();

    Stack<String> pilha = new Stack<String>();
    pilha.push("0");

    String estadoTopoPilha = "";

    try {
      while (tokens.size() > 0) {
        estadoTopoPilha = pilha.peek();
        Token tokenSendoAvaliado = tokens.get(0);
        // if (tokens.size() < 79 && tokens.size() > 60) {
        System.out.println("Estado no topo da pilha: " + estadoTopoPilha);
        System.err.println("Token sendo avaliado: " + tokenSendoAvaliado.conteudo);
        // }
        EstadoSintatico estadoSendoAvaliado = tabela.estados.get(Integer.parseInt(estadoTopoPilha));
        // System.out.println("Token " + tokenSendoAvaliado.tipoToken + " conteudo " +
        // tokenSendoAvaliado.conteudo);
        // System.out.println("Contador: " + tokens.size());
        int indexAcao = terminalExisteNoEstado(tokenSendoAvaliado, estadoSendoAvaliado);

        if (indexAcao == -1) {
          // deal with sintatic error here
          errosSintaticos.add(new ErroSintaticoException("Erro Sintatico ao analisar " + tokenSendoAvaliado.conteudo
              + " presente na linha " + tokenSendoAvaliado.numLinha + "\nestado no topo da pilha: " + estadoTopoPilha));
          System.out.println("Panic!");
          System.out.println("Erro Sintatico ao analisar " + tokenSendoAvaliado.tipoToken + " presente na linha "
              + tokenSendoAvaliado.numLinha);
          PanicMode(tokens, estadoSendoAvaliado);
        } else {
          if (ehFinalValido(tokenSendoAvaliado, estadoSendoAvaliado, indexAcao)) {
            return errosSintaticos;
          } else {
            if (estadoSendoAvaliado.acoes.get(indexAcao).acao.tipo.equals("empilhar")) {
              // segue a lógica de empilhar
              pilha.push(tokenSendoAvaliado.tipoToken);
              pilha.push(String.valueOf(estadoSendoAvaliado.acoes.get(indexAcao).acao.numEstado));
              tokens.remove(0);
            } else if (estadoSendoAvaliado.acoes.get(indexAcao).acao.tipo.equals("reduzir")) {
              // segue a lógica de reduzir
              // index acao 0 me retorna um indexReducao de 69 o que é impossível
              int indexReducao = estadoSendoAvaliado.acoes.get(indexAcao).acao.numEstado;
              int numTokensDescartar = tabela.reducoes.get(indexReducao).transformacoes.size() * 2;

              for (int i = 0; i < numTokensDescartar; i++) {
                pilha.pop();
              }

              String novoEstadoTopo = pilha.peek();
              String naoTerminalEscolhido = tabela.reducoes.get(indexReducao).naoTerminal;
              String estadoApontadoPelaTransicao = obterEstadoDaTransicao(
                  tabela.estados.get(Integer.parseInt(novoEstadoTopo)).transicoes, naoTerminalEscolhido);
              pilha.push(naoTerminalEscolhido);
              pilha.push(estadoApontadoPelaTransicao);
              // verificar se tem de remover o token da lista, acho que nao
            } else if (estadoSendoAvaliado.acoes.get(indexAcao).acao.tipo.equals("acc")) {
              // aqui só se deve entrar quando o panic mode for acionado.
              break;
            } else {
              System.out.println("Tipo de ação inválida, esperava empilhar ou reduzir, obtive "
                  + estadoSendoAvaliado.acoes.get(indexAcao).acao.tipo + ".");
            }
          }
        }

      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      throw e;
    }

    return errosSintaticos;
  }

  private static int terminalExisteNoEstado(Token terminal, EstadoSintatico estado) {
    // System.out.println("Check " + terminal + " " + estado.acoes.size());
    if (terminal.tipoToken.equals("IF")) {
      System.out.println("Check " + terminal.tipoToken + " " + estado.acoes.size());
      for (int i = 0; i < estado.acoes.size(); i++) {
        System.out.println(estado.acoes.get(i).terminal);
      }
    }
    for (int i = 0; i < estado.acoes.size(); i++) {
      AcaoSintatica acaoAtual = estado.acoes.get(i);
      // terminal pode ser, por exemplo, ABRE_CHAVE
      if (terminal.tipoToken.equals(acaoAtual.terminal) || terminal.conteudo.equals(acaoAtual.terminal)) {
        return i;
      }
    }

    // System.out.println("Check " + terminal + estado.acoes.get(1).terminal);

    return -1;
  }

  private static boolean ehFinalValido(Token tokenSendoAvaliado, EstadoSintatico estado, int indexAcao) {
    return (tokenSendoAvaliado.tipoToken.equals("$") && estado.acoes.get(indexAcao).terminal.equals("acc"));
  }

  private static String obterEstadoDaTransicao(List<Transicao> transicoes, String naoTerminal) throws Exception {
    for (int i = 0; i < transicoes.size(); i++) {
      if (transicoes.get(i).naoTerminal.equals(naoTerminal)) {
        return String.valueOf(transicoes.get(i).novoEstado);
      }
    }

    throw new ErroSintaticoException("Erro ao tentar achar a transicao para o nao-terminal: " + naoTerminal);
  }

  private static void PanicMode(List<Token> tokens, EstadoSintatico estadoSendoAvaliado) {
    Token tokenSendoAvaliado;
    int indexAcao = -1;

    while (indexAcao == -1) {
      tokens.remove(0);
      tokenSendoAvaliado = tokens.get(0);
      indexAcao = terminalExisteNoEstado(tokenSendoAvaliado, estadoSendoAvaliado);
    }
  }

}
