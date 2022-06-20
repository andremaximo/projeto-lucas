package br.com.projeto.lucas.composicao.ave;

import br.com.projeto.lucas.composicao.Animal;
import br.com.projeto.lucas.composicao.skill.Skill;
import br.com.projeto.lucas.composicao.som.Comunicacao;

import java.util.List;

public class Sabia extends Animal {

    public Sabia(final int idade, final List<Comunicacao> comunicacaoList, final List<Skill> skills) {
        super(idade, comunicacaoList, skills);
    }
}
