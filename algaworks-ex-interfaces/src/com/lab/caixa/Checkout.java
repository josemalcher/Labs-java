package com.lab.caixa;

import com.lab.impressao.Impressora;
import com.lab.pagamento.Cartao;
import com.lab.pagamento.Operadora;

public class Checkout {
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		super();
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		if(autorizado) {
			this.impressora.imprimir(compra);
		}else {
			System.out.println("Pagamento foi negado!");
		}
		
	}
	
}
