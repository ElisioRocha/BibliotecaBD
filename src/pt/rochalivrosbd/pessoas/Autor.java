package pt.rochalivrosbd.pessoas;

import java.time.LocalDate;
import pt.rochalivrosbd.Nacionalidade;

public class Autor {
    
    private String nomePróprio;
    private String apelido;
    private String nomeArtístico;
    private LocalDate dataDeNascimento;
    private Nacionalidade nacionalidade; //p.ex. português, belga, etc.

    public Autor(String nomePróprio, String apelido, String nomeArtístico, LocalDate dataNascimento) {
        this.nomePróprio = nomePróprio;
        this.apelido = apelido;
        this.nomeArtístico = nomeArtístico;
        this.dataDeNascimento = dataNascimento;
    }
    
}
