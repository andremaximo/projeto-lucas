package br.com.projeto.lucas.heranca.ave;

import br.com.projeto.lucas.heranca.ave.Ave;

public class BemTeVi extends Ave {

    public BemTeVi(int idade){
        super(idade);
    }

    @Override
    public void cominica(){
        System.out.println("canta bem ti vi");
    }
}
