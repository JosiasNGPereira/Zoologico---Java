package System;

public class Pato extends Animal implements Corredor{

    @Override
    public String correr() {
        return "Correndo" ;
    };
    @Override
    public String emitirSom() {
        return "Quá Quá Quá";
    };
}
