package model;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Clientes[] c = new Clientes[10];
        c[0] = new Clientes("Adriano Alves",
                "Rua João Rufino de Freitas, 41 Agamenom Magalhaes, Caruaru/PE",
                "81-99693-4193");

        c[1] = new Clientes("Alessandra",
                "Rua João Rufino de Freitas, 41 Agamenom Magalhaes, Caruaru/PE",
                "81-99988-5423");

        OrdemPedidos[] op=new OrdemPedidos[10];

        op[0] = new OrdemPedidos(c[0]);
        op[0].valorPedido(10, "cambraia");
        op[0].statusPedido();

        op[1] = new OrdemPedidos(c[1]);
        op[1].valorPedido(35, "tecnologico");
        op[1].statusPedido();


    }
}
