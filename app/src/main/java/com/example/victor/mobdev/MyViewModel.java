package com.example.victor.mobdev;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.List;
import java.util.Observable;

/**
 * Created by victor on 04/12/2017.
 */
//il faut ajoujer un ORM
public class MyViewModel {
    public int actualIndex=0;
    public ObservableField<String> auteur = new ObservableField<>();
    public ObservableField<String> titre = new ObservableField<>();
    public List<Book> books;

    public MyViewModel(){
        books=Book.listAll(Book.class);
        System.out.println("books");
        System.out.println(books);
        System.out.println("books2");
        //auteur.set(books.get(actualIndex).auteur);
        //titre.set(books.get(actualIndex).titre);

    }

    /*public void onClick(){

        enableIncrement=!enableIncrement;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (enableIncrement){
                    buttonLabel.set("Stop");
                    counter.set(counter.get()+1);
                    try { Thread.sleep(500); } catch (Exception e){}
                }

                buttonLabel.set("Increment!");
            }

        }).start();
    }*/

    public void onClikDelete(){
        books.get(actualIndex).delete();
        books=Book.listAll(Book.class);
        actualIndex--;
        auteur.set(books.get(actualIndex).auteur);
        titre.set(books.get(actualIndex).titre);
    }

    public void onClikSuiv(){
       if (actualIndex<books.size()-1)actualIndex++;
        System.out.println("index "+actualIndex);
        auteur.set(books.get(actualIndex).auteur);
        titre.set(books.get(actualIndex).titre);
    }

    public void onClikPrec(){
        if (actualIndex>0)actualIndex=actualIndex-1;
        System.out.println("index "+actualIndex);
        auteur.set(books.get(actualIndex).auteur);
        titre.set(books.get(actualIndex).titre);
    }

    public void onClikAdd(){
        Book book=new Book(auteur.get(),titre.get());
        book.save();
        books=Book.listAll(Book.class);
    }

    public  void onClikChange(){

        books.get(actualIndex).auteur=auteur.get();
        books.get(actualIndex).titre=titre.get();
    }

    public TextWatcher watcherAuteur = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            //auteur.set(editable.toString());
            //titre.set(editable.toString());
            Book book= new Book(editable.toString(),editable.toString());
            System.out.println("not saved"+book.auteur);
            book.save();
        }
    };



}