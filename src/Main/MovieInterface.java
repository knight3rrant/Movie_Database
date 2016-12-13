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
public interface MovieInterface {
   void add_new(String title, String story, String country, int year, int length);
   void view_details();
   void add_rating(int rate);
   String get_title();
}
