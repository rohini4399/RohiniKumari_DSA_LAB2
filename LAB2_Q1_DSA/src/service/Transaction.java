package service;

import java.util.*;

public class Transaction {

	public int sizeOfarray, numoftargets;
	Scanner sc = new Scanner(System.in);

	public void ImplementTransaction() {

		int array[];
		System.out.println("Enter the size of transaction array:");
		sizeOfarray = sc.nextInt();
		array = new int[sizeOfarray];
		getData(array, sizeOfarray);
		System.out.println("Enter the total no of targets that needs to be achieved:");
		numoftargets = sc.nextInt();
		check(array, sizeOfarray, numoftargets);
	}

	void getData(int array[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Enter transaction " + (i + 1) + ":");
			array[i] = sc.nextInt();
		}
	}

	void check(int array[], int sizeOfarray, int numoftargets) {

		while (numoftargets-- > 0) {

			int flag = 0, sum = 0;
			long target;
			System.out.println("Enter the target value:");
			target = sc.nextInt();

			for (int i = 0; i < sizeOfarray; i++) {

				sum += array[i];

				if (sum >= target) {

					System.out.println("Target achieved after " + (i + 1) + " transaction(s)");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("Target was unachievable");
			}
		}

	}
}
