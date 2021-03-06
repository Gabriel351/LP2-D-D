package com.example.alunos.helperrealm5e;

import android.content.Context;

import com.example.alunos.helperrealm5e.Classes.Atirador;
import com.example.alunos.helperrealm5e.Classes.Barbaro;
import com.example.alunos.helperrealm5e.Classes.Bardo;
import com.example.alunos.helperrealm5e.Classes.Bruxo;
import com.example.alunos.helperrealm5e.Classes.Classe;
import com.example.alunos.helperrealm5e.Classes.Clerigo;
import com.example.alunos.helperrealm5e.Classes.Druida;
import com.example.alunos.helperrealm5e.Classes.Guerreiro;
import com.example.alunos.helperrealm5e.Classes.Ladino;
import com.example.alunos.helperrealm5e.Classes.Mago;
import com.example.alunos.helperrealm5e.Classes.Paladino;
import com.example.alunos.helperrealm5e.Racas.Anao;
import com.example.alunos.helperrealm5e.Racas.Elfo;
import com.example.alunos.helperrealm5e.Racas.Halfling;
import com.example.alunos.helperrealm5e.Racas.Humano;
import com.example.alunos.helperrealm5e.Racas.Raca;
import java.util.Random;

/**
 * Created by alunos on 18/10/17.
 */

public class Personagem {

    protected Classe classe;
    protected Raca raca;
    protected int forca;
    protected int destreza;
    protected int constituicao;
    protected int inteligencia;
    protected int sabedoria;
    protected int carisma;
    protected String nome;
    protected int vida;
    protected String racaNome;
    protected String classeNome;
    protected int lvl;

    public Personagem(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, String nome, String crasse, String race){

        if(crasse.equals("Atirador"))
            this.classe = new Atirador();
        else if(crasse.equals("Bárbaro"))
            this.classe = new Barbaro();
        else if(crasse.equals("Bardo"))
            this.classe = new Bardo();
        else if(crasse.equals("Bruxo"))
            this.classe = new Bruxo();
        else if(crasse.equals("Clérigo"))
            this.classe = new Clerigo();
        else if(crasse.equals("Druida"))
            this.classe = new Druida();
        else if(crasse.equals("Guerreiro"))
            this.classe = new Guerreiro();
        else if(crasse.equals("Ladino"))
            this.classe = new Ladino();
        else if(crasse.equals("Mago"))
            this.classe = new Mago();
        else if(crasse.equals("Paladino"))
            this.classe = new Paladino();

        if(race.equals("Anão"))
            this.raca = new Anao();
        else if(race.equals("Elfo"))
            this.raca = new Elfo();
        else if(race.equals("Halfling"))
            this.raca = new Halfling();
        else if(race.equals("Humano"))
            this.raca = new Humano();

        this.forca = forca + raca.getForca();
        this.destreza = destreza + raca.getDestreza();
        this.constituicao = constituicao + raca.getConstituicao();
        this.inteligencia = inteligencia + raca.getInteligencia();
        this.sabedoria = sabedoria + raca.getSabedoria();
        this.carisma = carisma + raca.getCarisma();
        this.nome = nome;
        this.vida = classe.getDadoVida() + this.constituicao;
        this.racaNome = raca.getNome();
        this.classeNome = classe.getNome();
        this.lvl = 1;
    }

    public Personagem(String crasse) {
        if(crasse.equals("Atirador"))
            this.classe = new Atirador();
        else if(crasse.equals("Bárbaro"))
            this.classe = new Barbaro();
        else if(crasse.equals("Bardo"))
            this.classe = new Bardo();
        else if(crasse.equals("Bruxo"))
            this.classe = new Bruxo();
        else if(crasse.equals("Clérigo"))
            this.classe = new Clerigo();
        else if(crasse.equals("Druida"))
            this.classe = new Druida();
        else if(crasse.equals("Guerreiro"))
            this.classe = new Guerreiro();
        else if(crasse.equals("Ladino"))
            this.classe = new Ladino();
        else if(crasse.equals("Mago"))
            this.classe = new Mago();
        else if(crasse.equals("Paladino"))
            this.classe = new Paladino();
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getLvl() {
        return String.valueOf(lvl);
    }
}
