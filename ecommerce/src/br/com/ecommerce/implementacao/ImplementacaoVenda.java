package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementacaoVenda {

	public static void main(String[] args) {
		//informa��es do produto
		Produto produto = new Produto();
		produto.setDescricao("Celular Samsung S20 2 TB 8 GB RAM");
		produto.setId(905021);
		produto.setQtde(5);
		produto.setValorCompra(Magica.f("Valor"));
		produto.setValorVenda(produto.getValorCompra() * (float)1.2);
		//informa��es do cliente
		Cliente cliente = new Cliente();
		cliente.setId(987267174);
		cliente.setNome("Victor Roeder");
		//informa��es do Endere�o e amarra��o com o cliente
		Endereco endereco = new Endereco();
		endereco.setAll("R. Jo�o Pessoa", "Santo Antonio", "Joinville", "SC", "89203-100", "948", "N/A");
		cliente.setEndereco(endereco);
		//informa��es da venda
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setData(1, 10, 2020);
		venda.setNotaFiscal(9085);
		venda.setProduto(produto);
		venda.setTotal(produto.getValorVenda() * produto.getQtde());
		System.out.println(venda.getAll());
	}
}
