package kata5P2;

import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;


public class KATA5P2 {
    private static String filename;
    private static List<Mail> mailList; 
    private static Histogram<String> histogram;
    
    public static void main(String[] args) {
        execute();
    }
    
    public static void execute(){
        input();
        process();
        output();
    }

    private static void input() {
        filename = "email.txt";
        mailList = MailListReader.read(filename);
    }

    private static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        HistogramDisplay histo = new HistogramDisplay("Histograma", histogram);
        histo.execute();
    }
    
}