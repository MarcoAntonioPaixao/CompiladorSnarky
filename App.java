import java.util.ArrayList;
import java.util.List;

class App {
  public static void run(String conteudoArquivo) {
    List<Token> tokens = Tokenize(conteudoArquivo);

    for (int i = 0; i < tokens.size(); i++) {
      System.out.println(tokens.get(i).conteudo);
    }
  }

  private static List<Token> Tokenize(String conteudoArquivo) {
    List<Token> tokens = new ArrayList<>();

    for (int i = 0; i < conteudoArquivo.length(); i++) {
      if (ehLetra(conteudoArquivo.charAt(i))) {
        System.out.println("Adicionei id ou palavra reservada");
        Token idToken = Token.retornaIdentificador(conteudoArquivo, i);
        i += idToken.conteudo.length();
        tokens.add(idToken);
      } else if (ehNumero(conteudoArquivo.charAt(i))) {
        System.out.println("Adicionei numero");
        Token numeroToken = Token.retornaNumero(conteudoArquivo, i);
        i += numeroToken.conteudo.length();
        tokens.add(numeroToken);

      } else if (ehOpLogico(conteudoArquivo.charAt(i))) {
        System.out.println("Adicionei operador logico");
        Token opToken = Token.retornaOpLogico(conteudoArquivo, i);
        i += opToken.conteudo.length();
        tokens.add(opToken);

      } else if (ehTokenValido(conteudoArquivo.charAt(i))) {
        System.out.println("Adicionei tipo de token extra");
        Token token = Token.identificaTipoToken(conteudoArquivo.charAt(i));
        tokens.add(token);
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
        || elemento == '}' || elemento == '(' || elemento == ')');
  }

}