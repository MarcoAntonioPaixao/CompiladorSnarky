
/**
 * CriadorTabela
 */
public class CriadorTabela {

    public static Tabela criar() {
        Tabela tabela = new Tabela();

        Gerador.gerarEstados(tabela);
        Gerador.gerarReducoes(tabela);

        return tabela;
    }

}