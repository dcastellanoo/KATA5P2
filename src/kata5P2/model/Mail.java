package kata5P2.model;

public class Mail {

    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }
}
