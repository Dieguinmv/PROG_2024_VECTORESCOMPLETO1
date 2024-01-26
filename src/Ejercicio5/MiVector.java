package Ejercicio5;

import java.util.Arrays;

public class MiVector {
	
	private int vector[];
	private int cuantosHay;
	
	public MiVector(int capacidad) {
		cuantosHay = 0;
		vector = new int[capacidad];
	}
	
	public int add(int valor) {
		
		vector[cuantosHay] = valor;
		cuantosHay++;
		
		return cuantosHay;
	}
	
	
	public String toString() {
		return Arrays.toString(vector);
	}
	
	public int cuantosEspaciosQueda() {
			
		return vector.length - cuantosHay;
	}
	
	
}
