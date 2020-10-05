package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		//String � do tipo refer�ncia
		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original: " + email);
		System.out.println("Min�sculo: " + email.toLowerCase());
		System.out.println("Mai�sculo: " + email.toUpperCase());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Existe @?: " + email.contains("@"));
		System.out.println("Quantidade de car�cteres: " + email.length());
		System.out.println("Do 2 ao 4: " + email.substring(1,4));
		System.out.println("A partir do 2: " + email.substring(1));
		System.out.println("Nome do Usu�rio: " + email.substring(0,email.indexOf("@")));
		//exerc�cio: retornar o servidor
		System.out.println("Servidor: " + email.substring(email.indexOf("@") + 1));
		//exercicio: retornar servidor sem .com
		System.out.println("Servidor sem .com: " + email.substring(email.indexOf("@")+1,email.indexOf(".com")));
		//exercicio: retornar a primeira metade do e-mail
		System.out.println("primeira metade do string: " + email.substring(0,( (int) email.length()/2)));
		System.out.println("Compara��o: " + email.equals("xpto@gmail.com"));
		System.out.println("Compara��o com Case: " + email.equalsIgnoreCase("xpto@gmail.com"));
	}

}
