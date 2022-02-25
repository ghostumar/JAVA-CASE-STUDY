package com.company;
import com.company.model.Borrower;
import com.company.service.Search;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Catalogue {
    private static Map<Long,Book>shelves=new HashMap<>();
    private static Map<String,Borrower>rentedbook=new HashMap<>();
    public static void main(String[] args){
        Set<String>author=new HashSet<>();
        author.add("Bert Bates");
        Book book=new Book(123456,"Java Learning Book",author);
        book.addkeyword("Java");
        shelves.put(book.getIsbn(),book);
        Borrower borrower=new Borrower("Ranu", "ranu@gmail.com");
        borrower.rentBook(book.getIsbn(), book);
        rentedbook.put(borrower.getName(), borrower);


        author=new HashSet<>();
        author.add("Zed Shaw");




        book=new Book(999999,"Python Learning Book",author);
        book.addkeyword("Python");
        shelves.put(book.getIsbn(),book);
        Search search=new Search();

        search.searchbyTitle("Java Learning Book",shelves);
        search.searchbyAuthor("Bert Bates",shelves);
        search.searchbyKeyword("Java",shelves);





    }

}