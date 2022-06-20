package br.com.projeto.lucas.heranca.mamifero;

public class Cachorro extends Mamifero {

    public Cachorro(int idade){
        super(idade);
    }

    @Override
    public void cominica(){
        System.out.println("au au");
    }
}
