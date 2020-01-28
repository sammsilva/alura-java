package br.com.sammsilva.java.io.testes;

import br.com.bytebank.banco.modelo.Cliente;

import java.io.*;

public class TestSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
        String nome = "Samuel Silva";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OutPut.bin"));
        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Output.bin"));
        nome = (String)ois.readObject();
        ois.close();
        System.out.println(nome);

        */


        Cliente cliente = new Cliente(); //cliente precisa implementar serializable interface
        cliente.setNome("Samuel");
        cliente.setProfissao("Java Junior");
        cliente.setCpf("43878395891");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente c = (Cliente)ois.readObject();
        System.out.println( c.getNome());

    }
}
