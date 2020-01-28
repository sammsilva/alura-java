package br.com.sammsilva.java.io.testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnidcodeEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ç";
        System.out.println(s.codePointAt(0));
        System.out.println(Charset.defaultCharset().displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.print("bytes.length  = " + bytes.length + ",  windows-1252 " );
        String result = new String(bytes, "windows-1252");
        System.out.println(result);



        bytes = s.getBytes("UTF-16");
        System.out.print("bytes.length  = " + bytes.length + " UTF-16 ");
        result =  new String(bytes, "UTF-16");
        System.out.println(result);


        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print("bytes.length  = " + bytes.length +" US_ASCII   ");
        result =  new String(bytes, "US-ASCII");
        System.out.println(result);




    }
}
