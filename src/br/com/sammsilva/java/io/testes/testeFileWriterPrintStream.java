package br.com.sammsilva.java.io.testes;

import java.io.*;

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


        PrintStream ps = new PrintStream("PrintStream.txt");
        ps.println("Testando printstream");
        ps.println();
        ps.println();
        ps.println("testando segunda linha do printstream");

        PrintWriter pw = new PrintWriter("PrintWriter.txt");
        pw.println("Testando printwriter");
        pw.println();
        pw.println("Testando printwriter 2");


        pw.close();
        ps.close();
        bw.close();
        fw.close();



    }

}
