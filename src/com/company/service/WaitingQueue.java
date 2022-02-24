package com.company.service;

import com.company.model.User;

import java.util.LinkedList;
import java.util.Queue;

/**
 * WaitingQueue for the borrower
 * to wait in line to
 * issue the books.
 */

public class WaitingQueue {
    private String title;
    private Queue<User>waitQueue;
    public WaitingQueue(String title){
        this.title=title;
        this.waitQueue=new LinkedList<>();
    }

    /**accessor method for
     * each instance variable.
     * @return
     */
    public String getTitle(){
        return title;
    }
    public void addUserToQueue(User user){
        waitQueue.add(user);
    }
    public int getQueueSize(){
        return waitQueue.size();
    }
    public Queue<User> getWaitQueue(){
        return waitQueue;
    }
}