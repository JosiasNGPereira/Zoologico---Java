package System;

public class Cavalo extends Animal implements Corredor {

    @Override
    public String correr() {
        return "Correndo" ;
    };

    @Override
    public String emitirSom() {
        return "Hiin in in";
    };
}
