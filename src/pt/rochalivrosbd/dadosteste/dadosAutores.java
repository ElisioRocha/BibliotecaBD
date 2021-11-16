package pt.rochalivrosbd.dadosteste;

import java.util.Date;
import pt.rochalivrosbd.pessoas.Autor;

public class dadosAutores {
    
    Autor hergé;
    Autor morris;
    Autor uderzo;

    void carregarAutores() {
        hergé = new Autor();
        hergé.nomePróprio = "George";
        hergé.apelido = "Prosper Remi";
        hergé.nomeArtístico = "Hergé";
        hergé.dataDeNascimento = new Date(1907, 5, 22);
        
        morris = new Autor();
        morris.nomePróprio = "Maurice";
        morris.apelido = "de Bévère";
        morris.nomeArtístico = "Morris";
        morris.dataDeNascimento = new Date(1923, 12, 1);
        
        uderzo = new Autor();
        uderzo.nomePróprio = "Albert";
        uderzo.apelido = "Aleandro Uderzo";
        uderzo.nomeArtístico = "Uderzo";
        uderzo.dataDeNascimento = new Date(1927, 4, 25);
    }
    
}
