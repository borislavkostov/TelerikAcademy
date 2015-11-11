import java.util.Scanner;

public class Problem09 
{

public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Вашето число от 0-999=");
       int n = scanner.nextInt();
       if(n>99)
       {
             switch (n/100)
             {
             case 1: System.out.print("Сто ");break;
             case 2: System.out.print("Двеста ");break;
             case 3: System.out.print("Триста ");break;
             case 4: System.out.print("Четиристотин ");break;
             case 5: System.out.print("Петстотин ");break;
             case 6: System.out.print("Шестотин ");break;
             case 7: System.out.print("Седемстотин ");break;
             case 8: System.out.print("Осемстотин ");break;
             case 9: System.out.print("Деведстотин ");break;
             }
             if((((n/10)%10 == 0) && (n%10!=0)) || (( n/10)%10 == 1) || ((n%10==0)) && (n%100!=0))
             {
                   System.out.print(" и ");
             }
       }
       switch ((n/10)%10)
       {
       case 1:
       {
             switch(n%100)
             {
             case 10: System.out.print("десет ");break;
             case 11: System.out.print("единадесет ");break;
             case 12: System.out.print("дванадесет ");break;
             case 13: System.out.print("тринадесет ");break;
             case 14: System.out.print("четиринадесет ");break;
             case 15: System.out.print("петнаседет ");break;
             case 16: System.out.print("шестнадесет ");break;
             case 17: System.out.print("седемнадесет ");break;
             case 18: System.out.print("осемнадесет ");break;
             case 19: System.out.print("деветнадесет ");break;
             }
             break;
       }
       case 2: System.out.print("двадесет  ");break;
       case 3: System.out.print("тридесет ");break;
       case 4: System.out.print("четирасет ");break;
       case 5: System.out.print("петдесет ");break;
       case 6: System.out.print("шестдесет ");break;
       case 7: System.out.print("седемдесет ");break;
       case 8: System.out.print("осемдесет ");break;
       case 9: System.out.print("деветдесет ");break;
       }
       
       if(((n/10)%10 != 0) && ((n/10)%10 != 1) && (((n%10>0))))
       {
             System.out.print(" и ");
       }
       
       if((n%100!=0) && (( n/10)%10 != 1))
       {
             switch (n%10)
             {
             case 1: System.out.print("едно");break;
             case 2: System.out.print("две");break;
             case 3: System.out.print("три");break;
             case 4: System.out.print("четири");break;
             case 5: System.out.print("пет");break;
             case 6: System.out.print("шест");break;
             case 7: System.out.print("седем");break;
             case 8: System.out.print("осем");break;
             case 9: System.out.print("девет");break;
             }
       }
       if(n==0)
       {
             System.out.print("нула");
       }
}
}