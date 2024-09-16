package main;

import implementations.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {

        AnalyseurTexte analyseurTexte = new AnalyseurTexte();

        analyseurTexte.addObserver(new BelgiqueObserver());
        analyseurTexte.addObserver(new LigneObserver());
        analyseurTexte.addObserver(new MotObserver());
        analyseurTexte.addObserver(new PalindromeObserver());

        BufferedReader bf = null;
        String line;

        try {
            bf = new BufferedReader(new FileReader("./resources/file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error during file opening");
        }

        analyseurTexte.readObservers(bf);

        bf.close();
    }
}
