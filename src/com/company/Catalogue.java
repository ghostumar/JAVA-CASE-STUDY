package com.company;
import com.company.model.Borrower;
import com.company.model.User;
import com.company.service.Search;
import com.company.service.WaitingQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Catalogue {
    private static Map<Long,Book>shelves=new HashMap<>();
    private static Map<String, Queue<User>> waitingQueueUser = new HashMap<>();
    private static Map<String,Borrower>rentedbook=new HashMap<>();
    public static void main(String[] args){
        Set<String>author=new HashSet<>();
        author.add("Bert Bates");
        Book book=new Book(123456,"Java Learning Book",author);
        //User user=new User("umar","mohd199umar@gmail.com");
        book.addkeyword("Java");
        shelves.put(book.getIsbn(),book);
        Borrower borrower=new Borrower("Ranu", "ranu@gmail.com");
        borrower.rentBook(book.getIsbn(), book);
        rentedbook.put(borrower.getName(), borrower);


        author=new HashSet<>();
        author.add("Zed Shaw");




        book=new Book(999999,"Python Learning Book",author);
        // user=new User("rahul","sharma.rahul@gmail.com");
        book.addkeyword("Python");
        shelves.put(book.getIsbn(),book);
        Search search=new Search();

        search.searchbytitle("Java Learning Book",shelves);
        search.searchbyauthor("Bert Bates",shelves);
        search.searchbykeyword("Java",shelves);
        // waiting queue
        WaitingQueue waitingQueue = new WaitingQueue("Java Learning Book");
        //waitingQueue.addUserToQueue(user);
        //user = new User("abc", "abc@gmail.com");
        // waitingQueue.addUserToQueue(user);

        waitingQueueUser.put(waitingQueue.getTitle(), waitingQueue.getWaitQueue());

        waitingQueue = new WaitingQueue("Python Learning Book");
        // user = new User("cbd", "cbd@gmail.com");
        //waitingQueue.addUserToQueue(user);
        // user = new User("efg", "efg@gmail.com");
        // waitingQueue.addUserToQueue(user);
        waitingQueueUser.put(waitingQueue.getTitle(), waitingQueue.getWaitQueue());




    }

}