// Javacore / Tanchenko A.
/*
 * ������� ����. ���� ������� ������ ������ �������: �� �������� ������ ���������� ��������� ������� ��������� ���� (�����+���-��) � ���������� � ������ ������
 */

//import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;

class Dz3_9 {
    public static void main(String[] args) {
      
      int[] koloda = new int[36];
      int[] koloda_ = new int[36];
      //int n=a.length;
      
      int i=6,k=1;
      while (k<=36){ 
        for(int j=1;j<=4; j++){
          koloda[k-1]=Integer.parseInt(""+i+j);
          k++;
        }
        i++;
      }
      System.out.println ("�������� ������: ");
      System.out.println(Arrays.toString(koloda));
      
     int nn_=5; //���-�� �������������     
     for(int ii=1;ii<=5;ii++){
      int m = (int)(Math.random()*35);
      int n = (int)(Math.random()*(34-m)+1);
      System.out.println ("�����: "+m+" ���-��: "+n);
      
      int j=0;
      for(i=m;i<m+n; i++){
         koloda_[j]= koloda[i-1];
         j++;
      }
      for(i=1;i<m; i++){
         koloda_[j]= koloda[i-1];
         j++;
      }
      for(i=m+n;i<=36; i++){
         koloda_[j]= koloda[i-1];
         j++;
      }
      System.arraycopy(koloda_,0,koloda,0,koloda.length);
      System.out.println(Arrays.toString(koloda));
      //System.out.println(Arrays.toString(koloda_));
     }   
   } 
}