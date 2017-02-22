// Javacore / Tanchenko A.
/*
 * Write a code fragment that reverses the order of a one-dimensional array a[] of int values. 
 * Do not create another array to hold the result 
      a=a+b;
      b=a-b;
      a=a-b;
 */

//import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;

class Dz3_8 {
    public static void main(String[] args) {
      
      int[] a = {1,2,3,4,5,6,7,8,9,10};
      //int n=a.length;
      
      for (int i=0; i<a.length/2; i++){ 
        a[i]=a[i]+a[a.length-i-1];
        a[a.length-i-1]=a[i]-a[a.length-i-1];
        a[i]=a[i]-a[a.length-i-1];
       //System.out.println (mArr[i]);
      }
      System.out.println(Arrays.toString(a));
   }
}