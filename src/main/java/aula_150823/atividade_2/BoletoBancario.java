package aula_150823.atividade_2;

import java.time.LocalDate;

public class BoletoBancario extends Pagamento {

    private String codigo;

    public BoletoBancario() {
    }

    public BoletoBancario(Double valor, LocalDate data, String codigo) {
        super(valor, data);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
