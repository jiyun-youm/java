package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList<Integer> list = new LinkedList <>();
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.addFirst(3);//처음에 값 추가
        list.addLast(4);//마지막에 값 추가

        list.removeFirst();//앞에서 삭제
        list.removeLast();//뒤에서 삭제

        System.out.println(list.toString());


    }
}
