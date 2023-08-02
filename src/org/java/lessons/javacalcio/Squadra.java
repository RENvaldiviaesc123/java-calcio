package org.java.lessons.javacalcio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Squadra {
    //Definire una classe Squadra che contiene una lista di oggetti di tipo Giocatore e un Allenatore.
    //ATTRIBUTI
        private List<Giocatore> calciatori;
        Allenatore coach;


    //COSTRUTTORI

    public Squadra() {
        calciatori = new ArrayList<>();
    }

    public Squadra(List<Giocatore> calciatori, Allenatore coach) {
        this.calciatori = calciatori;
        this.coach = coach;
    }



    //GETTER e SETTER

    //METODI

}
