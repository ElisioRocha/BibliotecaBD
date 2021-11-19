package pt.rochalivrosbd.gerirdados;

import java.util.ArrayList;
import java.time.LocalDate;
import pt.rochalivrosbd.livros.BandaDesenhada;
import pt.rochalivrosbd.pessoas.Autor;

public class BaseDadosBD {
    private static ArrayList <Autor> coleçãoAutores;// = new ArrayList();// hergé, morris, goscinny;
    private static ArrayList <BandaDesenhada> coleçãoBD;// = new ArrayList();//osDaltons, unicorno, oFoguetão, osRomanos;

    BaseDadosBD() {
    }
    
    public static void setBaseDadosBD() {
        coleçãoAutores = new ArrayList();
        coleçãoAutores.add(new Autor("George", "Prosper Remi", "Hergé", LocalDate.of(1907, 5, 22)));
        coleçãoAutores.add(new Autor("Maurice", "de Bévère", "Morris", LocalDate.of(1923,12,1)));
        coleçãoAutores.add(new Autor("René", "Goscinny", "René Goscinny",LocalDate.of(1926, 8, 14)));
        
        coleçãoBD = new ArrayList();
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(1), true, 1996, "Os Dalton","Lucky Luke"));
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(0), true, 1985, "O unicorno","Tintim"));
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(0), true, 1991, "Missão à Lua","Tintim"));
        coleçãoBD.add(new BandaDesenhada(coleçãoAutores.get(2), true, 1978, "Asterix e Obelix contra César","Asterix"));
        
    }
    
    public static ArrayList getBaseDadosBD() {
        return coleçãoBD;                
    }    
    
}
