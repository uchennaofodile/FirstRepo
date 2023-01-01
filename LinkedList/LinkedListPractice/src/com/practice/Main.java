//package com.practice;

import java.util.Iterator;
import java.util.LinkedList;

class Main {

  public static void main(String[] args) {
    System.out.println();
    //Create a LinkedList
    LinkedList<Integer> intLL = new LinkedList<>();

    //Insert into a LinkedList
    //boolean - add to the end of a list
    intLL.add(1);
    intLL.add(5);
    intLL.add(32);
    intLL.add(1361);
    intLL.add(121);
    intLL.add(123);
    intLL.add(112);
    intLL.add(18921);
    intLL.add(112131);
    intLL.add(1324);
    intLL.add(19);
    intLL.add(4);

    //void - add to a specifided index (index, element)
    intLL.add(0, 55);

    //void add to the beginning of a list
    intLL.addFirst(32);

    //void add to the end of a list
    intLL.addLast(99);

    //boolean adds to the end of a list
    intLL.offer(21);

    //boolean adds to the front of list
    intLL.offerFirst(12);

    //boolean adds to the end of a list
    intLL.offerLast(145);

    //Traversal

    Iterator<Integer> it = intLL.iterator();
    while (it.hasNext()) {
      int element = it.next();
      System.out.print(element);
      if (!it.hasNext()) {
        break;
      }
      System.out.print(" ---> ");
    }

    System.out.println();

    for (int i = 0; i < intLL.size(); i++) {
      System.out.print(intLL.get(i));
      if (i == intLL.size() - 1) {
        break;
      }
      System.out.print(" ----> ");
    }

    /*In general, it is a good idea to use an iterator when you need to remove elements from a list while you are traversing it, or when you need to traverse the list in either direction. Otherwise, a for loop is often a good choice. */

    System.out.println();

    //-------------Search-------------------
    //int indexOf(Object o) - return the index of the first occurrence
    System.out.println("The index of 21 is: " + intLL.indexOf(21));

    //int lastIndexOf(Object o) - returns the last occurrence of the specified element or -1 if the element doesn't exist
    System.out.println(
      "The last occurence of 21 is at index: " + intLL.lastIndexOf(21)
    );

    //-------------Retrieval---------------
    //boolean contains() - takes element
    System.out.println(intLL.contains(2121));
    System.out.println(intLL.contains(21));

    //E element() - retrieves the first element of a list
    System.out.println("The first element is: " + intLL.element());

    //E get(int index) - returns element at specified location
    System.out.println("The element at index 1 is: " + intLL.get(1));

    //E getFirst() - returns the first element in a list
    System.out.println("The first element in the list is " + intLL.getFirst());

    //E getLast() - returns the last element in a list
    System.out.println("The last element in the list is: " + intLL.getLast());
    //---------------Deletion of a Node-------------------
    System.out.println("----------Deleting a node-----------\n");
    //E poll() - retrives and deletes the first element of a list
    System.out.println("Deleting the first element which is: " + intLL.poll());

    //E pollFirst() - retrieves and deletes the first element of a list, null if list is empty
    System.out.println("Deleting the first element: " + intLL.pollFirst());

    //E pollLast() - retrieves and deletes the last element of a list, null if list is empty
    System.out.println(
      "Deleting the last element of the list which is: " + intLL.pollLast()
    );

    //E remove() retrieves and removes the first element of a list
    System.out.println(
      "Deleting the first element of a list: " + intLL.remove()
    );

    //E remove(int index) retrieves and removes an element at a specified index
    System.out.println(
      "Removing an element at index 3 and the element is: " + intLL.remove(3)
    );

    //E removeFirst - removes and returns the first element of list
    System.out.println("Removing the first occurrence: " + intLL.removeFirst());

    //boolean removeFirstOccurrence(Object o) - removes the first occurrence when traversing from head to tail

    boolean result = intLL.removeFirstOccurrence(1361);
    if (result) System.out.println("element removed"); else System.out.println(
      "Element not removed"
    );

    //E removeLast() removes and returns last element from the list
    System.out.println("The last last element is: " + intLL.removeLast());

    //boolean removeLastOccurrence(Object o) - removes the last occurrence of the specified element
    result = intLL.removeLastOccurrence(145);
    if (result) System.out.println("element removed"); else System.out.println(
      "Element not removed"
    );

    //----------Swapping an element for another element----------
    System.out.println("----------Swapping an element for another----------\n");
    //Delete Linked List

  }
}
