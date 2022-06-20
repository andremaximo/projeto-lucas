package br.com.projeto.lucas.heranca.ave;

import br.com.projeto.lucas.heranca.ave.Ave;

public class Sabia extends Ave {

    public Sabia(int idade){
        super(idade);
    }

    @Override
    public void cominica(){
        System.out.println("canta sabia");
    }
}
