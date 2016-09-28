package com.example.meghan.simplelisttaptimer;

/**
 * Created by Meghan on 9/25/2016.
 */

//import java.util.Timer; //hopefully adds time to the list item. nope
import java.util.SimpleTimeZone;
import java.util.Date;

public class timePlus {

    String text; //Add string test to class timeAdd function
    Date created; //The Timer

    public timePlus(String text) {
        this.text = text;
        this.created = new Date();   //Should be right of the List text now
    }

    public Date getCreated(){
        return created; //Sending back to MainActivity
    }

    public String getText() {
        return text; //Sending back to MainActivity
    }

}
