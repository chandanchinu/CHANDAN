import java.util.*;

   class Atm
   {
 static public void main(String args[])
   {
	
Scanner x=new Scanner (System.in);
    System.out.print("ENTER THE PIN=");
     int pin = x.nextInt();
       {
    System.out.print("ENTER THE AMT=");
    int amt= x.nextInt();
      if(amt>0 && amt%100==0)
        {
        System.out.println("amt withdraw"+amt);
        System.out.println("WITHDRAW SUCCESSFULL");
        }
       else 
         {
          System.out.println("invalid amt");
          }
     }
    else
     {
    System.out.println("INVALID PIN NO");
     }
}
}