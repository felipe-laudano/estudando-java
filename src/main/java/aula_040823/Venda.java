package aula_040823;

import java.time.LocalDate;
import java.util.List;

public class Venda {

    private LocalDate dataRegistro;
    private String cliente;
    private List<String> produtos;
    private Double precoTotal;

    public Venda(LocalDate dataRegistro, String cliente, List<String> produtos, Double precoTotal) {
        this.dataRegistro = dataRegistro;
        this.cliente = cliente;
        this.produtos = produtos;
        this.precoTotal = precoTotal;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override // annotation (anotação) -> indica que não é um metodo comum, é uma sobreescrita,
    // método ja existe na classe Object, ou seja, aqui este método esta sendo sobreescrito
    public String toString() {
        return "Venda{" +
                "dataRegistro=" + dataRegistro +
                ", cliente='" + cliente + '\'' +
                ", produtos=" + produtos +
                ", precoTotal=" + precoTotal +
                '}';
    }
}
