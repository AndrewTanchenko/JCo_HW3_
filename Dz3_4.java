// Javacore / Tanchenko A.
/*
 * 4.         
 * ћаст€м игральных карт присвоены пор€дковые номера: 1 Ч пики, 2 Ч трефы, 3 Ч бубны, 4 Ч червы. 
 * ƒостоинству карт, старших дес€тки, присвоены номера: 11 Ч валет, 12 Ч дама, 13 Ч король, 14 Ч туз. 
 * ƒаны два целых числа: N Ч достоинство (6 < N < 14) и M Ч масть карты (1 < M < 4). 
 * ¬ывести название соответствующей карты вида Ђшестерка бубенї, Ђдама червейї, Ђтуз трефї и т. п.
 * 
*/
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_4 {
    public static void main(String[] args) {
      String[] m_Arr = {"пик","треф","бубен","червей"};
      String[] n_Arr = {"шестерка","семерка","восмерка","дев€тка","дес€тка","валет","дама","король","туз"};
           
      Scanner sc = new Scanner(System.in);   
      String s1,s2;
      int n=0,m=0;
      boolean flag=false;
      byte n_try=3;
  
      for (int i=1; i<=n_try; i++){ 
       System.out.println ("¬ведите два числа характеризующих игральную карту: достоиство [от 6 до 14] и масть [от 1 до 4]");
       System.out.println ("// достоиство: [6, 7, 8, 9, 10, 11-валет, 12-дама, 13-король, 14-туз]");
       System.out.println ("// масть: [1-пики, 2-трефы, 3-бубны, 4-червы]");
       System.out.println ("¬ведите достоиство карты: [6--14]");
        s1 = sc.nextLine();
       System.out.println ("¬ведите масть карты: [1--4]");
        s2 = sc.nextLine(); 
        //int l=s1.length();
        
        try {
         n = Integer.parseInt(s1);
         m = Integer.parseInt(s2);
         if (n>14||n<6){
           System.out.println("Ќеверный диапазон вводимых данных!");
           continue;}
         if (m>4||m<1){
           System.out.println("Ќеверный диапазон вводимых данных!");
           continue;}
         flag=true;
         break;
        } 
        catch(IllegalArgumentException e)  { 
          System.out.println("Ќеверный формат данных! —пробуй ще раз");
          System.out.println("");
          if (i == n_try) {System.out.println("’ватит! ƒовольно!");} 
         continue;
        }  
      }
        
        if (flag) {   
      System.out.println("¬аш выбор: "+ n +" и "+m);
      System.out.println("Ёто будет: "+ n_Arr[n-6]+" "+m_Arr[m-1]);

        }
      }
    }