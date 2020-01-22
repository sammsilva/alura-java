package br.com.sammsilva.java.io.testes;

import java.io.*;

public class testeLeituraArquivo {


    public static void main(String[] args) throws IOException {
        /**
         * ENTRADA E LEITURA DE ARQUIVOS
         * */
        //Fluxo de Entrada com arquivo // retorna binario // precisamos de outra classe para tratar os dados recebidos
        InputStream fis = new FileInputStream("lorem.txt");
        //Essa classe recebe o fluxo de entrada, mas ainda le apenas character por character
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

        /**
         * SAIDA E ESCRITA DE ARQUIVOS
         **/

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osr);
        bw.write("testando escrita no arquivo");
        bw.newLine();
        bw.newLine();
        bw.write("testando escrita no arquivo 2");
        bw.close();


        /**
         * Ler teclado e guardar no arquivo lorem3.txt
         * */

        InputStream is = System.in;
        Reader ris = new InputStreamReader(is);
        BufferedReader brs = new BufferedReader(ris);

        OutputStream os = new FileOutputStream("lorem3.txt");
        Writer wos = new OutputStreamWriter(os);
        BufferedWriter bws = new BufferedWriter(wos);

        String newLine = brs.readLine();
        //System.out.println("newLine = " + newLine);

        while(newLine!= null && !newLine.isEmpty()) {
            bws.write(newLine);
            bws.newLine();
            bws.flush();
            newLine = brs.readLine();
        }

        System.out.println("fechando arquivo...");
        bws.close();
        brs.close();

    }
}

