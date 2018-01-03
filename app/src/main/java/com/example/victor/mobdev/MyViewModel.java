package com.example.victor.mobdev;

import android.content.Context;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import java.util.List;
import java.util.Observable;

import static java.security.AccessController.getContext;

/**
 * Created by victor on 04/12/2017.
 */

public class MyViewModel {
    public static int actualIndex=0;
    public ObservableField<String> auteur = new ObservableField<>();
    public ObservableField<String> titre = new ObservableField<>();
    public List<Book> books;
    public Context ctx;

    public MyViewModel(Context ctx){
        this.ctx=ctx;
        books=Book.listAll(Book.class);
        System.out.println("books");
        System.out.println(books.size());
        System.out.println("books2");
        if(books.size()>0) {
            auteur.set(books.get(actualIndex).auteur);
            titre.set(books.get(actualIndex).titre);
        }else {
            auteur.set("");
            titre.set("");
        }

    }


    public void onClikDelete(){
        if(books.size()>0) {
            books.get(actualIndex).delete();
            books = Book.listAll(Book.class);
            if (actualIndex > 0) actualIndex--;
            if (books.size() > 0) {
                auteur.set(books.get(actualIndex).auteur);
                titre.set(books.get(actualIndex).titre);
            } else {
                auteur.set("");
                titre.set("");
            }
        }
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

        Book book=new Book(titre.get(),auteur.get());
        book.save();
        books=Book.listAll(Book.class);
        CharSequence text = "le livre a été ajouté";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(ctx, text, duration);
        toast.show();
    }


    public  void onClikChange(){
        if (books.size()>0) {
            Book book = books.get(actualIndex);
            book.auteur = auteur.get();
            book.titre = titre.get();
            book.save();
            CharSequence text = "les information on été modifié";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(ctx, text, duration);
            toast.show();
        }
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
            auteur.set(editable.toString());

        }
    };

    public TextWatcher watcherTitre = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {

            titre.set(editable.toString());

        }
    };



}