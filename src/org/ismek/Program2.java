package org.ismek;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Topla");
		System.out.println("2. Çarp");
		System.out.print("Lütfen işlem numarası giriniz = ");
		
		byte islemNumarasi = scanner.nextByte();
		
		System.out.print("1. Sayıyı Giriniz = ");
		int birinciSayi = scanner.nextInt();
		
		System.out.print("2. Sayıyı Giriniz = ");
		int ikinciSayi = scanner.nextInt();
		
		int sonuc = 0;
		
		if (islemNumarasi == 1) {
			sonuc = birinciSayi + ikinciSayi;
		} else {
			sonuc = birinciSayi * ikinciSayi;
		}
		System.out.println(sonuc);
	}
}