package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bill;

public class Program {

	public static void main(String[] args) {
		
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Bill conta = new Bill();
		
		System.out.printf("Sexo: ");							// entra com o sexo
		conta.gender = sc.next().charAt(0);
				
		while (conta.gender!= 'F' && conta.gender != 'M') {		// valida sexo
			System.out.printf("\n Valor invalido! Favor digitar F ou M: ");
			conta.gender = sc.next().charAt(0);
		}

		System.out.printf("Quantidade de cervejas: "); 			// entra qdt de cervejas
		conta.beer = sc.nextInt();

		System.out.printf("Quantidade de refrigerantes: ");		// entra quantidade refrigerantes
		conta.softDrink = sc.nextInt();

		System.out.printf("Quantidade de espetinhos: ");		// entra quantidade espetinhos
		conta.barbecue = sc.nextInt();
	
		System.out.println("\n RELATÓRIO: \n");					// Relatorio final
		System.out.printf("Consumo = R$ %.2f\n", conta.feeding());	// verifica consumo
		
		double vlCover = conta.cover();							// verifica couvert
		
		if (vlCover == 0) {
			System.out.printf("Isento de Couvert \n");
		}
		else {
			System.out.printf("Couvert = R$ %.2f\n", vlCover);
		}
		
		System.out.printf("Ingresso =  R$ %.2f %n", conta.ticket() ); // totaliza ingresso
		System.out.printf("\nValor a pagar =  R$ %.2f %n", conta.total() );  //totaliza a conta
		
		sc.close();
	}

}
