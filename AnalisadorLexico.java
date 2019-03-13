import java.util.ArrayList;
import java.util.List;

class AnalisadorLexico {
  public static List<Token> Tokenize(String conteudoArquivo) {
    List<Token> tokens = new ArrayList<>();

    for (int i = 0; i < conteudoArquivo.length(); i++) {
      if (!ehEspacoBranco(conteudoArquivo.charAt(i))) {
        if (ehLetra(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei id ou palavra reservada");
          Token idToken = Token.retornaIdentificador(conteudoArquivo, i);
          i += idToken.conteudo.length() - 1;
          tokens.add(idToken);

        } else if (ehNumero(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei numero");
          Token numeroToken = Token.retornaNumero(conteudoArquivo, i);
          i += numeroToken.conteudo.length() - 1;
          tokens.add(numeroToken);

        } else if (ehOpLogico(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei operador logico");
          Token opToken = Token.retornaOpLogico(conteudoArquivo, i);
          i += opToken.conteudo.length();
          tokens.add(opToken);

        } else if (ehTokenValido(conteudoArquivo.charAt(i))) {

          // System.out.println("Adicionei tipo de token extra");
          Token token = Token.identificaTipoToken(conteudoArquivo.charAt(i));
          tokens.add(token);

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
    return (elemento == '<' || elemento == '>' || elemento == '=' || elemento == '!' || elemento == '&'
        || elemento == '|');
  }

  private static boolean ehTokenValido(char elemento) {
    return (elemento == '+' || elemento == '-' || elemento == '*' || elemento == '/' || elemento == '{'
        || elemento == '}' || elemento == '(' || elemento == ')' || elemento == ';');
  }

  private static boolean ehEspacoBranco(char elemento) {
    return elemento == ' ';
  }

}