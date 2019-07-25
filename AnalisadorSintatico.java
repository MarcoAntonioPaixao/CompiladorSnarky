import java.util.List;

/**
 * AnalisadorSintatico
 */
public class AnalisadorSintatico {

    public static Boolean programaEhValido(List<Token> tokens) throws Exception {
        Tabela tabela = CriadorTabela.criar();

        try {
            List<Exception> errosSintaticos = Validador.SLR(tabela, tokens);
            imprimirErrosSintaticos(errosSintaticos);

            if (errosSintaticos.size() == 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void imprimirErrosSintaticos(List<Exception> errosSintaticos) {
        for (int i = 0; i < errosSintaticos.size(); i++) {
            System.out.println(errosSintaticos.get(i).getMessage());
        }
    }
}