package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementacaoVendaConstrutor {

	public static void main(String[] args) {
		Venda objeto = new Venda(
				Magica.i("Nota FIscal"),
				Magica.s("data"),
				Magica.f("Total"),
				new Produto(
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.i("Quantidade"),
						Magica.f("Valor de Compra"),
						Magica.f("Valor de venda")
						),
				new Cliente(
						Magica.i("ID Cliente"),
						Magica.s("Nome Cliente"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("CEP"),
								Magica.s("N�mero da resid�ncia"),
								Magica.s("Complemento")
								)
						)
				);
		System.out.println(objeto.getAll());
	}

}
