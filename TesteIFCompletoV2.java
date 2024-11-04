import java.util.Scanner;

public class TesteIFCompletoV2 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.print ("Entre com sua idade: " );
		idade = leia.nextInt();
		
		if( idade < 18){
			System.out.println("\n\tNão pode tirar a CNH!");                              
	}else {
		System.out.println("\n\tPode tirar a CNH!");
	} 
	System.out.println("\n Fim do programa!");
}

}
