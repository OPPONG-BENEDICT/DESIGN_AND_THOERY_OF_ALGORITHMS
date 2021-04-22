package com.company;

import java.util.NoSuchElementException;

public class QueueLinkedList<T>
{

    private Node front,//first node field
                 back;//last node field
    private int currentSize;//size of the queue field

    //A constructor
    public QueueLinkedList(){
        front = null;//Initialize the last element in the queue as null
        back = null;//Initialize the last element in the queue as null
        currentSize = 0;//Initialize current size as 0
    }


    public boolean isEmpty()
    {
        return (currentSize == 0);//Check if the size of the queue is 0
    }




    public void enqueue(T data)
    {
        Node oldBack = back; //The a node and set it as the last element
        back = new Node(data);// give last position to the new node
        back.next = null;//Set the last element in the queue next value to null
        if (isEmpty())//Check if the queue is empty
        {
            front = back;//Set last element to be the first if the queue is empty
        }
        else
        {
            oldBack.next = back;//Set the old last element next data to the new data
        }

        currentSize++;// Add 1 if an element is added
        System.out.println(data + " added to the queue"+"\n");//Display the element added to the queue
          System.out.println(data);
    }



    public T dequeue()
    {
        T data = (T) front.data; //Create a new node and set it the first element
        front = front.next;
        if (isEmpty())//Check if the queue is empty
        {
            back = null;//Set the last element to null if queue is empty
        }
        currentSize--;//decrease the size of the queue one
        System.out.println(data+ " removed from the queue"+ "\n");//Display the remove element
        return data; //Return the removed element
    }


    public void printQueue(QueueLinkedList queue)
    {
        Node currentNode = queue.front;//Create a new node and assign with the top value

        System.out.print("Queue: ");

        //Loop and display all the elements in the queue until every element is display
        while (currentNode != null) {

            System.out.print(currentNode.data + " <= ");//Display a particular element

            currentNode = currentNode.next;//Move to the next element in the queue
        }
        System.out.println();
    }



    public T front()
    {

        if (isEmpty())//Check if the list is empty
        {
            throw new NoSuchElementException();//Throw an exception
        }
        else
        {
            T data = (T) front.data;//Create a new node and assign the element at the front to it
            return data;//Return the element at the front
        }
    }

    public int length(){
        return currentSize;//Return the size of the queue
    }

    //A method to remove all the element from the queue
    public void clear(){
        while (!isEmpty())//Check if the stack is not empty
        {
            dequeue();//Keep removing the elements until the queue is empty
        }


    }
}
