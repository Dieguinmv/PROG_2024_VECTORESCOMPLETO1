package Ejercicio5;

import java.util.Arrays;

public class MiVector {
	
	private int datos[];
	private int cuantosHay;
	
	public MiVector(int capacidad) {
		cuantosHay = 0;
		datos = new int[capacidad];
	}
	
	public int add(int valor) {
		
		// si caben mas numeros
		if(cuantosHay<datos.length) {
			//coloco donde cuantosHay
			datos[cuantosHay] = valor;
			//añado uno mas al contadoe de elmentos
			cuantosHay++;
			//devuelvo la posición en la que entró el último
			return cuantosHay-1;	
		}
		
		return -1;
	}
	
	
	public String toString() {
		
		String devolver = "MiVector [";
		
		for(int i =0;i<cuantosHay-1;i++) {
			devolver += datos[i]+", ";
		}
		devolver += datos[cuantosHay-1]+"]";
		
		return devolver;
		
	}
	
	public int cuantosEspaciosQueda() {
		return datos.length - cuantosHay;
	}
	
	
}
