package pt.rochalivrosbd.gerirdados;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import pt.rochalivrosbd.livros.BandaDesenhada;
import pt.rochalivrosbd.pessoas.Autor;

public class BaseDadosBD {
    static ArrayList <Autor> coleçãoAutores = new ArrayList();// hergé, morris, goscinny;
    static ArrayList <BandaDesenhada> coleçãoBD = new ArrayList();//osDaltons, unicorno, oFoguetão, osRomanos;

    BaseDadosBD() {
    }
    
    public static void carregarBaseDadosBD() {
        coleçãoAutores.add(new Autor("George", "Prosper Remi", "Hergé",LocalDate.parse("1907-5-22", DateTimeFormatter.ISO_DATE)));
        coleçãoAutores.add(new Autor("Maurice", "de Bévère", "Morris", LocalDate.parse("1923-12-1", DateTimeFormatter.ISO_DATE)));
        coleçãoAutores.add(new Autor("René", "Goscinny", "René Goscinny",LocalDate.parse("1926-8-14", DateTimeFormatter.ISO_DATE)));
        
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(1), true, 1996, "Os Dalton","Lucky Luke"));
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(0), true, 1985, "O unicorno","Tintim"));
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(0), true, 1991, "Missão à Lua","Tintim"));
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(2), true, 1978, "Asterix e Obelix contra César","Asterix"));

    }
    
    public static ArrayList devolveBandasDesenhadas(String personagem){
        
        ArrayList respostaBD = new ArrayList();
        int númeroRespostas = 0;
        
        for(BandaDesenhada bd: coleçãoBD){
            
            if(bd.personagem.equals(personagem) == true){
                System.out.println("Banda Desenhada de: "+ personagem + " '" + bd.título +"'");
                respostaBD.add(bd);
                númeroRespostas++;
            }
        }
        if(númeroRespostas == 0){
          System.out.println("Banda Desenhada de: "+ personagem + " não existe nesta biblioteca!");                  
        }
        
        return respostaBD;
    }
    
}
