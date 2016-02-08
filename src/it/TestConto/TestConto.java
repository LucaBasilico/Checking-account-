package it.TestConto;

import java.util.Scanner;

public class TestConto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContoCorrente accountHolder = new ContoCorrente("Marco",1000);
		Scanner sc = new Scanner(System.in);
		
		boolean point = true;
		System.out.println("Buongiorno Sig."+accountHolder.getName());
		System.out.println("E' un piacere riaverla al nostro sportello della banca Bipppp");
		System.out.println("************--------------************");
		do{
			System.out.println("Inserisci l'operazione da compiere:");
			System.out.println("Premi 1: per prelevare");
			System.out.println("Premi 2: per versare");
			System.out.println("Premi 3: per vedere lo status del conto");
			System.out.println("*************************************");
			int operation = sc.nextInt();
			
			switch (operation) {
			case 1:
				System.out.println("Inserisi l'importo da ritirare:");
				double withdrawQuantity = sc.nextInt();
				accountHolder.withdraw(withdrawQuantity);
				break;
			case 2:
				System.out.println("Inserisi l'importo da versare:");
				int depositQuantity = sc.nextInt();
				accountHolder.deposit(depositQuantity);
				System.out.println(accountHolder.getcheckAccount());
				break;
			case 3:
				System.out.println("Attualmente hai "+accountHolder.getcheckAccount()+"€ nel conto.");
				break;
			default:
				System.out.println("Operazione non in linea con il nostro sportello. Riprovare");
				break;
			}
		System.out.println("*************************************");
		System.out.println("Vuole effettuare altre operazioni");
		System.out.println("Digita 1 per effettuarne una nuova");
		System.out.println("Digita 2 per concludere");
		int check = sc.nextInt();
			if(check == 2){
				point = false;
				System.out.println("*************************************");
				System.out.println("Grazie e buona giornata!");
			}
		}while(point);
	}
}
