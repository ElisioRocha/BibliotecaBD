package pt.rochalivrosbd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import pt.rochalivrosbd.gerirdados.BaseDadosBD;
import pt.rochalivrosbd.livros.BandaDesenhada;

public class BibliotecaBD {

    public static void main(String[] args) {

        System.out.println("Bem-vinda|o à biblioteca de livros de banda desenhada.");
        ArrayList<BandaDesenhada> biblioteca = BaseDadosBD.setBaseDadosBD();

        Scanner entradaPedido = new Scanner(System.in);
        System.out.println("Que personagem de Banda Desenhada pretende pesquisar? ");
        String personagemPedida = entradaPedido.nextLine();

        ArrayList<BandaDesenhada> pedidoBandaDesenhada = new ArrayList();
        //pedidoBandaDesenhada = devolveBandasDesenhadas(personagemPedida,biblioteca);

        /*##Aqui temos um forEach que percorre numa única linha##*/
        //biblioteca.forEach(p -> System.out.println(p.getTítulo()));
        /*##Aqui temos um exemplo de utilização de lambdaExpression com um consumer*/
        //Consumer lambdaExpression = p -> System.out.println(p);
        //biblioteca.forEach(lambdaExpression);
        if(biblioteca.isEmpty() == false){
            
                biblioteca.stream()
                          .filter(s -> s.getPersonagem().equalsIgnoreCase(personagemPedida))
                          .forEach(p -> pedidoBandaDesenhada.add(p));
                
            if (pedidoBandaDesenhada.isEmpty() == false) {
                pedidoBandaDesenhada.forEach(p -> System.out.println("Banda Desenhada de: "
                                           + p.getPersonagem() + " '" + p.getTítulo() + "'"));
            }
            else {
            System.out.println("Banda Desenhada de: '" + personagemPedida + "' não existe nesta biblioteca!");
            }
        }
        else{
            System.out.println("De momento a Biblioteca de Bandas Desenhadas está vazia!");
        }
        
        System.out.println("Agradecemos o seu pedido de banda desenhada.");

    }

    public static ArrayList devolveBandasDesenhadas(String personagem, ArrayList biblioteca) {

        ArrayList<BandaDesenhada> baseDadosBD, respostaBD = new ArrayList();
        baseDadosBD = biblioteca;

        if (baseDadosBD != null) {

            for (BandaDesenhada bd : baseDadosBD) {

                if (bd.getPersonagem().equalsIgnoreCase(personagem) == true) {
                    System.out.println("Banda Desenhada de: " + bd.getPersonagem() + " '" + bd.getTítulo() + "'");
                    respostaBD.add(bd);
                }
            }
            if (respostaBD.isEmpty() == true) {
                System.out.println("Banda Desenhada de: '" + personagem + "' não existe nesta biblioteca!");
            }
        } else {
            System.out.println("De momento a Biblioteca de Bandas Desenhadas está vazia!");
        }

        return respostaBD;
    }

}
