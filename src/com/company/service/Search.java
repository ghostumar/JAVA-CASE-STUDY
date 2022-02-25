package com.company.service;

import com.company.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/** Search class to
 * search the book
 * to be issued.
 */

public class Search {
    private static Logger logger= Logger.getLogger(Search.class.getName());
    private Map<Long, Book>searchResult;
    private String keyword;

    public Search(){
        searchResult=new HashMap<>();
    }

    /**
     * search books by
     * their title name
     */
    public void searchbyTitle(String title, Map<Long,Book>shelves){
        shelves.forEach((key,value)->{
            if(value.getTitle().toLowerCase().contains(title.toLowerCase())){
                searchResult.put(key,value);
            }
        });

    }

    /** search books by
     * their author name
     */
    public void searchbyAuthor(String author, Map<Long,Book>shelves) {
        shelves.forEach((key, value) -> {
            if (value.getAuthor().contains(author)) {
                searchResult.put(key, value);
            }
        });
    }

    /**method to display
     * the searched books
     * @return
     */

    @Override
    public String toString() {
        return "Search{" +
                "searchResult=" + searchResult +
                ", keyword='" + keyword + '\'' +
                '}';
    }

    /**
     * search books by
     * any of the string
     * from title.
     */

    public void searchbyKeyword(String keyword, Map<Long, Book> shelves) {
        shelves.forEach((key, value) -> {
            if (value.getKeywords().contains(keyword)) {
                searchResult.put(key, value);
            }
        });
    }
}
