package gerador;

import java.util.Scanner;
import java.util.Random;

public class GerarSenha {

	public static void main(String[] args) {
	
		//Vetores com todos os caracteres que podem ser utilizados na senha:
		String[] Uppercase = {
			"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
		};
		
		String[] Lowcase = {
			"a","b","c","d","e","f","g","h","i","j","k","l","m","o","p","q","r","s","t","u","v","w","x","y","z"
		};
		
		String [] Numbers = {
			"0","1","2","3","4","5","6","7","8","9"
		};
		
		String [] SpecialCharacter = {
			"!","@","#","$","%","&","*","-","_","+","^","~","<",">","?","/","\""
		};
		
		//Interface de usuário:
		Scanner tl = new Scanner(System.in);
		System.out.println("Qual o tamanho da senha? ");
		int numCaracteres = tl.nextInt();
		if (numCaracteres >= 6 && numCaracteres <= 16) {
			StringBuilder caracteresPermitidos = new StringBuilder();
			
			System.out.println("Você quer uma senha com letras maiúsculas? [S/N]");
			boolean letrasMaiusculas = tl.next().equalsIgnoreCase("S");
			
			System.out.println("Você quer uma senha com letras minúsculas? [S/N]");
			boolean letrasMinusculas = tl.next().equalsIgnoreCase("S");
			
			System.out.println("Você quer uma senha com números [S/N]");
			boolean numeros = tl.next().equalsIgnoreCase("S");
			
			System.out.println("Você quer uma senha com caracteres especiais [S/N]");
			boolean caracteresEspeciais = tl.next().equalsIgnoreCase("S");
			
			if (letrasMaiusculas) {
				caracteresPermitidos.append(Uppercase);
			}
			
			if (letrasMinusculas) {
				caracteresPermitidos.append(Lowcase);
			}
			
			if (numeros) {
				caracteresPermitidos.append(Numbers);
			}
			
			if (caracteresEspeciais) {
				caracteresPermitidos.append(SpecialCharacter);
			}
			
			if (caracteresPermitidos.length() == 0) {
	            System.out.println("Você não selecionou nenhum tipo de caractere permitido. Por favor, escolha pelo menos um tipo.");
	            return; // Encerra o programa
	        }
			
			
			Random random = new Random();
			StringBuilder senhaRandom = new StringBuilder();
			
			for(int i = 0; i <= numCaracteres; i++) {
				int caracteresRandom = random.nextInt(caracteresPermitidos.length());
				char caractereAleatorio = caracteresPermitidos.charAt(caracteresRandom);
	            senhaRandom.append(caractereAleatorio);
			}
			
			System.out.println(senhaRandom.toString());
		
		} else {
			System.out.println("Sua senha deve possuir de 6 à 16 dígitos.");
			return;
		}
	}


}
