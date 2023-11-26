package System;

public class Gato extends Animal implements Corredor{


    @Override
    public String correr() {
        return "Correndo" ;
    };
    @Override
    public String emitirSom() {
        return "MIAU MIAU";
    };
    
}
