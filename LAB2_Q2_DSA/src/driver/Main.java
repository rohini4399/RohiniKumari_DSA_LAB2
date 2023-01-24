package driver;

import service.MergeSort;
import service.NotesRatio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		NotesRatio nr = new NotesRatio();
		MergeSort ms = new MergeSort();

		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] notes = new int[size];

		for (int i = 0; i < size; i++) {

			notes[i] = sc.nextInt();

		}

		System.out.println("Enter the amount to pay");
		int amount = sc.nextInt();

		ms.sortValues(notes, 0, size - 1);
		nr.ImplementationNotesRatio(notes, amount);
	}
}
