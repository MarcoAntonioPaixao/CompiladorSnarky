import java.util.ArrayList;

/**
 * CriadorTabela
 */
public class CriadorTabela {

    public static Tabela criar() {
        Tabela tabela = new Tabela();

        Gerador.gerarEstados(tabela);

        // System.out.println("O número de estados é de:");
        // System.out.println(tabela.estados.size());

        Gerador.gerarReducoes(tabela);

        return tabela;
    }

}