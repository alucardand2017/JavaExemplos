import PublicVsStatic.*;

public class ExPublicStatic extends PublicStatic {
    public static void main(String[] args) {
        //PublicStatic.meuMetodoPublico(); //- NÃO CONSIGO ACESSAR DESDE QUE MUDEI A CLASSE PARA UM PACOTE
        PublicStatic objetoTipoMetodos = new PublicStatic();
        objetoTipoMetodos.meuMetodoPublico();
    }
}