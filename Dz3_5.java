// Javacore / Tanchenko A.
/*
 * 5.  ���� ����� ����� � ��������� 100�999. 
 *     ������� ������-�������� ������� �����, ��������: 256 � ������� ��������� ������, 814 � ���������� �������������.
 */
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
      byte n_try=3;
  
      for (int i=1; i<=n_try; i++){ 
       System.out.println ("Please input simple number from 0 to 999 [xxx]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
         if (a>999||a<0){
           System.out.println("Just more than 0 and less 999 ! not as you have done "+s1);
           continue;}
         flag=true;
         break;
        } 
        catch(IllegalArgumentException e)  { 
          if (i < n_try) {System.out.println("Data has not ineger format, please try againe ");}
          if (i == n_try) {System.out.println("Enought! Back to school!");} 
         continue;
        }  
      } 
        if (flag) {   
          
      String[] x = {"","����","���","���","������","����","�����","����","������","������"};
      String[] x_ = {"","����������","����������","����������","�����������","����������","�����������","����������","������������","������������"};
      String[] xx = {"","������","��������","��������","�����","���������","����������","���������","�����������","���������"};
      String[] xxx = {"","���","������","������","���������","�������","��������","�������","���������","���������"};

      System.out.println("Your number is "+ a);
      
      s1=""+a;
      int l=s1.length();
      //int[] i_ = {0,0,0,0};
      int[] i_ = new int[4];
      Arrays.fill(i_,0);
      //System.out.println("l"+l+" "+i_[3]+i_[2]+i_[1]+i_[0]);
      
      int i=1;
      if(l>=2&a%100>10&a%100<20){ 
        i_[0]=a%10; 
        i_[1]=0;
        i_[2]=0;
        a=a/100;
        i+=2;}
      
      while(i<=l){
        i_[i]=a%10;
        a=(int)(a/10);
        i++;
      }
      System.out.println("it means: "+xxx[i_[3]]+" "+xx[i_[2]]+" "+x[i_[1]]+" "+x_[i_[0]]);
    
        }
      }
    }