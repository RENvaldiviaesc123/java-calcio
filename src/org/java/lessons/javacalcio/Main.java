package org.java.lessons.javacalcio;
import java.time.LocalDate;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    /*
    Creare infine una classe Main e definire al suo interno un array di nomi e un array con i possibili ruoli per i giocatori.
    Nel metodo main, generare una Squadra formata da 11 giocatori creati in modo randomico:
    prelevare un nome casuale dall’array di nomi
    generare l’età in modo casuale
    prelevare un ruolo casuale dall’array di possibili ruoli
     */
    public static void main(String[] args) {
        Random random = new Random();

        int randomEta = random.nextInt(18, 42);

        String[] ruoliGiocatori  = {"Portiere", "Diffensore", "Centrocampista", "Attacante", "Capitano"};



    }
}
