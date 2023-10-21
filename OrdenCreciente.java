//Leer tres números y deducir si se han introducido en orden creciente.

import java.util.Scanner;

public class OrdenCreciente{
  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int num1, num2, num3;
   System.out.println("Ingrese el primer número");
   num1 = sc.nextInt();

   System.out.println("Ingrese el segundo número");
   num2 = sc.nextInt();

   System.out.println("Ingrese el tercer número");
   num3 = sc.nextInt();

   if(num1<num2 && num2<num3){
     System.out.println("El orden obtenido, es creciente");
   } else {
       System.out.println("No se ha obtenido un orden creciente");
   }

 }
}