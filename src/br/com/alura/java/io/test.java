package br.com.alura.java.io;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        System.out.println(linha);

        br.close();
    }
}
