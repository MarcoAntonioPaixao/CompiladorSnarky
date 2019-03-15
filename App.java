
import java.util.List;

class App {
  public static void run(String conteudoArquivo) {

    try {
      List<Token> tokens = AnalisadorLexico.Tokenize(conteudoArquivo);

      for (int i = 0; i < tokens.size(); i++) {
        System.out.println(tokens.get(i).conteudo);
      }

    } catch (TokenInvalidoException e) {
      e.printStackTrace();
    } catch (NumeroInvalidoException e) {
      e.printStackTrace();
    } catch (OpLogicoInvalidoException e) {
      e.printStackTrace();
    }

  }

}