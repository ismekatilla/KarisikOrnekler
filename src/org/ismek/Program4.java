package org.ismek;

public class Program4 {

	public static void main(String[] args) {

		int a = 1;
		first: while (a == 1) {
			second: while (a == 1) {
				break first;
			}
			System.out.println("MATİKO");
		}
		
		System.out.println("Atiko");
	}
}