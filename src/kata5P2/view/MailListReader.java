package kata5P2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String filename) {
        List<Mail> emails = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            while (true) {
                String line = reader.readLine();
                if(line == null) break;
                if (Mail.isMail(line)){
                    emails.add(new Mail(line));
                }
            }
        } 
        catch (FileNotFoundException exception) {
            System.out.println("ERROR CurrencyLoaderArchive::loadAllCurrencies FileNotFoundException, " + exception.getLocalizedMessage());
        } catch (IOException ex) {
            System.out.println("ERROR CurrencyLoaderArchive::loadAllCurrencies IOException, " + ex.getLocalizedMessage());
        }
        
        
        return emails;
    }
    
}
