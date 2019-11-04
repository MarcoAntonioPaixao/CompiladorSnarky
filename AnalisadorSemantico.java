import java.util.List;

/**
 * AnalisadorSemantico
 */
public class AnalisadorSemantico {

  public static Boolean programaEhValido(List<Token> tokens) throws Exception {

    try {
      List<Exception> errosSemanticos = ValidadorSemantico.validar(tokens);
      imprimirErrosSemanticos(errosSemanticos);

      if (errosSemanticos.size() == 0)
        return true;
      else
        return false;
    } catch (Exception e) {
      throw e;
    }
  }

  private static void imprimirErrosSemanticos(List<Exception> errosSemanticos) {
    for (int i = 0; i < errosSemanticos.size(); i++) {
      System.out.println(errosSemanticos.get(i).getMessage());
    }
  }
}