
import java.util.Scanner;

public class TesteVotacao4 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Entre com sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18)
			
			System.out.println("\n\tTem que votar!");
			
		else 
			
			if (idade >= 16)
			
				System.out.println("Pode votar!?!");	
				
			else

				System.out.println("\n\t NAO pode votar...");
			
	
	}
}

