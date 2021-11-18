package pt.rochalivrosbd;

import java.util.ArrayList;
import java.util.Scanner;
import pt.rochalivrosbd.gerirdados.BaseDadosBD;
import pt.rochalivrosbd.livros.BandaDesenhada;

public class BibliotecaBD {

    public static void main(String[] args) {
        
        System.out.println("Bem-vinda|o à biblioteca de livros de banda desenhada.");        
        BaseDadosBD.carregarBaseDadosBD();
        
        Scanner entradaPedido = new Scanner(System.in);
        System.out.println("Que personagem de Banda Desenhada pretende pesquisar? ");
        String personagemPedida = entradaPedido.nextLine();
        
        ArrayList pedidoBandaDesenhada = new ArrayList();
        pedidoBandaDesenhada = BaseDadosBD.devolveBandasDesenhadas(personagemPedida);
        
        System.out.println("Agradecemos o seu pedido de banda desenhada.");        
        
    }

}
