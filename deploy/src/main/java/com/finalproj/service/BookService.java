package com.finalproj.service;

import java.util.List;
import com.finalproj.dao.BooksDao;
import com.finalproj.model.Books;

public class BookService {

    private BooksDao booksDao;

    public BookService() {
        booksDao = new BooksDao();
    }

    //Mã sách không trùng lặp
    public boolean isBookExists(String maSach) {
        return booksDao.isBookExists(maSach);
    }
    
    // Lấy tất cả sách
    public List<Books> getAllBooks() {
        return booksDao.getAllBooks();
    }

    // Thêm sách
    public void addBooks(Books book) {
        booksDao.addBook(book); 
    }

    public Books getBookById(String maSach) {
        return booksDao.getBookById(maSach);
    }
    
    //Sửa sách
    public void updateBooks(Books book) {
        booksDao.updateBook(book); 
    }

    // Xóa sách
    public void deleteBooks(String maSach) {
        booksDao.deleteBook(maSach);  
    }
}
