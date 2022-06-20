package br.com.projeto.lucas.composicao;

import br.com.projeto.lucas.composicao.mamifero.Cachorro;
import br.com.projeto.lucas.composicao.skill.*;
import br.com.projeto.lucas.composicao.som.AuAu;
import br.com.projeto.lucas.composicao.som.CantaSabia;
import br.com.projeto.lucas.composicao.som.Chora;
import br.com.projeto.lucas.composicao.som.Comunicacao;


import java.util.ArrayList;
import java.util.List;

public class FabricaDeAnimais {

    public Cachorro getCachorroN(Integer idade){

        List<Skill> skillList = new ArrayList<>();
        skillList.add(new Ataca());
        skillList.add(new Foge());
        skillList.add(new Lambe());
        skillList.add(new Rola());

        List<Comunicacao> comunicacaoList = new ArrayList<>();
        comunicacaoList.add(new Chora());
        comunicacaoList.add(new AuAu());

        return new Cachorro(idade, comunicacaoList, skillList);
    }

    public static Cachorro getCachorro(Integer idade){

        List<Skill> skillList = new ArrayList<>();
        skillList.add(new Ataca());
        skillList.add(new Foge());
        skillList.add(new Lambe());
        skillList.add(new Rola());

        List<Comunicacao> comunicacaoList = new ArrayList<>();
        comunicacaoList.add(new Chora());
        comunicacaoList.add(new AuAu());

        return new Cachorro(idade, comunicacaoList, skillList);
    }

    public static Cachorro getCachorroManso(Integer idade){

        List<Skill> skillList = new ArrayList<>();
        skillList.add(new Foge());
        skillList.add(new Lambe());
        skillList.add(new Rola());

        List<Comunicacao> comunicacaoList = new ArrayList<>();
        comunicacaoList.add(new Chora());
        comunicacaoList.add(new AuAu());

        return new Cachorro(idade, comunicacaoList, skillList);
    }

    public static Cachorro getCachorroMansoEMudo(Integer idade){

        List<Skill> skillList = new ArrayList<>();
        skillList.add(new Foge());
        skillList.add(new Lambe());
        skillList.add(new Rola());

        List<Comunicacao> comunicacaoList = new ArrayList<>();

        return new Cachorro(idade, comunicacaoList, skillList);
    }

    public static Cachorro getSabia(Integer idade){

        List<Skill> skillList = new ArrayList<>();
        skillList.add(new Voa());

        List<Comunicacao> comunicacaoList = new ArrayList<>();
        comunicacaoList.add(new CantaSabia());

        return new Cachorro(idade, comunicacaoList, skillList);
    }


}
