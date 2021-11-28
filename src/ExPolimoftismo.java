import Polimorfismo.*;

public class ExPolimoftismo {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        Animal meuGato = new Gato();
        Animal meuDog = new Cachorro();
    
    meuAnimal.somAnimal();
    meuGato.somAnimal();
    meuDog.somAnimal();
    }
}
