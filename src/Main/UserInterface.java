package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knight
 */
public interface UserInterface {
    void createUser(String name,String country,String language);
    void addToWatchList(Movie movie);
    void removeFromWatchList(Movie movie);
    void viewWatchList();
    
}
