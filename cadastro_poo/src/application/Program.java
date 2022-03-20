package application;

import java.util.Locale;
import java.util.Scanner;



import cadastro.*;

public class Program {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Cadastro Cadastro = new Cadastro();
		
		System.out.println("Cadastro Usuario: ");
		System.out.print("Email: ");
		Cadastro.email = sc.nextLine();
		System.out.print("Cpf: ");
		Cadastro.cpf = sc.nextDouble();
		System.out.print("Telefone: ");
		Cadastro.telefone = sc.nextInt();
		
		System.out.println("Cadastro feito com sucesso!");
		
		System.out.println("Bem vindo: " + Cadastro);
	
		sc.close();
		}
}
