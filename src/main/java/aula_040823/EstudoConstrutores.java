package aula_040823;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudoConstrutores {

    public static void main(String[] args) {
        List<String> produtos = new ArrayList<String>();
        produtos.add("Tênis");
        produtos.add("Camiseta");
        produtos.add("Boné");
        Venda venda = new Venda(LocalDate.now(), "Felipe", produtos, 300.0);

        System.out.println(venda.getCliente());
        System.out.println(venda.getDataRegistro());
        System.out.println(venda.getProdutos());
        System.out.println(venda.getPrecoTotal());
        //Sem construtor:
//        venda.setCliente("Felipe");
//        venda.setDataRegistro(LocalDate.now());

//        venda.setProdutos(produtos);
//        venda.setPrecoTotal();

    }
}
