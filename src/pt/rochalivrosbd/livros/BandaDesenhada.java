package pt.rochalivrosbd.livros;

import pt.rochalivrosbd.pessoas.Autor;

public class BandaDesenhada {
    
        private Autor autor; //campo do tipo referencia
        private int númeroDePáginas;//p.ex. 25, 95, 125
        private double peso; //em quilos, p.ex. 0.125kg, 0.95kg
        private boolean cores;
        private String tamanho;
        private int anoPublicação; //p.ex: 1995, 2001, 1954
        private String título; //campo do tipo referencia
        private String personagem;
          

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

    public String getPersonagem() {
        return personagem;
    }

    public String getTítulo() {
        return título;
    }
    
}
