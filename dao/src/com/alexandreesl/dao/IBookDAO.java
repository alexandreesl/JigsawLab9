package com.alexandreesl.dao;

import com.alexandreesl.model.Book;

public interface IBookDAO {

    void create(Book book);

    void update(Book book);

    Book find(Long id);


}
