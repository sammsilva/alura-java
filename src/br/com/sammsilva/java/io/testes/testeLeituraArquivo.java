package br.com.sammsilva.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class testeLeituraArquivo {


    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com arquivo // retorna binario // precisamos de outra classe para tratar os dados recebidos
        FileInputStream fis = new FileInputStream("lorem.txt");
        //Essa classe recebe o fluxo de entrada, mas ainda le apenas character por character
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
        System.out.println("linha = " + linha);
        br.close();
    }
}

