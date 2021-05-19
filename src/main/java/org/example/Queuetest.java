package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queuetest {
    public static void main(String[] args) {
        List list = new LinkedList<Hero>();
        Queue<Hero> queue = new LinkedList<Hero>();


        //加在队列的最后面
        System.out.print("初始化队列:\t");
        queue.offer(new Hero("Hero1"));
        queue.offer(new Hero("Hero2"));
        queue.offer(new Hero("Hero3"));
        queue.offer(new Hero("Hero4"));
        System.out.println(queue);

//        System.out.println(queue);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = queue.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(queue);

        //把第一个拿出来看一看，但是不取出来
        Hero he = queue.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(he);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(queue);
    }
}
