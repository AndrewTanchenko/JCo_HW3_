// Javacore / Tanchenko A.
/*
 * 1. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). 
 *    Проверить истинность высказывания: «Данные поля имеют одинаковый цвет».
 * 2. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). 
 *    Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
 * 3. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). 
 *    Проверить истинность высказывания: «Ферзь за один ход может перейти с одного поля на другое».
 */

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_123 {
    public static void main(String[] args) {
    
    //user input data block
    byte x1=2,y1=3;
    byte x2=1,y2=4;
    
    if (args.length>3) {
      try{
         x1=Byte.parseByte(args[0], 10);
         y1=Byte.parseByte(args[1], 10);
         x2=Byte.parseByte(args[2], 10);
         y2=Byte.parseByte(args[3], 10);
         //if(x1<0||x1>8)
      }
      catch(IllegalArgumentException e)  { 
         System.out.println("Data has wrong format"); 
      }
    }
    ///////////////////////
    
    System.out.println("Input data is: ["+x1+","+y1+"] ["+x2+","+y2+"] ");
        
    byte color=0;
    byte[][] xy = new byte[9][9];
      for(int i=1;i<=8;i++){
        for(int j=1;j<=8;j++){
          xy[i][j]=color;
          if (color==0){color=1;}
          else {color=0;}
        }  
          if (color==0){color=1;}
          else {color=0;}
      } 
        
    System.out.println("Answers are:");
        
    String col_Arr[]= {"black", "white"};
    byte color1=xy[y1][x1], color2=xy[y2][x2];

        System.out.println("1)");            
      if(xy[x1][y1]==xy[x2][y2]){System.out.println("So, color for cell ["+x1+","+y1+"] and ["+x2+","+y2+"] is match and it's "+col_Arr[color1]);}
      else {System.out.println("So, color for cell ["+x1+","+y1+"] and ["+x2+","+y2+"] not match: first is "+col_Arr[color1]+" second: "+col_Arr[color2]);}
        System.out.println("2)"); 
      if(x1==x2||y1==y2){System.out.println("Yes, it's possible to go for Ladija by one moove, see below");}
      else {System.out.println("No, it's not possible to go for Ladija by one moove, see below");}
        System.out.println("3)"); 
      if(x1==x2||y1==y2||Math.abs(x1-x2)==Math.abs(y1-y2)){System.out.println("Yes, it's possible to go for Ferz by one moove");}
      else {System.out.println("No, it's not possible to go for Ferz by one moove");}
        System.out.println(" ");
        
        xy[y1][x1]=-1;
        xy[y2][x2]=-2;
        
        //System.out.println(Arrays.deepToString(xy));
      for(byte i=8;i>=0;i--){xy[i][0]=i;xy[0][i]=i;System.out.println(Arrays.toString(xy[i]));}
        System.out.println(" ");
        System.out.println("'0' - black, '1' - white");
        System.out.println("'-1'- [x1,y1], '-2'- [x2,y2] location");
 
      }
    }
