package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através de email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem );
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
