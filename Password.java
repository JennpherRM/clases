public class Password 
    {

    private String Logitud;
    private String Password;

    public String getLogitud() {
        return Logitud;
    }

    public String getPassword() {
        return Password;
    }

    public void setLogitud(String Logitud) {
        this.Logitud = Logitud;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean esFuerte(){
      return Password.length()>=8;
    }

    /*
    public boolean esFuerte() {
      ;
    }
    
    
    
    */
}
   