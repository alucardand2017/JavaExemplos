import Modificadores.*;

public class ExSecond extends ExModificadores{
    public static void  main(String[] args) {
        
        ExModificadores meeuModificador = new ExModificadores();
        
       // System.out.println("Variável que está no varProtected = " + meeuModificador.varProtected );
        
        System.out.println("Variável que está no varPublic = " + meeuModificador.varPublica);
        
        //System.out.println("Variável que está no varDefault = " + meeuModificador.varDefault );
        
        System.out.println("Variável que está no varPrivada = " + meeuModificador.getVarPrivada());

        
        //GERA ERRO NO CODIGO PQ A VARIAVEL É PRIVADA
        //System.out.println("Variável que está no varPrivada = " + meeuModificador.varPrivada);
    }
}
