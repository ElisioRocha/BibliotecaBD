package pt.rochalivrosbd;

import java.util.ArrayList;
import java.util.Scanner;
import pt.rochalivrosbd.gerirdados.BaseDadosBD;
import pt.rochalivrosbd.livros.BandaDesenhada;

public class BibliotecaBD {

    public static void main(String[] args) {
        
        System.out.println("Bem-vinda|o à biblioteca de livros de banda desenhada.");        
        BaseDadosBD.setBaseDadosBD();
        
        Scanner entradaPedido = new Scanner(System.in);
        System.out.println("Que personagem de Banda Desenhada pretende pesquisar? ");
        String personagemPedida = entradaPedido.nextLine();
        
        ArrayList <BandaDesenhada> pedidoBandaDesenhada = new ArrayList();
        pedidoBandaDesenhada = devolveBandasDesenhadas(personagemPedida);
        
        System.out.println("Agradecemos o seu pedido de banda desenhada.");        
        
    }
    
    public static ArrayList devolveBandasDesenhadas(String personagem){
        
        ArrayList <BandaDesenhada> baseDadosBD, respostaBD = new ArrayList();
        baseDadosBD = BaseDadosBD.getBaseDadosBD();             
        
        for(BandaDesenhada bd : baseDadosBD){
            
            if(bd.getPersonagem().equalsIgnoreCase(personagem) == true){
                System.out.println("Banda Desenhada de: " + bd.getPersonagem() + " '" + bd.getTítulo() +"'");
                respostaBD.add(bd);
            }
        }
        if(respostaBD.isEmpty() == true){
          System.out.println("Banda Desenhada de: "+ personagem + " não existe nesta biblioteca!");                  
        }
        
        return respostaBD;
    }

}
