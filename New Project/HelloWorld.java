import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String[] s1 = {"hello", "test", "this"};
        Arrays.sort(s1);
        for(String s: s1){
            System.out.println(s);
        }
        Sample sample = new Sample();
     }
}

