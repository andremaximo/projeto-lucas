package br.com.projeto.lucas.heranca.mamifero;

public class Morcego extends Mamifero {

    public Morcego(int idade){
        super(idade);
    }

    @Override
    public void cominica(){
        System.out.println("som de morcego");
    }

    @Override
    public boolean isTemAsa(){
        return true;
    }
}

