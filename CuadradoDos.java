import java.util.Scanner;

public class CuadradoDos{
  public static void obtenerCuadrado(){

   Scanner sc = new Scanner(System.in);
   int num;
   for (int i = 0; i <= 10; i++){
   

       System.out.println("Introduzca el número:");
       num = sc.nextInt();
       System.out.println("Cuadrado: " + Math.pow(num,2));
  }
 }
 
 public static void main(String[] args) {
   obtenerCuadrado();
 }
}