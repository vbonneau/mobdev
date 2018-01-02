package com.example.victor.mobdev;

/**
 * Created by victor on 02/01/2018.
 */

import com.orm.SugarRecord;

public class Book extends SugarRecord{

    String titre;
    String auteur;

    public Book(){

    }

    public Book(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
    }


}
