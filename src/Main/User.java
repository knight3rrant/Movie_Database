/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author knight
 */
public class User implements UserInterface {

    private int    ID;
    private String name,
                   country,
                   language;
    private ArrayList<Movie> movie = new ArrayList();
    Database db;

    public User() {
        name = country = language = "";
        db= new Database();
    }

    @Override
    public void createUser(String name, String country, String language) {
        this.name = name;
        this.country = country;
        this.language = language;
        db.AddUser(name,country,language);
        
    }

    @Override
    public void addToWatchList(Movie m) {
        movie.add(m);

    }

    @Override
    public void removeFromWatchList(Movie m) {
        movie.remove(m);
    }

    @Override
    public void viewWatchList() {
        System.out.println("Watch List");
        for (Movie m : movie) {
            System.out.println("#" + m.get_title());
        }

    }

}
