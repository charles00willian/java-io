package br.com.alura.java.io;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Cliente cliente = new Cliente();
//        cliente.setNome("Charles Willian");
//        cliente.setProfissao("Suporte Júnior");
//        cliente.setCpf("70163494622");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente nome = (Cliente) ois.readObject();
        ois.close();
        System.out.println(nome.getNome());
    }
}
