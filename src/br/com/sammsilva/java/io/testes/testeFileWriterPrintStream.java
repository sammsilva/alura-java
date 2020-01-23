package br.com.sammsilva.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testeFileWriterPrintStream {

    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("fileWriter.txt");
        fw.write("TESTANDO FILEWRITER");
        fw.write("\r\n"); //new line
        fw.write(System.lineSeparator());
        fw.write("testando linha 3");


        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();  bw.newLine();
        bw.write("Agora testando com bw");
        bw.newLine();
        bw.newLine();
        bw.write("testando linha 2 cm bw");


        bw.close();
        fw.close();



    }

}
