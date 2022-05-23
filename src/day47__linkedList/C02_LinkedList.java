package day47__linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {


        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);// basa element ekler
        ll1.addLast(20);//sona element ekler, add() göre daha hızlıdır
        System.out.println(ll1);
        System.out.println(ll1.element());//ilk elementi silmeden bize döndürür
        System.out.println(ll1);

        System.out.println(ll1.getLast());
        System.out.println(ll1.getFirst());

        ll1.offer(30); // sona ekler ama bize bişey döndürmez
        System.out.println(ll1);
        ll1.offerLast(40);//sona ekler bize true döndürür
        ll1.offerFirst(50);

    }
}
