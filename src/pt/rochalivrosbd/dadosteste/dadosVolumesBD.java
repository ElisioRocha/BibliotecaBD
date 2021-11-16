package pt.rochalivrosbd.dadosteste;

import pt.rochalivrosbd.livros.BandaDesenhada;

public class dadosVolumesBD {
    
    BandaDesenhada osDaltons, unicorno, oFoguetão, osRomanos;

    public void carregarVolumesBD() {
        dadosAutores autores = new dadosAutores();
        autores.carregarAutores();
        osDaltons = new BandaDesenhada();
        osDaltons.autor = autores.morris;
        osDaltons.personagem = "Lucky Luke";

        unicorno = new BandaDesenhada();
        unicorno.autor = autores.hergé; // hergé é uma referência ao objeto atribuído anteriormente chamado "hergé"
        unicorno.personagem = "Tintim";
        unicorno.título = "O unicorno";

        oFoguetão = new BandaDesenhada();
        oFoguetão.autor = autores.hergé;
        oFoguetão.personagem = "Tintim";
        oFoguetão.título = "Missão à Lua";

        osRomanos = new BandaDesenhada();
        osRomanos.autor = autores.uderzo;
        osRomanos.personagem = "Asterix";
        osRomanos.título = "Asterix e Obelix contra César";
    }

}
