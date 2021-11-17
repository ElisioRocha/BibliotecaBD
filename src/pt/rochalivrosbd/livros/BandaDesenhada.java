package pt.rochalivrosbd.livros;

import pt.rochalivrosbd.pessoas.Autor;

public class BandaDesenhada {
     
    /**/
        public Autor autor; //campo do tipo referencia
        int númeroDePáginas;//p.ex. 25, 95, 125
        double peso; //em quilos, p.ex. 0.125kg, 0.95kg
        boolean cores;
        String tamanho;
        int anoPublicação; //p.ex: 1995, 2001, 1954
        public String título; //campo do tipo referencia
        public String personagem;
        /**/    

    public BandaDesenhada(Autor autor, boolean cores, int anoPublicação, String título, String personagem) {
        this.autor = autor;
        //this.númeroDePáginas = númeroDePáginas;
        //this.peso = peso;
        this.cores = cores;
        //this.tamanho = tamanho;
        this.anoPublicação = anoPublicação;
        this.título = título;
        this.personagem = personagem;
    }
    
}
