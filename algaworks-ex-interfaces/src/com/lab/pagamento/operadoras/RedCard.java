package com.lab.pagamento.operadoras;

import com.lab.pagamento.Autorizavel;
import com.lab.pagamento.Cartao;
import com.lab.pagamento.Operadora;

public class RedCard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("321") && autorizavel.getValorTotal()< 50;
	}

}
