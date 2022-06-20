package br.com.projeto.lucas.heranca.ave;

import br.com.projeto.lucas.heranca.Animal;

public abstract class Ave extends Animal {

    public Ave(int idade){
        super(idade);
    }

    @Override
    public boolean isTemAsa(){
        return true;
    }
}
