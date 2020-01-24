package br.com.sammsilva.java.io.testes;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class testScanners {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
        System.out.println("");
        System.out.println("");

        /*Separando os valores */

        Scanner scanner2 = new Scanner(new File("contas.csv"));
        while(scanner2.hasNextLine()) {
            String linha = scanner2.nextLine();
            String[] valores = linha.split("-"); //pegando itens por arrays;
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String valor1 = linhaScanner.next();
            String valor2 = linhaScanner.next();
            String valor3 = linhaScanner.next();
            String valor4 = linhaScanner.next();
            String valor5 = linhaScanner.next();
            System.out.println("valor1 = " + valor1 + " valor2 = " + valor2 + " valor3 = " + valor3 + " valor4 = " + valor4 +" valor 5 = "+ valor5);
        }
        scanner.close();

    }
}
