package de.fhswf.inf;


public class Ggt
{

   public static int ggT(int a, int b) {
      int rest;
      do {
         rest = a%b;
         a = b;
         b = rest;
       } while(b!=0);
      
      
      return a;
   }
   
   
   
   
   
}
