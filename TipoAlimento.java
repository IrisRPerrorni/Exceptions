package Ex1;

public class TipoAlimento {
    private String alimento; //nome alimento
    private double qtd; //quantidade

    //Construtor

    public TipoAlimento(String alimento, double qtd) {
        this.alimento = alimento;
        this.qtd = qtd;

    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }
}
