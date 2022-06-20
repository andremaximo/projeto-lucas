package br.com.projeto.lucas;

import br.com.projeto.lucas.heranca.*;
import br.com.projeto.lucas.heranca.ave.BemTeVi;
import br.com.projeto.lucas.heranca.ave.Sabia;
import br.com.projeto.lucas.heranca.mamifero.Cachorro;
import br.com.projeto.lucas.heranca.mamifero.Gato;
import br.com.projeto.lucas.heranca.mamifero.Morcego;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){

        System.out.println("Ola mundo.");

        List<Animal> animais = App.recuperaAnimaisDoBancoDeDados();
        System.out.println("Quantos animais tem asa: " + contaAnimaisComAsa(animais));
        System.out.println("Somatorio idade: " + getSomatorioIdades(animais));
    }



    public static int contaAnimaisComAsa(List<Animal> animais){
        int total = 0;
        for(int i = 0; i < animais.size(); i++){
            Animal animal = animais.get(i);
            if(animal.isTemAsa()){
                total++;
            }
        }
        return total;
    }

    public static int getSomatorioIdades(List<Animal> animais){
        int somatorio = 0;
        for(int i = 0; i < animais.size(); i++){
            Animal animal = animais.get(i);
            somatorio += animal.getIdade();
        }
        return somatorio;
    }



    public static List<Animal> recuperaAnimaisDoBancoDeDados(){

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro(1));
        animais.add(new Gato(11));
        animais.add(new Morcego(10));
        animais.add(new Sabia(12));
        animais.add(new BemTeVi(18));

        return animais;
    }
}
