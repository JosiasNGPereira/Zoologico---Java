package Console;

import System.Animal;
import System.Cachorro;
import System.Cavalo;
import System.Corredor;
import System.Preguica;
import System.Veterinario;
import System.Zologico;



public class Console {
    
    Animal cavalo = new Cavalo();
    Animal cachorro = new Cachorro();
    Animal preguica = new Preguica();
    Zologico zologico = new Zologico();
    Veterinario veterinatio = new Veterinario();

    public void  executar(){
        System.out.println("ANIMAIS NA JAULA: ");
        for (Animal animal : zologico.listJaulas) {
           String aux =  animal.emitirSom();
           System.out.println(aux);
            if(animal instanceof Corredor){
                System.out.println(((Corredor)animal).correr());
            }
            System.out.println();
        }

        System.out.println("ANIMAIS NO VETERINARIO: ");
        System.out.println(veterinatio.examinar(this.cavalo));
        System.out.println(veterinatio.examinar(this.cachorro));
        System.out.println(veterinatio.examinar(this.preguica));
        
    };

}
