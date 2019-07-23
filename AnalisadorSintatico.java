import java.util.List;

/**
 * AnalisadorSintatico
 */
public class AnalisadorSintatico {

    public static Boolean programaEhValido(List<Token> tokens) {
        Tabela tabela = CriadorTabela.criar();

        // System.out.println("O número de estados é de:");
        // System.out.println(tabela.estados.size());
        // System.out.println("O número de reduções é de:");
        // System.out.println(tabela.reducoes.size());

        // rodar o algoritmo srl usando a tabela criada mais os tokens
        return true;
    }
}