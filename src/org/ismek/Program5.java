package org.ismek;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bölenleri alınacak sayıyı giriniz = ");
		int bolenleriAlinacakSayi = scanner.nextInt();
		for (int i = 2; i < bolenleriAlinacakSayi; i++) {
			if (bolenleriAlinacakSayi % i == 0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}