package gerador;

import java.util.Scanner;
import java.util.Random;

public class GerarSenha {

	    public static void main(String[] args) {
	        Scanner tl = new Scanner(System.in);

	        System.out.println("Bem-vindo ao Gerador de Senhas!");
	        int numCaracteres = obterTamanhoSenha(tl);

	        if (numCaracteres >= 6 && numCaracteres <= 16) {
	            String caracteresPermitidos = obterCaracteresPermitidos(tl);
	            if (caracteresPermitidos.isEmpty()) {
	                System.out.println("Você não selecionou nenhum tipo de caractere permitido. Por favor, escolha pelo menos um tipo.");
	                return;
	            }

	            String senhaRandom = gerarSenhaAleatoria(numCaracteres, caracteresPermitidos);
	            System.out.println("Sua senha aleatória: " + senhaRandom);
	        } else {
	            System.out.println("O tamanho da senha deve ser de 6 a 16 caracteres.");
	        }
	    }

	    private static int obterTamanhoSenha(Scanner tl) {
	        System.out.print("Qual o tamanho da senha? ");
	        return tl.nextInt();
	    }

	    private static String obterCaracteresPermitidos(Scanner tl) {
	        StringBuilder caracteresPermitidos = new StringBuilder();
	        System.out.print("Você quer uma senha com letras maiúsculas? [S/N]: ");
	        boolean letrasMaiusculas = tl.next().equalsIgnoreCase("S");

	        System.out.print("Você quer uma senha com letras minúsculas? [S/N]: ");
	        boolean letrasMinusculas = tl.next().equalsIgnoreCase("S");

	        System.out.print("Você quer uma senha com números? [S/N]: ");
	        boolean numeros = tl.next().equalsIgnoreCase("S");

	        System.out.print("Você quer uma senha com caracteres especiais? [S/N]: ");
	        boolean caracteresEspeciais = tl.next().equalsIgnoreCase("S");

	        if (letrasMaiusculas) {
	            caracteresPermitidos.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	        }

	        if (letrasMinusculas) {
	            caracteresPermitidos.append("abcdefghijklmnopqrstuvwxyz");
	        }

	        if (numeros) {
	            caracteresPermitidos.append("0123456789");
	        }

	        if (caracteresEspeciais) {
	            caracteresPermitidos.append("!@#$%^&*");
	        }

	        return caracteresPermitidos.toString();
	    }

	    private static String gerarSenhaAleatoria(int numCaracteres, String caracteresPermitidos) {
	        Random random = new Random();
	        StringBuilder senhaRandom = new StringBuilder();

	        for (int i = 0; i < numCaracteres; i++) {
	            int caracteresRandom = random.nextInt(caracteresPermitidos.length());
	            char caractereAleatorio = caracteresPermitidos.charAt(caracteresRandom);
	            senhaRandom.append(caractereAleatorio);
	        }

	        return senhaRandom.toString();
	    }
	}
