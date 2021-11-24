public class ExMetodo {
  public static void main(String[] args) {
    chamarImpressao(); //1
    metodoSemRetorno(); //2
    System.out.println("\n Esse método passou o parâmetro " + metodoComRetorno()); //3
    metodoVazioPassandoParametro(3000); //4
    String j = "Jacaré";
    System.out.println("\n Esse método passou o parâmetro = "+ j + ", e recebeu como retorno o valor = " + metodoComRetornoPassandoParametro(j)); //5
    System.out.println(soma(10)); //6
    System.out.println( sobreEscrita(10) + " -> int ; " + sobreEscrita(10.1) + " -> float ; " + sobreEscrita(10.1 , 10.2) + " -> double, double ; "); //7
  }
  public static void chamarImpressao(){ //1
    System.out.println(" \n Estou imprimindo a partir de um método fora do main!");
  }
  public static void metodoSemRetorno() { //2
    System.out.println(" \n Esse método não retornou nada!");
  }
  public static String metodoComRetorno(){ //3
    String frase = "TROCA_FRALDA!";
    return frase;
  }
  public static void metodoVazioPassandoParametro(int i){ //4
    System.out.println(" \n Esse método passou o parametro int " + i );
  }
  public static String metodoComRetornoPassandoParametro(String bicho){ //5
    if(bicho == "Jacaré") {
      return "reptil";
    }
    else {
      return "nao passou bicho nenhum";
    }
  }
  public static int soma(int k) { //6
    if(k>0) {
      System.out.println(k + " + " );
      return k + soma(k - 1);
    }
    else {
      System.out.println(k);
      return 0;
    }
  }
  public static int sobreEscrita(int x){ //7
    return x + x;
  }
  public static double sobreEscrita(double x){ //7
    return x + x;
  }
  public static double sobreEscrita(double d, double e){ //7
    return d+e;
  }

}
  