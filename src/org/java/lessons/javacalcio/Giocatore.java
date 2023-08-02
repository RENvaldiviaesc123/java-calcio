package org.java.lessons.javacalcio;

public class Giocatore extends Persona{
    //ATTRIBUTI
    private String ruoli;
    //COSTRUTTORI

    public Giocatore(String nome, int randomEta, String ruoli) {
        super(nome, randomEta);
        this.ruoli = ruoli;
    }
    //GETTER e SETTER
        //GETTERS
        public String getRuoli() {
            return ruoli;
        }


    //METODI

    @Override
    public String toString() {
        return super.toString() + " Giocatore{" +
                "ruoli='" + ruoli + '\'' +
                "} ";
    }
}
