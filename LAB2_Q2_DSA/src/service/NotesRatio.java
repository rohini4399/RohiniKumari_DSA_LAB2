package service;

public class NotesRatio {

	public void ImplementationNotesRatio(int[] notes, int amount) {

		int[] Counter = new int[notes.length];

		try {

			for (int i = 0; i < notes.length; i++) {

				if (amount >= notes[i]) {

					Counter[i] = amount / notes[i];
					amount = amount - (Counter[i] * notes[i]);

				}
			}

			if (amount > 0) {

				System.out.println("Proper denominations are not present for the given amount!");

			} else {
				System.out.println("Your payment approach inn order to give min no of notes will be");

				for (int i = 0; i < notes.length; i++) {

					if (Counter[i] != 0)
						System.out.println(notes[i] + " : " + Counter[i]);

				}
			}

		} catch (ArithmeticException e) {

			System.out.println(e + "Enter valid denomination");

		}

	}

}
