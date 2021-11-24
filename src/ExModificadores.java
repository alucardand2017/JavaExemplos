public class ExModificadores {
    
    public String varPublica = "todo mundo pode me acessar.";
    
    private String varPrivada = "não conseguimos acessar facilmente.";
    
    protected String varProtected = "Apenas subclasses podem me ver.";
    
    String varDefault = "Ela é acessada por meio do mesmo pacote";  

    public String getVarPrivada(){
        return varPrivada;
    }
    public void setVarPrivada( String value){
        this.varPrivada = value;
    }
}
