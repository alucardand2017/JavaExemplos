package Heranca;
public class Vehicle {
    public String modelo;
    public String ano;
    public String marca;
    public String cor;
    public float potenciaCV;



    public void acelerar(){
        System.out.println("\n\n\n\nO CARRO ESTÁ ACELERANDO!");
    }
    public void frear(){
        System.out.println("\n\n\n\nO CARRO ESTÁ FREANDO!");
    }
    public void virarDireita(){
        System.out.println("\n\n\n\nO CARRO ESTÁ VIRANDO A DIREITA!");
    }
    public void virarEsquerda(){
        System.out.println("\n\n\n\nO CARRO ESTÁ VIRANDO A ESQUERDA!");
    }
    public void marchaRe(){
        System.out.println("\n\n\n\nO CARRO ESTÁ DANDO MARCHA RÉ!");
    }
}
