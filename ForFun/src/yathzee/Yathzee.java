package yathzee;

import java.util.Random;

public class Yathzee {

	public static void main(String[] args) {
		boolean Yathzee = false;
		int dobbelsteen1;
		int dobbelsteen2;
		int dobbelsteen3;
		int dobbelsteen4;
		int dobbelsteen5;
		double aantal = 0;
		double dropkans = 1;
		int som = 0;
		int[] dobbelstenen = new int[6];
		int teller = 0;
		Random rand = new Random();

		while (!Yathzee) {
			aantal++;
			teller = 0;
			som = 0;

			dobbelsteen1 = rand.nextInt(6 - 1 + 1) + 1;
			dobbelsteen2 = rand.nextInt(6 - 1 + 1) + 1;
			System.out.println("dobbelsteen 1: " + dobbelsteen1);
			System.out.println("dobbelsteen 2: " + dobbelsteen2);
			dobbelstenen[teller]++;
			teller++;
			
			if (dobbelsteen1 == dobbelsteen2) {
				dobbelstenen[teller]++;
				teller++;
				dobbelsteen3 = rand.nextInt(6 - 1 + 1) + 1;
				System.out.println("dobbelsteen 3: " + dobbelsteen3);
				if (dobbelsteen2 == dobbelsteen3) {
					dobbelstenen[teller]++;
					teller++;
					dobbelsteen4 = rand.nextInt(6 - 1 + 1) + 1;
					System.out.println("dobbelsteen 4: " + dobbelsteen4);
					if (dobbelsteen3 == dobbelsteen4) {
						dobbelstenen[teller]++;
						teller++;
						dobbelsteen5 = rand.nextInt(6 - 1 + 1) + 1;
						System.out.println("dobbelsteen 5: " + dobbelsteen5);
						if (dobbelsteen4 == dobbelsteen5) {
							dobbelstenen[teller]++;
							teller++;
							Yathzee = true;
							System.out.printf("%d%d%d%d%d%n", dobbelsteen1, dobbelsteen2, dobbelsteen3, dobbelsteen4,
									dobbelsteen5);
						}

					}
				}
			}
			System.out.println(aantal);

		}
		
		
		// 1 - ( ( 1 - x ) ^ y )

		dropkans = (1.0 - Math.pow(1.0 - 0.00077160493, aantal)) * 100;
		System.out.printf("%.0f pogingen, %.2f procent kans%n", aantal, dropkans);
		
		dobbelstenen[5] = 1;
		for (int i = 0; i < dobbelstenen.length; i++) {
			System.out.println(i + 1 + " of a kind = " + dobbelstenen[i]);
		}
	}

}
