package org.java.lessons.javacalcio;

public class Allenatore extends Persona{
    //La strategia può essere diffensiva oppure offensiva
    //ATTRIBUTI
    private String strategia;

    //COSTRUTTORI
        public Allenatore(String nome, int eta, String strategia) {
            super(nome, eta);
            this.strategia = strategia;
        }


    //GETTER e SETTER
        //Getters
        public String getStrategia() {
            return strategia;
        }


    //METODI

    @Override
    public String toString() {
        return super.toString() + "Allenatore{" +
                "strategia='" + strategia + '\'' +
                "} ";
    }
}
