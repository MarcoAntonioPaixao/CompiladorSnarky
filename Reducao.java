import java.util.ArrayList;
import java.util.List;

/**
 * Reducao
 */
public class Reducao {
    public String naoTerminal;
    public List<String> transformacoes;

    public Reducao(String naoTerminal) {
        this.naoTerminal = naoTerminal;
        this.transformacoes = new ArrayList<String>();
    }
}