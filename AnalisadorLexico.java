import java.util.ArrayList;
import java.util.List;

class AnalisadorLexico {
  public static List<Token> Tokenize(String conteudoArquivo)
      throws TokenInvalidoException, OpLogicoInvalidoException, NumeroInvalidoException {
    List<Token> tokens = new ArrayList<>();
    int numeroLinha = 1;// apenas para saber onde o erro ocorreu

    for (int i = 0; i < conteudoArquivo.length(); i++) {
      if (conteudoArquivo.charAt(i) == '\n')
        numeroLinha++;// controle do numero de linhas

      if (!ehEspacoBranco(conteudoArquivo.charAt(i)) && !ehFimDeArquivo(conteudoArquivo.charAt(i))) {
        if (ehLetra(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei id ou palavra reservada");
          Token idToken = Token.retornaIdentificador(conteudoArquivo, i);
          i += idToken.conteudo.length() - 1;
          tokens.add(idToken);

        } else if (ehNumero(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei numero");
          try {
            Token numeroToken = Token.retornaNumero(conteudoArquivo, i);
            i += numeroToken.conteudo.length() - 1;
            tokens.add(numeroToken);
          } catch (NumeroInvalidoException e) {
            System.out.println("Erro na linha " + numeroLinha);
            throw e;
          }

        } else if (ehOpLogico(conteudoArquivo.charAt(i))) {
          try {
            // System.out.println("Adicionei operador logico");
            Token opToken = Token.retornaOpLogico(conteudoArquivo, i);
            i += opToken.conteudo.length() - 1;
            tokens.add(opToken);
          } catch (OpLogicoInvalidoException e) {
            System.out.println("Erro na linha " + numeroLinha);
            throw e;
          }

        } else if (ehOpRelacional(conteudoArquivo.charAt(i))) {
          try {
            // System.out.println("Adicionei operador relacional");
            Token opToken = Token.retornaOpRelacional(conteudoArquivo, i);
            i += opToken.conteudo.length() - 1;
            tokens.add(opToken);
          } catch (OpLogicoInvalidoException e) {
            System.out.println("Erro na linha " + numeroLinha);
            throw e;
          }

        } else if (ehTokenValido(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei tipo de token extra");
          Token token = Token.identificaTipoToken(conteudoArquivo.charAt(i));
          i += token.conteudo.length() - 1;
          tokens.add(token);

        } else {
          throw new TokenInvalidoException(
              "O token " + conteudoArquivo.charAt(i) + " localizado na linha " + numeroLinha + " eh invalido.");
        }
      }

    }

    return tokens;
  }

  private static boolean ehLetra(char elemento) {
    return Character.isLetter(elemento);
  }

  private static boolean ehNumero(char elemento) {
    return Character.isDigit(elemento);
  }

  private static boolean ehOpLogico(char elemento) {
    return (elemento == '&' || elemento == '|' || elemento == '!');
  }

  private static boolean ehOpRelacional(char elemento) {
    return (elemento == '<' || elemento == '>' || elemento == '=');
  }

  private static boolean ehTokenValido(char elemento) {
    return (elemento == '+' || elemento == '-' || elemento == '*' || elemento == '/' || elemento == '{'
        || elemento == '}' || elemento == '(' || elemento == ')' || elemento == ';' || elemento == '['
        || elemento == ']');
  }

  private static boolean ehFimDeArquivo(char elemento) {
    return elemento == '\n';
  }

  private static boolean ehEspacoBranco(char elemento) {
    return elemento == ' ';
  }

}