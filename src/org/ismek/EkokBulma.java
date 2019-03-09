package org.ismek;

import java.util.Scanner;

public class EkokBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ekok alınacak sayıyı giriniz = ");
		int ekokAlinacakSayi = scanner.nextInt();
		for (int i = 2; i <= ekokAlinacakSayi; i++) {
			if (ekokAlinacakSayi % i == 0) {
				System.out.println(i);
				ekokAlinacakSayi = ekokAlinacakSayi / i;
				i--;
			}
		}
	}
}