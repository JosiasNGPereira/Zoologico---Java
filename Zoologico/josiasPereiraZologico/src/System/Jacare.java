package System;

public class Jacare extends Animal implements Corredor{


    @Override
    public String correr() {
        return "Correndo" ;
    };
    @Override
    public String emitirSom() {
        return "Som de jacare";
    };
}
