/**
 * Transicao
 */
public class Transicao {

    public String naoTerminal;
    public int novoEstado;

    public Transicao(String naoTerminal, int novoEstado) {
        this.naoTerminal = naoTerminal;
        this.novoEstado = novoEstado;
    }

}