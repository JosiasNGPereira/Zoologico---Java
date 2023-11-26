package System;

public class leao extends Animal implements Corredor{


    @Override
    public String correr() {
        return "Correndo" ;
    };
    @Override
    public String emitirSom() {
        return "AAAHHHUUUUU";
    };
}
