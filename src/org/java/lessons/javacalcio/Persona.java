package org.java.lessons.javacalcio;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Persona {
    //BONUS: nella classe Persona, al posto dell’età, memorizzare la data di nascita
    //ATTRIBUTI
    Random random = new Random();
    private String nome;
    private int randomEta = random.nextInt(18, 42);
    //COSTRUTTORI

    public Persona(String nome, int randomEta) {
        this.nome = nome;
        this.randomEta = randomEta;
    }

    //GETTER e SETTER

    //METODI

}
