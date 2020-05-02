package de.fhswf.inf;
import java.util.Scanner;


public class Main
{

   
   /**
    * 
    * TODO 
    * Eingabe der Zahlen
    * Ausgabe von ggT
    *
    * @param args
    */
   public static void main(String[] args)
   {
      Ggt z = new Ggt();
      int a, b, groesser, kleiner;
      Scanner sc = new Scanner (System.in);
       
      System.out.println("Erste Zahl eingeben:");
      a = sc.nextInt();
      System.out.println("");
      
      
      System.out.println("Zweite Zahl eingeben:");
      b = sc.nextInt();
      System.out.println("");
      
      if (a >= b) {
         groesser=a;
         kleiner = b;
      }
      else {
         groesser =b;
         kleiner = a;
         
      }
      
      
      System.out.println(z.ggT(groesser, kleiner));
   }
}
