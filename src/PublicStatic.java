public class PublicStatic {
    static void meuMetodoStatico(){
        System.out.println("Esse método pode ser chamado sem precisar instanciar Objetos!");
    }
    public void meuMetodoPublico(){
        System.out.println("Esse método teve que criar um objeto para poder ser invocado");
    }
}