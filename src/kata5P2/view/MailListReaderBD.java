package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;

public class MailListReaderBD {
    public static List<Mail> read() {
        List<Mail> emails = new ArrayList<>();
        
        // SQLite connection 
        String url = "jdbc:sqlite:KATA5.db";
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        String sql = "SELECT * FROM EMAIL";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                emails.add(new Mail(rs.getString("Mail")));
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return emails;
    }
}
