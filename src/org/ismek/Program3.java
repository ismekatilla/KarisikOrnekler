package org.ismek;

public class Program3 {
	
	// Değişkenlerin metoda parametre geçilmesi durumlarındaki tepkisi ne olacak
	// int ve Integer parametre geçilse değer değiştirilse ne olur	

	public static void main(String[] args) {
		Integer i = new Integer(100);
		i++; // ERROR 1

		Integer x = new Integer(12);
		Integer y = new Integer(13);
		Integer z = x + y; // ERROR 2

		int a = new Integer(99); // ERROR 3
		Integer b = 555; // ERROR 4

		int k = 777;
		Integer l = new Integer(333);
		int m = k + l; // ERROR 6
	}
}