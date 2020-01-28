package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {




    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // autoboxing;
        System.out.println(idadeRef.doubleValue()); //unboxing

        Double dRef = Double.valueOf(23);
        System.out.println("dRef.doubleValue() = " + dRef.doubleValue());


        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        List<Number> lista = new ArrayList<>();




    }
}
