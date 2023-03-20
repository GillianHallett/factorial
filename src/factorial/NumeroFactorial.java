package factorial;

import java.util.Scanner;
/*
 * Clase que calcula el factorial de un numero.
 * @autor halle
 * 
 */
public class NumeroFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fac = 1, num, exit = 0;

		do {
				System.out.println("Introduce un numero: ");
				num = sc.nextInt();
				if (num > 0) {
					System.out.println("El factor de " + num + " es " + factorial(num));
				}
			} while (exit != 0);
			System.out.println("si desea salir del programa pulse 0");
			exit = sc.nextInt();
		}

	private static int factorial(int num) {
		 if ( num == 0)
		return 1;
		 else 
			 return num*factorial(num - 1);
	
	}

}
