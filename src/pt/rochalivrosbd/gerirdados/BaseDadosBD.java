package pt.rochalivrosbd.gerirdados;

import java.util.Date;
import pt.rochalivrosbd.livros.BandaDesenhada;
import pt.rochalivrosbd.pessoas.Autor;

public class BaseDadosBD {
    static Autor [] coleçãoAutores = new Autor[3];// hergé, morris, goscinny;
    static BandaDesenhada [] coleçãoBD = new BandaDesenhada[4];//osDaltons, unicorno, oFoguetão, osRomanos;

    BaseDadosBD() {
    }
    
    public static void carregarBaseDadosBD() {
        coleçãoAutores[0] = new Autor("George", "Prosper Remi", "Hergé", new Date(1907, 5, 22));
        coleçãoAutores[1] = new Autor("Maurice", "de Bévère", "Morris", new Date(1923, 12, 1));
        coleçãoAutores[2] = new Autor("René", "Goscinny", "René Goscinny", new Date(1926, 8, 14));
        
        coleçãoBD[0] = new BandaDesenhada(coleçãoAutores[1], true, 1996, "Os Dalton","Lucky Luke");
        coleçãoBD[1] = new BandaDesenhada(coleçãoAutores[0], true, 1985, "O unicorno","Tintim");
        coleçãoBD[2] = new BandaDesenhada(coleçãoAutores[0], true, 1991, "Missão à Lua","Tintim");
        coleçãoBD[3] = new BandaDesenhada(coleçãoAutores[2], true, 1978, "Asterix e Obelix contra César","Asterix");

    }
    
    public static BandaDesenhada[] devolveBandasDesenhadas(String personagem){
        
        BandaDesenhada[] respostaBD = new BandaDesenhada[coleçãoBD.length];
        int númeroRespostas = 0;
        
        for(int posição=0; posição < coleçãoBD.length; posição++){
            
            if(coleçãoBD[posição].personagem.equals(personagem) == true){
                System.out.println("Banda Desenhada de: "+ personagem + " '" + coleçãoBD[posição].título +"'");
                respostaBD[númeroRespostas] = coleçãoBD[posição];
                númeroRespostas++;
            }
        }
        if(númeroRespostas == 0){
          System.out.println("Banda Desenhada de: "+ personagem + " não existe nesta biblioteca!");                  
        }
        
        return respostaBD;
    }
    
}
