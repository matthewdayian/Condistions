import java.util.Scanner;

/*
* Author : Matthew
* Date : Feb. 5, 2021
*/
public class EX1 {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Quelle est la premiere chiffre des 4 numéros");
			int ch1=sc.nextInt();
			System.out.println("Quelle est la deuxieme chiffre des 4 numéros");
			int ch2=sc.nextInt();
			System.out.println("Quelle est la troisieme chiffre des 4 numéros");
			int ch3=sc.nextInt();
			System.out.println("Quelle est la derniere chiffre des 4 numéros");
			int ch4=sc.nextInt();
			
			if(ch1==8-9)
				System.out.println("correcte");
			else
				if(ch1==0-7)
					System.out.println("incorrecte");
			
			if(ch2==ch3)
				System.out.println("correcte");
			else
				if(ch2!=ch3)
					System.out.println("incorrecte");
			
			if(ch4==8-9)
				System.out.println("correcte");
			else
				if(ch4!=8-9)
					System.out.println("incorrecte");
		}

	}

}
