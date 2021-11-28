import Heranca.*;
import java.util.Scanner;

public class ExHeranca extends Vehicle {
    public static void main(String[] args) {
        Vehicle meuCarro = new Vehicle();
        meuCarro.ano = "2014";
        meuCarro.cor = "Branco";
        meuCarro.marca = "VolksWagem";
        meuCarro.modelo = "Fox";
        meuCarro.potenciaCV = 1.6f;
        Scanner teclado = new Scanner(System.in);
        int respostaMenuAuxiliar = 1;
        int respostaMenuPrincipal = 1;
        do{
            System.out.println("Escolha o menu desejado: \n 0 - Sair do Programa \n 1 - Caracteristica \n 2 - Ação");
            respostaMenuPrincipal = teclado.nextInt();
            if(respostaMenuPrincipal == 1){
                do {
                    System.out.println("ESCOLHA A CARACTERISTICA DESEJADA: \n 0 - Sair desse menu \n 1 - Marca \n 2 - Modelo \n 3 - Ano \n 4 - Cor \n 5 - Potencia \n Escolha: ");
                    respostaMenuAuxiliar = teclado.nextInt();
                    switch(respostaMenuAuxiliar){
                        case 0:
                            respostaMenuAuxiliar = 0;
                            break;   
                        case 1:
                            System.out.println(meuCarro.marca);
                            break;                    
                        case 2:
                            System.out.println(meuCarro.modelo);
                            break;
                        case 3:
                            System.out.println(meuCarro.ano);
                            break;
                        case 4:
                            System.out.println(meuCarro.cor);
                            break;
                        case 5:
                        System.out.println(meuCarro.potenciaCV);
                            break;
                    }      
                } while (respostaMenuAuxiliar != 0);
            }
            else if (respostaMenuPrincipal == 2){
                do {
                    System.out.println("ESCOLHA A AÇÃO DESEJADA: \n 0 - Sair desse menu \n 1 - Acelerar \n 2 - Frear \n 3 - Virar a Direita \n 4 - Virar a Esquerda \n 5 - Marcha Ré \n Escolha: ");
                    respostaMenuAuxiliar = teclado.nextInt();
                    switch(respostaMenuAuxiliar){
                        case 0:
                            respostaMenuAuxiliar = 0;
                            break;
                        case 1:
                            meuCarro.acelerar();
                            break;
                        case 2:
                            meuCarro.frear();
                            break;
                        case 3:
                            meuCarro.virarDireita();
                            break;
                        case 4:
                            meuCarro.virarEsquerda();
                            break;
                        case 5:
                            meuCarro.marchaRe();
                            break;
                    }      
                } while (respostaMenuAuxiliar != 0);
            }
            else {
                respostaMenuPrincipal = 0;
            }
        } while(respostaMenuPrincipal != 0);
        teclado.close();
    }
}
