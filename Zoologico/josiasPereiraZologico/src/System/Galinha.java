package System;

public class Galinha extends Animal implements Corredor{

    @Override
    public String correr() {
        return "Correndo" ;
    };
    @Override
    public String emitirSom() {
        return "Pó Pó Pó";
    };
}
