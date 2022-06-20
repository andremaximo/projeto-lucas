package br.com.projeto.lucas;

import br.com.projeto.lucas.composicao.FabricaDeAnimais;
import br.com.projeto.lucas.composicao.mamifero.Cachorro;
import br.com.projeto.lucas.composicao.skill.Skill;
import br.com.projeto.lucas.composicao.som.Comunicacao;

import java.util.Comparator;

public class AppComposicao {

    public static void main(String[] args){

        Cachorro cachorro = FabricaDeAnimais.getCachorroMansoEMudo(10);

        System.out.println("Qual idade desse animal: " + cachorro.getIdade());
        System.out.println("Quais são suas skills");
        for(Skill skill: cachorro.getSkills()){
            System.out.println("S: " + skill.executaSkill());
        }
        System.out.println("Como ele se comunica");
        for(Comunicacao comunicacao: cachorro.getComunicacaoList()){
            System.out.println("C: " + comunicacao.comunica());
        }
    }
}
