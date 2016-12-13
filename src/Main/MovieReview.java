/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author knight
 */
public class MovieReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                    User usr = new User();
        usr.createUser("John Doe", "USA", "English");
//       
        Movie bea = new Movie();
//         Movie ea = new Movie();
        bea.add_new("Beauty and the Beast", "SAY NO TO MANY THINGS YES TO ONLY ONE THING THAT REALLY MATTERS. JUST FOCUS ON THAT", "USA", 2017,130);
//        ea.add_new(123, "Logan", "SAY NO TO MANY THINGS YES TO ONLY ONE THING THAT REALLY MATTERS. JUST FOCUS ON THAT", "USA", 2017,130);
//        
//        bea.view_details();
//        ea.view_details();
//        usr.addToWatchList(bea);
//        usr.addToWatchList(ea);
//        usr.viewWatchList();

        
        
    }
    
}
