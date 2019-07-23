
import java.util.List;

class App {
  public static void run(String conteudoArquivo) {

    try {
      List<Token> tokens = AnalisadorLexico.Tokenize(conteudoArquivo);
      imprimeTokens(tokens);
      // boolean programaEhValido = AnalisadorSintatico.programaEhValido(tokens);

    } catch (TokenInvalidoException e) {
      System.out.println("Ei programador, voce tem certeza que esta programando na linguagem correta?");
      e.printStackTrace();
    } catch (NumeroInvalidoException e) {
      System.out.println("Então, numeros não deveriam ser escritos desta maneira.");
      e.printStackTrace();
    } catch (OpLogicoInvalidoException e) {
      System.out.println("Isso não é lógico!!!.");
      e.printStackTrace();
    }

  }

  // private static void imprimeTokens(List<Token> tokens) {
  // for (int i = 0; i < tokens.size(); i++) {
  // System.out.println(tokens.get(i).conteudo + " " + tokens.get(i).tipoToken);
  // }
  // }

}