package System;

import java.util.ArrayList;
import java.util.List;

public class Zologico {
    public List<Animal> listJaulas = new ArrayList<>(10); 
    Animal cachorro = new Cachorro();
    Animal cavalo = new Cavalo();
    Animal cobra = new Cobra();
    Animal galinha = new Galinha();
    Animal gato = new Gato();
    Animal jacare = new Jacare();
    Animal leao = new leao();
    Animal macaco = new Macaco();
    Animal pato = new Pato();
    Animal preguica = new Preguica();


    public Zologico(){
        this.listJaulas.add(cachorro);
        this.listJaulas.add(cavalo);
        this.listJaulas.add(cobra);
        this.listJaulas.add(galinha);
        this.listJaulas.add(gato);
        this.listJaulas.add(jacare);
        this.listJaulas.add(leao);
        this.listJaulas.add(macaco);
        this.listJaulas.add(pato);
        this.listJaulas.add(preguica);
    };
    
    


}
