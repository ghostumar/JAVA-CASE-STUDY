package com.company;

import java.util.*;


/** Class for Boook
 * to store Book information
 */

public class Book {
    /** created instance variables
     *
     */

    private long isbn;
    private String title;
    private Set<String> authors;
    private Set<String>keywords;
    private String status;


    /** constructor
     * allow user to input instance variable
     */

    public Book(long isbn, String title,Set<String> authors){
        this.isbn=isbn;
        this.title=title;
        this.authors =new HashSet<>();
        for (String name: authors) {
            if(name!=null && name.matches("^[a-z A-Z]*$")) {
                this.authors.add(name);
            }
        }
        this.keywords=new HashSet<>();
        this.status="Available";
    }


    /** create method for each instance variable to return
     * inputted by user
     */
    public long getIsbn(){
        return isbn;
    }

    public String getTitle() {

        return title;
    }
    public Set<String> getAuthors(){
        return authors;
    }
    public  void addkeyword(String keyword){
        if(keyword !=null && keyword.matches("^[a-z A-Z 0-9]*$")) {
            this.keywords.add(keyword);
        }

    }
    public Set<String> getKeywords(){
        return keywords;
    }

    public String checkStatus() {
        return status;
    }

    /**
     * when book is borrowed
     *  its status
     */
    public void borrowStatus(){
        this.status="rented";
    }

    /**
     * when book returned
     * its status
     */
    public void returnStatus(){
        this.status="Available";
    }

}