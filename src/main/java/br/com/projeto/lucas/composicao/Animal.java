package br.com.projeto.lucas.composicao;

import br.com.projeto.lucas.composicao.skill.Skill;
import br.com.projeto.lucas.composicao.som.Comunicacao;

import java.util.List;

public abstract class Animal {

    private int idade;

    List<Comunicacao> comunicacaoList;

    List<Skill> skills;

    public Animal(int idade, List<Comunicacao> comunicacaoList, List<Skill> skills){
        this.idade = idade;
        this.comunicacaoList = comunicacaoList;
        this.skills = skills;
    }

    public boolean isSerVivo(){
        return true;
    }

    public int getIdade(){
        return idade;
    }

    public List<Comunicacao> getComunicacaoList() {
        return comunicacaoList;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
