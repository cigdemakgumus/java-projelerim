package day47__linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer>ll1=new LinkedList<>();
        System.out.println(ll1.peek());//Boşken kullanırsak null döndürür
       //System.out.println(ll1.element());//Boşken kullanırsak exceptıon fırlatır
        System.out.println(ll1.poll());//Boşken kullanırsak null döndürür
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());
        //ll1.pop();// İlk elementi silip bize döndürür. İlk elementi bulamazsa exception fırlatır
        ll1.push(30);//Listenin basına element ekler
        ll1.push(20);//
        System.out.println(ll1);

        System.out.println(ll1.remove());// ilk elementi siler ve bize döndürür
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);// object olarak 50 yi siler
        System.out.println(ll1);
        ll1.removeLastOccurrence(40);
        System.out.println(ll1);
    }
}
