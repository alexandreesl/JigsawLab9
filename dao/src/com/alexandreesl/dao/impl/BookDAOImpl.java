package com.alexandreesl.dao.impl;

import com.alexandreesl.dao.interfaces.IBookDAO;
import com.alexandreesl.model.Book;

public class BookDAOImpl implements IBookDAO {
    @Override
    public void create(Book book) {

        System.out.println("INSERTED THE BOOK!");

    }

    @Override
    public void update(Book book) {

        System.out.println("UPDATED THE BOOK!");

    }

    @Override
    public Book find(Long id) {

        Book book = new Book();
        book.setId(id);
        book.setName("Elasticsearch: Consuming real-time data with ELK");
        book.setAuthor("Alexandre Eleutério Santos Lourenço");

        return book;
    }


}
