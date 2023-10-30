package gerador;

public class GerarSenha {

	public static void main(String[] args) {
	
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
		
		int upperLength = Uppercase.length;
		int lowLength = Lowcase.length;
		int numberLength = Numbers.length;
		int specialLength = SpecialCharacter.length;
		
		int rand1 = (int) (Math.random() * upperLength);
		int rand2 = (int) (Math.random() * lowLength);
		int rand3 = (int) (Math.random() * numberLength);
		int rand4 = (int) (Math.random() * specialLength);
		
		String senha = Uppercase[rand1] + Lowcase[rand2] + Numbers[rand3] + SpecialCharacter[rand4];
		
		System.out.println("Sua senha é: " + senha);

	}

}
