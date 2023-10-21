//Pedir dos números enteros y mostrar “verdadero” si el primero es mayor.
import java.util.Scanner;

public class Vro{
  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int num1, num2;
   System.out.println("Ingrese el primer número");
   num1 = sc.nextInt();
   System.out.println("Ingrese el segundo número");
   num2 = sc.nextInt();
   if (num1>num2){
	System.out.println("Verdadero");
   }else {
   if (num1<num2)
        System.out.println("Intentalo otra vez");
   }
 } 
}