package pt.rochalivrosbd;

import pt.rochalivrosbd.dadosteste.dadosVolumesBD;

public class BibliotecaBD {
  
    public static void main(String[] args) {
       
        System.out.println("Bem-vinda|o à biblioteca de livros de banda desenhada.");
        dadosVolumesBD bandasDesenhadas = new dadosVolumesBD();
        bandasDesenhadas.carregarVolumesBD();
       
    }
    
}
