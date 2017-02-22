// Javacore / Tanchenko A.
/*
 * 7. ƒаны два целых числа: D (день) и M (мес€ц), определ€ющие правильную дату. 
 * ¬ывести знак «одиака, соответствующий этой дате: 
 * Ђ¬одолейї (20.1Ц18.2), Ђ–ыбыї (19.2Ц20.3), Ђќвенї (21.3Ц19.4), 
 * Ђ“елецї (20.4Ц20.5), ЂЅлизнецыї (21.5Ц21.6), Ђ–акї (22.6Ц22.7), 
 * ЂЋевї (23.7Ц22.8), Ђƒеваї (23.8Ц22.9), Ђ¬есыї (23.9Ц22.10), 
 * Ђ—корпионї (23.10Ц22.11), Ђ—трелецї (23.11Ц21.12), Ђ озерогї (22.12Ц19.1).
 * */

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_7 {
    public static void main(String[] args) {
      
      String[] zodiacArr = {"¬одолей", "–ыбы", "ќвен", "“елец", "Ѕлизнецы", "–ак", "Ћев", "ƒева", "¬есы", "—корпион", "—трелец", " озерог"};
      String[] mArr = {"€нвар€", "феврал€", "марта", "апрел€", "ма€", "июн€", "июл€", "августа", "сент€бр€", "окт€бр€", "но€бр€", "декабр€"};
      int[][] xy = new int[12][31];
      
      //Ђ¬одолейї (20.1Ц18.2), Ђ–ыбыї (19.2Ц20.3), Ђќвенї (21.3Ц19.4),
      Arrays.fill(xy[0],20,31,1);
      Arrays.fill(xy[1], 0,18,1);
      
      Arrays.fill(xy[1],18,28,2);     
      Arrays.fill(xy[2], 0,20,2);
      
      Arrays.fill(xy[2],20,31,3);
      Arrays.fill(xy[3], 0,19,3);
      
      //Ђ“елецї (20.4Ц20.5), ЂЅлизнецыї (21.5Ц21.6), Ђ–акї (22.6Ц22.7),
      Arrays.fill(xy[3],19,30,4);
      Arrays.fill(xy[4], 0,20,4);
      
      Arrays.fill(xy[4],20,31,5);     
      Arrays.fill(xy[5], 0,21,5);
      
      Arrays.fill(xy[5],21,30,6);
      Arrays.fill(xy[6], 0,22,6);

      //ЂЋевї (23.7Ц22.8), Ђƒеваї (23.8Ц22.9), Ђ¬есыї (23.9Ц22.10),
      Arrays.fill(xy[6],22,31,7);
      Arrays.fill(xy[7], 0,22,7);
      
      Arrays.fill(xy[7],22,31,8);     
      Arrays.fill(xy[8], 0,22,8);
      
      Arrays.fill(xy[8],22,30,9);
      Arrays.fill(xy[9], 0,22,9);

      //Ђ—корпионї (23.10Ц22.11), Ђ—трелецї (23.11Ц21.12), Ђ озерогї (22.12Ц19.1)
      Arrays.fill(xy[ 9],22,31,10);
      Arrays.fill(xy[10], 0,22,10);
      
      Arrays.fill(xy[10],22,30,11);     
      Arrays.fill(xy[11], 0,21,11);
      
      Arrays.fill(xy[11],21,31,12);
      Arrays.fill(xy[ 0], 0,19,12);
 
      //System.out.println(Arrays.deepToString(xy));
      //System.out.println(Arrays.toString(xy[0]));
      
      Scanner sc = new Scanner(System.in);   
      String s1,s2;
      int d=0,m=0;
      boolean flag=false;
  
      for (int i=1; i<=3; i++){ 
       System.out.println ("¬ведите два числа характеризующих дату: мес€ц и день");
       System.out.println ("¬ведите мес€ц: [1--12]");
        s1 = sc.nextLine();
       System.out.println ("¬ведите день: [1--31]");
        s2 = sc.nextLine(); 
        //int l=s1.length();
        
        try {
         m = Integer.parseInt(s1);
         d = Integer.parseInt(s2);
         if (m>12||m<1){
           System.out.println("Ќезнаю такого мес€ца!");
           continue;}
         if (d>31||d<1){
           System.out.println("Ќеверный диапазон вводимых данных < день >!");
           continue;}
         flag=true;
         break;
        } 
        catch(IllegalArgumentException e)  { 
          System.out.println("Ќеверный формат данных! —пробуй ще раз");
          System.out.println("");
          if (i == 3) {System.out.println("’ватит! ƒовольно!");} 
         continue;
        }  
      }
      
        if (flag) {   
      int z_= xy[m-1][d-1];    
      if(z_!=0){System.out.println(" "+d+"-е "+mArr[m-1]+" по зодиаку это "+zodiacArr[z_-1]);}
      else {System.out.println("Ќеверна€ комбинаци€ ƒень/ћес€ц ");}
        }
      }
    }