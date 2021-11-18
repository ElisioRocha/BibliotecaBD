package pt.rochalivrosbd.pessoas;

import java.time.LocalDate;
import pt.rochalivrosbd.Nacionalidade;

public class Autor {
    
    public String nomePróprio;
    public String apelido;
    public String nomeArtístico;
    public LocalDate dataDeNascimento;
    Nacionalidade nacionalidade; //p.ex. português, belga, etc.

    public Autor(String nomePróprio, String apelido, String nomeArtístico, LocalDate dataNascimento) {
        this.nomePróprio = nomePróprio;
        this.apelido = apelido;
        this.nomeArtístico = nomeArtístico;
        this.dataDeNascimento = dataNascimento;
    }
    
}
