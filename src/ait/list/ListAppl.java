package ait.list;

import ait.list.interfaces.IList;
import ait.list.model.MyLinkedList;

public class ListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(7);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.get(5));
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(null));
        System.out.println(list.indexOf(10));
        Integer num = list.remove(5);
        System.out.println(num);
        System.out.println(list.size());
        System.out.println(list.remove((Integer) 7));
        System.out.println(list.size());
        System.out.println("===== Homework =====");
        list.clear();
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(4, 13);
        System.out.println(list.size());
        System.out.println(list.get(4));
        int n =list.lastIndexOf(5);
        System.out.println(n);



    }
}