/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author knight
 */
public class Movie implements MovieInterface {

    private int ID,
            year,
            length,
            rating;
    private String title,
            country,
            story;
    Database db;
    
    Movie(){
        rating = 0;
        db = new Database();
    }
    
    @Override
    public void add_new(String title, String story, String country, int year, int length) {
        this.title = title;
        this.story = story;
        this.country = country;
        this.year = year;
        this.length = length;
        db.AddMovie(title,story,country,year,length);
        
    }

    public void view_details() {
        System.out.printf("Title: %s\nStory: %s\nCountry: %s\nYear: %d\nRating: %d\nLength: %d\n", title, story, country, year,rating,length);
    }

    @Override
    public String get_title() {
        return title;
    }

    @Override
    public void add_rating(int rate) {
        rating = rate;
    }

}
