import java.util.ArrayList;
import java.util.List;

/**
 * Tabela
 */
public class Tabela {
    public List<EstadoSintatico> estados;
    public List<Reducao> reducoes;

    public Tabela() {
        this.estados = new ArrayList<EstadoSintatico>();
        this.reducoes = new ArrayList<Reducao>();
    }
}