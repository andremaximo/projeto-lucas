package br.com.projeto.lucas.heranca.mamifero;

public class Gato extends Mamifero {

    public Gato(int idade){
        super(idade);
    }

    @Override
    public void cominica(){
        System.out.println("miauuuuuuu");
    }
}
