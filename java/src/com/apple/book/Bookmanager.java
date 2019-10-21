package com.apple.book;

import com.apple.book.Dictrionary;

public class Bookmanager {
    public static void main(String[] args){
        // Dictrionary dictrionary = new Dictrionary();
        //dictrionary.getBookId();
        //int pages = dictrionary.pages;
        book book = new book(  "IBN001",  "test",  90);
        System.out.println(book.toString());
        Dictrionary dictrionary = new Dictrionary("IBN001",  "test",  90,6);
        System.out.println(dictrionary,toString());
        System.out.println(dictrionary.getBookId());
    }
}
