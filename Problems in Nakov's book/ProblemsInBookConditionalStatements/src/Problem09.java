import java.util.Scanner;

public class Problem09 
{

public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("������ ����� �� 0-999=");
       int n = scanner.nextInt();
       if(n>99)
       {
             switch (n/100)
             {
             case 1: System.out.print("��� ");break;
             case 2: System.out.print("������ ");break;
             case 3: System.out.print("������ ");break;
             case 4: System.out.print("������������ ");break;
             case 5: System.out.print("��������� ");break;
             case 6: System.out.print("�������� ");break;
             case 7: System.out.print("����������� ");break;
             case 8: System.out.print("���������� ");break;
             case 9: System.out.print("����������� ");break;
             }
             if((((n/10)%10 == 0) && (n%10!=0)) || (( n/10)%10 == 1) || ((n%10==0)) && (n%100!=0))
             {
                   System.out.print(" � ");
             }
       }
       switch ((n/10)%10)
       {
       case 1:
       {
             switch(n%100)
             {
             case 10: System.out.print("����� ");break;
             case 11: System.out.print("���������� ");break;
             case 12: System.out.print("���������� ");break;
             case 13: System.out.print("���������� ");break;
             case 14: System.out.print("������������� ");break;
             case 15: System.out.print("���������� ");break;
             case 16: System.out.print("����������� ");break;
             case 17: System.out.print("������������ ");break;
             case 18: System.out.print("����������� ");break;
             case 19: System.out.print("������������ ");break;
             }
             break;
       }
       case 2: System.out.print("��������  ");break;
       case 3: System.out.print("�������� ");break;
       case 4: System.out.print("��������� ");break;
       case 5: System.out.print("�������� ");break;
       case 6: System.out.print("��������� ");break;
       case 7: System.out.print("���������� ");break;
       case 8: System.out.print("��������� ");break;
       case 9: System.out.print("���������� ");break;
       }
       
       if(((n/10)%10 != 0) && ((n/10)%10 != 1) && (((n%10>0))))
       {
             System.out.print(" � ");
       }
       
       if((n%100!=0) && (( n/10)%10 != 1))
       {
             switch (n%10)
             {
             case 1: System.out.print("����");break;
             case 2: System.out.print("���");break;
             case 3: System.out.print("���");break;
             case 4: System.out.print("������");break;
             case 5: System.out.print("���");break;
             case 6: System.out.print("����");break;
             case 7: System.out.print("�����");break;
             case 8: System.out.print("����");break;
             case 9: System.out.print("�����");break;
             }
       }
       if(n==0)
       {
             System.out.print("����");
       }
}
}