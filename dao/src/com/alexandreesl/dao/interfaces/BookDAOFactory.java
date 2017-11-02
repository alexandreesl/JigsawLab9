package com.alexandreesl.dao.interfaces;

import com.alexandreesl.dao.impl.BookDAOImpl;

public class BookDAOFactory {

    public static IBookDAO getBookDAO() {

        return new BookDAOImpl();

    }

}
