
import java.util.Scanner;

public class TesteVotacao3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Entre com sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18){ //18, 19, 20, 21, 22, 23...
			
			System.out.println("\n\tTem que votar!");
			
		} else { //17, 16, 15, 14...
			
		if (idade >= 16){ // 17, 16
			System.out.println("Pode votar!?!");	
			
	} else{ //15, 14

			System.out.println("\n\t NAO pode votar...");
			
			}
		}
	}
}

