package com.company;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class AlignedGaps {

	private static boolean areGapsAligned(double coordinates_x[], double coordinates_y[], double coordinates_z[]) {
		/* ------------------- INSERT CODE HERE ---------------------*/

		/*
		 * coordinates_x[i], coordinates_y[i], coordinates_z[i] denote the x-y-z coordinates of the i'th gap in the asteroid field.
		 *
		 * Your code should return true if all the gaps are aligned, i.e., they all lie on a single line.
		 *
		 */


		/* -------------------- END OF INSERTION --------------------*/
		double xDiff = coordinates_x[1] - coordinates_x[0];
		double yDiff = coordinates_y[1] - coordinates_y[0];
		double zDiff = coordinates_z[1] - coordinates_z[0];

		double r = (coordinates_x[2] - coordinates_x[0])/xDiff;
		if (Math.abs((coordinates_y[2] - coordinates_y[0])-r * yDiff) < 0.00001 && Math.abs((coordinates_z[2] - coordinates_z[0]) - r * zDiff) < 0.00001 ){
            return true;
        }
        else return false;


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int n = 0; n < numCases; n++)
		{
			int num = sc.nextInt();
			double[] coordinates_x = new double[num];
			double[] coordinates_y = new double[num];
			double[] coordinates_z = new double[num];
			for(int i = 0; i < num; i++) {
				coordinates_x[i] = sc.nextDouble();
				coordinates_y[i] = sc.nextDouble();
				coordinates_z[i] = sc.nextDouble();
			}

			if(areGapsAligned(coordinates_x, coordinates_y, coordinates_z)) {
				System.out.println("Gaps are aligned.");
			} else {
				System.out.println("Gaps are NOT aligned.");
			}
		}

		sc.close();
	}
}
