package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main{


    public static void main(String[] args) {
        Cantante c = new Cantante("CapoPlaza","NextGen","italiano");
        Scrittore s = new Scrittore();
        s.Salvataggio(c);

        try (BufferedReader br = new BufferedReader(new FileReader("music.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("errore nel leggere il file");
        }

    }
}