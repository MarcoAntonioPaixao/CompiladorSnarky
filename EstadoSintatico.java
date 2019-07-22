import java.util.ArrayList;
import java.util.List;

/**
 * EstadoSintatico
 */
public class EstadoSintatico {
    public List<AcaoSintatica> acoes;
    public List<Transicao> transicoes;

    public EstadoSintatico() {
        this.acoes = new ArrayList<AcaoSintatica>();
        this.transicoes = new ArrayList<Transicao>();
    }
}