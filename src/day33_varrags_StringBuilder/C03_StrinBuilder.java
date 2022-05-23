package day33_varrags_StringBuilder;

public class C03_StrinBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 length : "+ sb1.length());
        System.out.println("sb1 capacity : " + sb1.capacity());
        System.out.println("sb2 lenght :" + sb2.length());
        System.out.println("sb2 capacity :" + sb2.capacity());
        System.out.println("sb3 lenght :" + sb3.length());
        System.out.println("sb3 capacity :" + sb3.capacity());

        sb1.append("java").append(" ").append("çok").append(" ").append("guzel");
        System.out.println("sb1 lenght :" + sb1.length());
        System.out.println("sb1 capacity :" + sb1.capacity());

        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);

        System.out.println("sb1 length : "+ sb1.length());
        System.out.println("sb1 capacity : " + sb1.capacity());
        sb1.append("tum dersler java olsa");
        System.out.println("sb1 length : "+ sb1.length());
        System.out.println("sb1 capacity : " + sb1.capacity());

        sb1.trimToSize();
        System.out.println("sb1 length : "+ sb1.length());
        System.out.println("sb1 capacity : " + sb1.capacity());


    }
}
