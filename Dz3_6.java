// Javacore / Tanchenko A.
/*
 * 6.   � ��������� ��������� ������ 60-������ ����, ��������� �� 12-������ ���������, ������������ ���������� �����: 
 * �������, �������, ������, ����� � ������. � ������ �������� ���� ����� �������� ��������: 
 * �����, ������, �����, �����, �������, ����, ������, ����, ��������, ������, ������ � ������. 
 * �� ������ ���� ���������� ��� ��������, ���� 1984 ��� � ������ �����: ���� ������� ������
 * 
 */
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      String s1;
      int a=0;
      boolean flag=false;
      byte n_try=3;
  
      System.out.println ("--- Lets magic begin ---");
      for (int i=1; i<=n_try; i++){ 
       System.out.println ("Please input year [xxxx]");
        s1 = sc.nextLine();
        int l=s1.length();
        
        try {
         a = Integer.parseInt(s1);
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
     
      String[] yearColorArr =  {"�������", "�������", "������", "�����", "������"};
      String[] yearColorArr_ = {"��������", "��������", "�������", "������", "�������"};
      String[] yearArr = {"�����", "������", "�����", "�����", "�������", "����", "������", "����", "��������", "������", "������", "������"};
      int year_start=1984; // 1984 - ������� �����


      System.out.println("Your year is "+ a);
      
      int year_delta=a-year_start;
      if(Math.abs(year_delta)>60){year_delta-=60*(year_delta/60);}
 
      int year_=year_delta;
      int color_=year_delta;      
      if(Math.abs(year_)>12){year_-=12*(year_delta/12);}
      if(Math.abs(color_)>5) {color_-=5*(year_delta/5);}

         if(year_<0){year_+=12;}
         if(color_<0){color_+=5;} 
      
      switch(year_) {
        case 2:case 3:case 4:
          System.out.println("It's a year of "+yearColorArr_[color_]+" "+yearArr[year_] );
          break;
        default:
          System.out.println("It's a year of "+yearColorArr[color_]+" "+yearArr[year_] );
          break;
      }

        }
      }
    }