package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i=0 ; i<10 ; i++){
            list.add(i);
//            System.out.println(list);
        }
        System.out.println(list);
        Collections.reverse(list);//反转
        System.out.println(list);

        Collections.shuffle(list);//混淆
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);//排序

        Collections.swap(list,0,1);//交换第一个位置和第二个位置的内容
        System.out.println(list);

        Collections.rotate(list,2);
        System.out.println(list);

        List<Integer> synchronizedNumbers = Collections.synchronizedList(list);
    }
}
