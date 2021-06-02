package homework;

import java.util.Arrays;

public class Activity43 {
    public static void main(String[] args) {
       int [] a = {5,2,4,6,1} ;
       int [] b = {1,6} ;
       int result = a.length + b.length ;
       int [] rr = new  int[result] ;
       int p = 0 ;
       for (int d : a) {
           rr [p] = d ;
           p = p +1 ;
       }
       for(int d : b ) {
           rr [p] = d ;
           p = p + 1;
       }
        System.out.print("length: " + a.length + "; "+ "elements = ");
       System.out.println(Arrays.toString( a));
       System.out.print("length: " + b.length + "; "+ "elements = ");
        System.out.println(Arrays.toString(b));
       System.out.println(Arrays.toString(rr));


    }
}
