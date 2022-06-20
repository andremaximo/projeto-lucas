package br.com.projeto.lucas.heranca;

public abstract class Animal {

    private int idade;

    public Animal(int idade){
        this.idade = idade;
    }

    public abstract void cominica();

    public abstract boolean isTemAsa();

    public boolean isSerVivo(){
        return true;
    }

    public int getIdade(){
        return idade;
    }
}
