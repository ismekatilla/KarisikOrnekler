package org.ismek;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.print("0-50 arasında bir sayı giriniz = ");
		Scanner scanner = new Scanner(System.in);
		int girilenSayi = scanner.nextInt();
		if (girilenSayi < 0 || girilenSayi > 50) {
			System.out.print("0-50 arasında bir sayı girmelisiniz");
		} else {
			if (girilenSayi % 5 == 0) {
				System.out.println("Sayı 5 in katıdır");
			} else if (girilenSayi % 4 == 0) {
				System.out.println("Sayı 4 in katıdır");
			} else if (girilenSayi % 3 == 0) {
				System.out.println("Sayı 3 in katıdır");
			} else if (girilenSayi % 2 == 0) {
				System.out.println("Sayı 2 in katıdır");
			} else {
				System.out.println("Sayı kalansız bölünemedi.");
			}
		}
	}
}
