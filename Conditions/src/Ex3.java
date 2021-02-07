import java.util.Scanner;
/*
* Author : Matthew
* Date : Feb. 7, 2021
*/
public class Ex3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ecrire la limite du vitesse");
		int vitesselimitant = sc.nextInt();
		System.out.println("Ecrire la limite de ton voiture");
		int vitessevoiture = sc.nextInt();
		
		if (vitesselimitant>vitessevoiture)
			System.out.println("Congratulations, you are within the speed limit");
		else
			if (vitesselimitant<vitessevoiture)
				System.out.println("");
		if (vitessevoiture-vitesselimitant<20)
			System.out.println("Your fine is 100$");
		else
			if (vitessevoiture-vitesselimitant<30)
				System.out.println("Your fine is 270$");
			else
				if (vitessevoiture-vitesselimitant>30)
					System.out.println("Your fine is 500$");
	}

}
