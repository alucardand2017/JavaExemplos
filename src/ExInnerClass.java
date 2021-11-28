
public class ExInnerClass {
    public static void main(String[] args) {
        ClasseDeFora minhaFora = new ClasseDeFora();
        ClasseDeFora.ClasseDeDentro minhaDentro = minhaFora.new ClasseDeDentro();
        ClasseDeFora.ClasseStaticDentro minhaDentro2 = new ClasseDeFora.ClasseStaticDentro();
        System.out.println(minhaFora.x + minhaDentro.y + minhaDentro2.w);
    }
    /*
    public static void main(String[] args) {
        ClasseDeFora.ClasseStaticDentro minhaDentro2 = new ClasseDeFora.ClasseStaticDentro();
        System.out.println(minhaDentro2.w);
    }*/
}
