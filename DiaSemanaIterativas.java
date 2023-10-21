//Pedir un número al usuario y mostrar el nombre del día al que corresponde (1=lunes

import java.util.Scanner;

public class DiaSemanaIterativas{
  public static void comprobarDiaSemanaFor(int d){
    String dia = "";
    for(int i = 1; i <= 1; i++){
     if(d > 7 || d < 0 || d == 0){
	System.out.println("Introduzca un número del 1 al 7");
    } else {
    switch (d) {
       case 1:
	    dia = "Lunes";
            break;
	case 2:
	    dia = "Martes";
            break;
	case 3:
	    dia = "Miércoles";
            break;
	case 4:
	    dia = "Jueves";
            break;
	case 5:
	    dia = "Viernes";
            break;
	case 6:
	    dia = "Sábado";
            break;
	case 7:
	    dia = "Domingo";
            break;   
   }
  }
   System.out.println("el número " + d + " corresponde al " + dia);
   
  }
   
 }

//System.out.println("");
  
   public static void comprobarDiaSemanaWhile(int d){
   String dia = "";
   while(d<=1){
   if(d > 7 || d < 0 || d == 0){
	System.out.println("Introduzca un número del 1 al 7");
    } else {
    switch (d) {
       case 1:
	    dia = "Lunes";
            break;
	case 2:
	    dia = "Martes";
            break;
	case 3:
	    dia = "Miércoles";
            break;
	case 4:
	    dia = "Jueves";
            break;
	case 5:
	    dia = "Viernes";
            break;
	case 6:
	    dia = "Sábado";
            break;
	case 7:
	    dia = "Domingo";
            break;   
   }
   //d++;
  }
   System.out.println("el número " + d + " corresponde al " + dia);
   
 }
}

//System.out.println("");

public static void comprobarDiaSemanaDoWhile(int d){
  String dia = "";
  do{
     if(d > 7 || d < 0 || d == 0){
	System.out.println("Introduzca un número del 1 al 7");
    } else {
    switch (d) {
       case 1:
	    dia = "Lunes";
            break;
	case 2:
	    dia = "Martes";
            break;
	case 3:
	    dia = "Miércoles";
            break;
	case 4:
	    dia = "Jueves";
            break;
	case 5:
	    dia = "Viernes";
            break;
	case 6:
	    dia = "Sábado";
            break;
	case 7:
	    dia = "Domingo";
            break;   
   }
   //d++;
  }
   System.out.println("el número " + d + " corresponde al " + dia);
 }while(d <=1);
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el número: ");
    int num = sc.nextInt();

    comprobarDiaSemanaDoWhile(num);
 }
}
