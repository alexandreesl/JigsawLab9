package com.alexandreesl.dao;

import com.alexandreesl.dao.impl.BookDAOImpl;

public class BookDAOFactory {

    public static IBookDAO getBookDAO() {

        return new BookDAOImpl();

    }

}
