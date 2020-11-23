package com.cgs.library.dao;

import com.cgs.library.pojo.Book;
import com.cgs.library.pojo.Category;

import java.util.List;
import java.util.Map;

public interface BookMapper {
    //条件查询图书列表
    List<Book> queryList(Map<String, Object> paramMap);
    //条件查询结果个数
    Integer queryCount(Map<String, Object> paramMap);
    //查询图书类别
    List<Category> listCategory();

    //增加书籍
    void addBook(Book book);
    // 根据图书id查询图书信息
    Book selectById(int book_id);
    //更改图书信息
    void updateBook(Book book);
    //删除图书信息
    void delBook(int book_id);
    //借阅库存减少一
    void reduceStock(Integer book_id);
}
