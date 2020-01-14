package source;
import guis.MainMenu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        Data.setup();
        Data root = Data.getInstance();
        
        Runtime.getRuntime().addShutdownHook(new Thread() {            
            public void run() {                
                try {       
                    root.saveUsers();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        });
        
        new MainMenu().setVisible(true);
    }
}
