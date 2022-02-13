package com.logesh.time;

/**
 * @author Logesh
 *
 */
public class GreetingTest {

	public static void main(String[] args) {

		String message = "HAPPY BIRTHDAY!!";

		int lineCount = 0;

		while (true) {

			int min = 0;
			int max = 10;

			int wishMin = 0;
			int wishMax = 10;

			int horizontalRandVal1 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal2 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal3 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal4 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal5 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal6 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal7 = min + (int) (Math.random() * ((max - min) + 1));
			int horizontalRandVal8 = min + (int) (Math.random() * ((max - min) + 1));

			int i = 0;

			int wishRandVal = wishMin + (int) (Math.random() * ((wishMax - wishMin) + 1));
			while (i <= max) {

				System.out.print(i == horizontalRandVal1 ? "*" : " ");
				System.out.print(i == horizontalRandVal2 ? "*" : " ");
				System.out.print(i == horizontalRandVal4 ? "*" : " ");
				System.out.print(i == horizontalRandVal6 ? "*" : " ");
				System.out.print(i == horizontalRandVal8 ? "*" : " ");
				System.out.print(i == horizontalRandVal5 ? "*" : " ");

				System.out.print(i == horizontalRandVal3 && horizontalRandVal4 % 2 == 0 ? "!" : " ");
				System.out.print(i == horizontalRandVal7 && horizontalRandVal5 % 2 == 0 ? "$" : " ");

				if (lineCount % 7 == 0 && wishRandVal == i) {
					System.out.print(message);
					lineCount = 1;
				}

				i++;
			}
			lineCount++;
			System.out.println();
			sleepThread();
		}

	}

	public static void sleepThread() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
