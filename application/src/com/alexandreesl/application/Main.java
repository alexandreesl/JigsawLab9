package com.alexandreesl.application;

import com.alexandreesl.model.Book;
import com.alexandreesl.service.BookService;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();

        book.setAuthor("Stephen King");
        book.setId(1l);
        book.setName("IT - The thing");

        BookService service = new BookService();

        service.create(book);

        book.setName("IT");

        service.update(book);

        Book searchedBook = service.find(2l);

        System.out.println(searchedBook.getName());
        System.out.println(searchedBook.getAuthor());


    }

}
