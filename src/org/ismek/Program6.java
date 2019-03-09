package org.ismek;

import java.util.Random;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rastgeleSayi = random.nextInt(10);
		System.out.println(rastgeleSayi);
		int tahminEdilenSayi = -1;
		boolean dogruTahmin = false;
		do {
			System.out.print("Sayıyı tahmin et = ");
			tahminEdilenSayi = scanner.nextInt();
			dogruTahmin = rastgeleSayi == tahminEdilenSayi;
			if (!dogruTahmin) {
				System.out.println("Yanlış tahmin tekrar denemelisin!");
			}
		} while (!dogruTahmin);
		
		System.out.println("Başardın tebrikler");
		scanner.close();
	}

}
