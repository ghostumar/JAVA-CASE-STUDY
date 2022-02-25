package com.company.model;

import com.company.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Borrower class to
 * store borrowers information.
 */

public class Borrower {
    private String name;
    private String email;
    private Map<Long, Book> rentedBooks;
    public Borrower(String name,String email){
        this.name=name;
        this.email=email;
        this.rentedBooks=new HashMap<>();
    }
    public  String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void rentBook(Long isbn,Book book){
        book.borrowStatus();
        rentedBooks.put(isbn,book);
    }

    /**
     * method to display the
     *borrower of the book
     */

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rentedBooks=" + rentedBooks +
                '}';
    }

    public void returnBook(String title) {
        rentedBooks.forEach((key,value)->{
            if (value.getTitle().equalsIgnoreCase(title)){
                value.returnStatus();
                rentedBooks.remove(key);
            }
        });

    }
    public Map<Long,Book>getRentedBooks(){
        return rentedBooks;
    }
}