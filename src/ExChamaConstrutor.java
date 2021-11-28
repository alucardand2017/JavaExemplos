import Construtor.ExConstrutorCarros;

public class ExChamaConstrutor {
    
    public static void main(String[] args) {
    
        ExConstrutorCarros meuCarro = new ExConstrutorCarros(250, "Fox", "2014", "Branco", 123456789);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.ano);
        System.out.println(meuCarro.cor);
        System.out.println(meuCarro.velMaxima);
        System.out.println(meuCarro.chassis);
    }
}
