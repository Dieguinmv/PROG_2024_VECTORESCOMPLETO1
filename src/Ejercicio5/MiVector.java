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
		
		datos[cuantosHay] = valor;
		cuantosHay++;
		
		return cuantosHay;
	}
	
	
	public String toString() {
		return Arrays.toString(datos);
	}
	
	public int cuantosEspaciosQueda() {
			
		return datos.length - cuantosHay;
	}
	
	
}
