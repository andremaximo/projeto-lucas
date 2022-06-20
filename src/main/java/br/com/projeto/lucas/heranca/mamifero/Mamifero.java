package br.com.projeto.lucas.heranca.mamifero;

import br.com.projeto.lucas.heranca.Animal;

public abstract class Mamifero extends Animal {

    public Mamifero(int idade){
        super(idade);
    }

    @Override
    public boolean isTemAsa(){
        return false;
    }
}
