package Ejercicio5;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		
		MiVector Vector = new MiVector(10);
		Scanner teclado= new Scanner(System.in);
		
		int numero= 4;
		
		while(numero!=0) {
			System.out.println("Elige una opción");
			System.out.println("1 -Añadir un número");
			System.out.println("2 -Borrar un número");
			System.out.println("3 -Imprimir informacion del vector");
			System.out.println("0 -SALIR");
			
			numero=teclado.nextInt();
		
			switch(numero) {
			
			
				case 0:
					System.out.println("\nGRACIAS POR USAR ESTE VECTOR TAN GUAY\n");
					break;
				
				case 1:
					System.out.println("\nIntroduce el numero que quieras añadir\n");
					int numeroLeido = teclado.nextInt();
					System.out.println("\nLa posicion donde lo has colocado--->"+Vector.add(numeroLeido)+"\n");
					break;
				case 2:
					//Borrar un numero
					break;
		
				case 3:
					System.out.println("\n"+Vector.toString()+"\n");
					System.out.println("La cantidad de vacios seria-->"+Vector.cuantosEspaciosQueda());
					break;
			
				default:
					System.out.println("\n opcion incorrecta\n");
			
			}
			
		
		}
	}

}
