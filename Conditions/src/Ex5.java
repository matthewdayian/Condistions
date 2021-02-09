import java.util.Scanner;
/*
* Author : Matthew
* Date : Feb. 9, 2021
*/
public class Ex5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Combien de jeux est-ce que tu as gagner dans tes 6 premiere jeux");
		int victoires=sc.nextInt();
		
		if (victoires>=5)
			System.out.println("group 1");
		else
			if (3<=victoires<=4)
				System.out.println("group 2");
			else
				if (victoires<=2)
					System.out.println("group 3");
				else
					if (victoires==0)
						System.out.println("eliminer");
		
	}

}
