package org.java.lessons.javacalcio;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Persona {
    //BONUS: nella classe Persona, al posto dell’età, memorizzare la data di nascita
    //ATTRIBUTI
    Random random = new Random();
    private String nome;
    private int eta;
    //COSTRUTTORI

    public Persona(String nome, int randomEta) {
        this.nome = nome;
        this.eta = eta;
    }

    //GETTER e SETTER
        //Getters
        public Random getRandom() {
            return random;
        }

        public String getNome() {
            return nome;
        }

        public int getEta() {
            return eta;
        }

        public void setEta(int eta) {
            this.eta = eta;
        }

        public void setNome(String nome) {
                this.nome = nome;

        }
    //METODI


    @Override
    public String toString() {
        return "Persona{" +
                "random=" + random +
                ", nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
