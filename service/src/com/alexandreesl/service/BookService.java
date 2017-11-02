package com.alexandreesl.service;

import com.alexandreesl.dao.interfaces.BookDAOFactory;
import com.alexandreesl.dao.interfaces.IBookDAO;
import com.alexandreesl.model.Book;

public class BookService {

    private IBookDAO bookDAO;

    public BookService() {

        bookDAO = BookDAOFactory.getBookDAO();

    }

    public void create(Book book) {
        bookDAO.create(book);
    }

    public void update(Book book) {
        bookDAO.update(book);
    }

    public Book find(Long id) {
        return bookDAO.find(id);
    }


}
