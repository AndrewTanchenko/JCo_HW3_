// Javacore / Tanchenko A.
/*
 * 7. Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. 
 * Вывести знак Зодиака, соответствующий этой дате: 
 * «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), 
 * «Телец» (20.4–20.5), «Близнецы» (21.5–21.6), «Рак» (22.6–22.7), 
 * «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10), 
 * «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
 * */

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_7 {
    public static void main(String[] args) {
      
      String[] zodiacArr = {"Водолей", "Рыбы", "Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева", "Весы", "Скорпион", "Стрелец", "Козерог"};
      String[] mArr = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
      int[][] xy = new int[12][31];
      
      //«Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4),
      Arrays.fill(xy[0],20,31,1);
      Arrays.fill(xy[1], 0,18,1);
      
      Arrays.fill(xy[1],18,28,2);     
      Arrays.fill(xy[2], 0,20,2);
      
      Arrays.fill(xy[2],20,31,3);
      Arrays.fill(xy[3], 0,19,3);
      
      //«Телец» (20.4–20.5), «Близнецы» (21.5–21.6), «Рак» (22.6–22.7),
      Arrays.fill(xy[3],19,30,4);
      Arrays.fill(xy[4], 0,20,4);
      
      Arrays.fill(xy[4],20,31,5);     
      Arrays.fill(xy[5], 0,21,5);
      
      Arrays.fill(xy[5],21,30,6);
      Arrays.fill(xy[6], 0,22,6);

      //«Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10),
      Arrays.fill(xy[6],22,31,7);
      Arrays.fill(xy[7], 0,22,7);
      
      Arrays.fill(xy[7],22,31,8);     
      Arrays.fill(xy[8], 0,22,8);
      
      Arrays.fill(xy[8],22,30,9);
      Arrays.fill(xy[9], 0,22,9);
        
      //«Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1)
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
       System.out.println ("Введите два числа характеризующих дату: месяц и день");
       System.out.println ("Введите месяц: [1--12]");
        s1 = sc.nextLine();
       System.out.println ("Введите день: [1--31]");
        s2 = sc.nextLine(); 
        //int l=s1.length();
        
        try {
         m = Integer.parseInt(s1);
         d = Integer.parseInt(s2);
         if (m>12||m<1){
           System.out.println("Незнаю такого месяца!");
           continue;}
         if (d>31||d<1){
           System.out.println("Неверный диапазон вводимых данных < день >!");
           continue;}
         flag=true;
         break;
        } 
        catch(IllegalArgumentException e)  { 
          System.out.println("Неверный формат данных! Спробуй ще раз");
          System.out.println("");
          if (i == 3) {System.out.println("Хватит! Довольно!");} 
         continue;
        }  
      }
      
        if (flag) {   
      int z_= xy[m-1][d-1];    
      if(z_!=0){System.out.println(" "+d+"-е "+mArr[m-1]+" по зодиаку это "+zodiacArr[z_-1]);}
      else {System.out.println("Неверная комбинация День/Месяц ");}
        }
      }
    }
