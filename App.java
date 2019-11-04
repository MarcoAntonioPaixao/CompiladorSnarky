
import java.util.List;

class App {
  public static void run(String conteudoArquivo) {

    try {
      List<Token> tokens = AnalisadorLexico.Tokenize(conteudoArquivo);
      // imprimeTokens(tokens);
      boolean programaEhSintaticamenteValido = AnalisadorSintatico.programaEhValido(tokens);

      tokens = AnalisadorLexico.Tokenize(conteudoArquivo);

      boolean programaEhSemanticamenteValido = AnalisadorSemantico.programaEhValido(tokens);

      if (programaEhSintaticamenteValido && programaEhSemanticamenteValido) {
        System.out.println("Programa eh valido? Sim");
      } else if (programaEhSintaticamenteValido && !programaEhSemanticamenteValido) {
        System.out.println("Programa eh sintaticamente valido, mas semanticamente inválido");
      } else if (!programaEhSintaticamenteValido && programaEhSemanticamenteValido) {
        System.out.println("Programa eh semanticamente valido, mas sintaticamente inválido");
      } else {
        System.out.println("Programa eh semanticamente e sintaticamente inválido");
      }

    } catch (TokenInvalidoException e) {
      System.out.println("Ei programador, voce tem certeza que esta programando na linguagem correta?");
      e.printStackTrace();
    } catch (NumeroInvalidoException e) {
      System.out.println("Então, numeros não deveriam ser escritos desta maneira.");
      e.printStackTrace();
    } catch (OpLogicoInvalidoException e) {
      System.out.println("Isso não é lógico!!!.");
      e.printStackTrace();
    } catch (ErroSemanticoException e) {
      System.out.println("Erro semântico.");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Erro sintático.");
      e.printStackTrace();
    }

  }

  // private static void imprimeTokens(List<Token> tokens) {
  // for (int i = 0; i < tokens.size(); i++) {
  // System.out.println(tokens.get(i).conteudo + " " + tokens.get(i).tipoToken);
  // }
  // }

}