package com.lab.pagamento.operadoras;

import com.lab.pagamento.Autorizavel;
import com.lab.pagamento.Cartao;
import com.lab.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal()< 100;
	}

}
