package basic.dev;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

	private static final int j = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		input(a);
		prlinr(a);
		demChanLe(a);
		sapXep(a);
		print(a);
		demSoNguyenTo(a);
	}

	private static void demSoNguyenTo(int[] a) {
		// TODO Auto-generated method stub
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrimary(a[i]))
				dem++;
		}
		System.out.format("Mang co %d so nguyen to", dem).println();
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = ramdomIteger(min, max);
		}
	}

	private static void sapXep(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
	}

	private static void demChanLe(int[] a) {
		// TODO Auto-generated method stub
		int demChan = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				demChan++;
		}
		System.out.format("%d so chan, %d so le", demChan, a.length - demChan);
	}

	private static void prlinr(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Mang a");
		for (int i = 0; i < a.length; i++) {
			System.out.format("%d", a[i]).print("\t");
		}
		System.out.println();
	}

	private static void input(int[] a) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = ramdomIteger(min, max);

		}
	}

	private static int ramdomIteger(int min, int max) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(max + 1 - min) + min;

	}

	private static boolean isPrimary(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 2)
			return true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

}
