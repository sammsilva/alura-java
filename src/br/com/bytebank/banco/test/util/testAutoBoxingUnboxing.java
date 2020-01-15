package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class testAutoBoxingUnboxing {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; // tipo primitivo, nao referencia
        Integer idadeRef = new Integer(idade);
        Integer idadeRef2 = Integer.valueOf(20);

        int primitivo = idadeRef2.intValue();


        List<Integer> numeros = new ArrayList<Integer>(); // list so sabe guardar referencia;

        numeros.add(idade); // nao deveria funcionar pq list nao deveria receber primitivo, so what?;

        //pra cada tipo primitivo, existe uma classe ---------> AUTOBOXING;
        // da classe para o tipo primitivo -------------------> Unboxing;





    }
}
