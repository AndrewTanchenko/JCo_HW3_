// Javacore / Tanchenko A.
/*
 * 4.         
 * ������ ��������� ���� ��������� ���������� ������: 1 � ����, 2 � �����, 3 � �����, 4 � �����. 
 * ����������� ����, ������� �������, ��������� ������: 11 � �����, 12 � ����, 13 � ������, 14 � ���. 
 * ���� ��� ����� �����: N � ����������� (6 < N < 14) � M � ����� ����� (1 < M < 4). 
 * ������� �������� ��������������� ����� ���� ��������� �����, ����� ������, ���� ����� � �. �.
 * 
*/
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Dz3_4 {
    public static void main(String[] args) {
      String[] m_Arr = {"���","����","�����","������"};
      String[] n_Arr = {"��������","�������","��������","�������","�������","�����","����","������","���"};
           
      Scanner sc = new Scanner(System.in);   
      String s1,s2;
      int n=0,m=0;
      boolean flag=false;
      byte n_try=3;
  
      for (int i=1; i<=n_try; i++){ 
       System.out.println ("������� ��� ����� ��������������� ��������� �����: ���������� [�� 6 �� 14] � ����� [�� 1 �� 4]");
       System.out.println ("// ����������: [6, 7, 8, 9, 10, 11-�����, 12-����, 13-������, 14-���]");
       System.out.println ("// �����: [1-����, 2-�����, 3-�����, 4-�����]");
       System.out.println ("������� ���������� �����: [6--14]");
        s1 = sc.nextLine();
       System.out.println ("������� ����� �����: [1--4]");
        s2 = sc.nextLine(); 
        //int l=s1.length();
        
        try {
         n = Integer.parseInt(s1);
         m = Integer.parseInt(s2);
         if (n>14||n<6){
           System.out.println("�������� �������� �������� ������!");
           continue;}
         if (m>4||m<1){
           System.out.println("�������� �������� �������� ������!");
           continue;}
         flag=true;
         break;
        } 
        catch(IllegalArgumentException e)  { 
          System.out.println("�������� ������ ������! ������� �� ���");
          System.out.println("");
          if (i == n_try) {System.out.println("������! ��������!");} 
         continue;
        }  
      }
        
        if (flag) {   
      System.out.println("��� �����: "+ n +" � "+m);
      System.out.println("��� �����: "+ n_Arr[n-6]+" "+m_Arr[m-1]);

        }
      }
    }