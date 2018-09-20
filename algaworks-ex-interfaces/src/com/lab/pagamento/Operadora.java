package com.lab.pagamento;

public interface Operadora {
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
