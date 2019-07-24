import java.util.List;

/**
 * AnalisadorSintatico
 */
public class AnalisadorSintatico {

    public static Boolean programaEhValido(List<Token> tokens) {
        Tabela tabela = CriadorTabela.criar();

        try {
            Validador.SLR(tabela, tokens);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }
}