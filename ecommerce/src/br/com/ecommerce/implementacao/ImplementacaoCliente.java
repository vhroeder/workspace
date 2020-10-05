package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;
import br.com.ecommerce.tela.Magica;

public class ImplementacaoCliente {

	public static void main(String[] args) {
		
		char opcao = Magica.s("Digite\n<1> PJ\n<2> PF").charAt(0);
		Cliente cliente = null;
		if (opcao =='1') {
			cliente = new PessoaJuridica(
					Magica.i("ID"),
					Magica.s("Nome"),
					new Endereco(
							Magica.s("Logradouro"),
							Magica.s("Bairro"),
							Magica.s("Cidade"),
							Magica.s("Estado"),
							Magica.s("CEP"),
							Magica.s("N�mero da resid�ncia"),
							Magica.s("Complemento")
							),
					Magica.s("CNPJ"),
					Magica.s("Inscri��o Estadual"),
					Magica.s("Contato")
					);
		}else if (opcao == '2') {
			cliente = new PessoaFisica(
					Magica.i("ID"),
					Magica.s("Nome"),
					new Endereco(
							Magica.s("Logradouro"),
							Magica.s("Bairro"),
							Magica.s("Cidade"),
							Magica.s("Estado"),
							Magica.s("CEP"),
							Magica.s("N�mero da resid�ncia"),
							Magica.s("Complemento")
							),
					Magica.s("CPF"),
					Magica.s("RG"),
					Magica.s("Data de Nascimento")
					)
					;
		}else {
			System.out.println("Op��o Inv�lida");
		}
		System.out.println(cliente.getAll());
	}

}
