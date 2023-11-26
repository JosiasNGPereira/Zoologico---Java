package System;

public class Cachorro extends Animal implements Corredor {
  
    


    @Override
    public String emitirSom() {
        return "AU AU AU";
    }

    @Override
    public String correr() {
        return "Correndo" ;
    };
}
