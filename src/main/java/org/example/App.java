package org.example;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList<Hero> linkedList= new LinkedList<Hero>();

        linkedList.addLast(new Hero("流浪"));
        linkedList.addLast(new Hero("寒冰"));
        linkedList.addLast(new Hero("盖伦"));
//        System.out.println(linkedList);

        linkedList.addFirst(new Hero("千珏"));
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.get(1));

        System.out.println(linkedList.remove(1));
        System.out.println(linkedList);

    }
}
