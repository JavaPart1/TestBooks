package be.vdab.apps;

import be.vdab.model.Author;
import be.vdab.model.Book;

public class BookApp {
    public static void main(String[] args) {
        // maak auteur
        Author auteur = new Author("Veerle Van Belle","email vn Veeerle",'v');
        // maak book
        Book boek = new Book("Mooi Boek",auteur,27.95);
        // toon gegevens
        System.out.println(boek);
        // getters & setters
        auteur.setGender('p');
        System.out.println(auteur);
        boek.setName("Slecht boek");
        System.out.println(boek);
        auteur.setName(auteur.getName()+"tjes");
        System.out.println(auteur);
    }
}
