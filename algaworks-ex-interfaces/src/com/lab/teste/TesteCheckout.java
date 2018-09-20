package com.lab.teste;

import com.lab.caixa.Checkout;
import com.lab.caixa.Compra;
import com.lab.impressao.Impressora;
import com.lab.impressao.impressoras.ImpressoraEpson;
import com.lab.impressao.impressoras.ImpressoraHP;
import com.lab.pagamento.Cartao;
import com.lab.pagamento.Operadora;
import com.lab.pagamento.operadoras.Cielo;
import com.lab.pagamento.operadoras.RedCard;

public class TesteCheckout {

	public static void main(String[] args) {
		
		Operadora operadora = new RedCard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Jose Malcher Jr");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("JOSE MALCHER Jr.");
		compra.setProduto("SAPATO");
		compra.setValorTotal(50);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);

	}

}
