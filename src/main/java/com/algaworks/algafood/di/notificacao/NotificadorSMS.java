package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s por SMS através do telefone %s usando SMTP %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), this.hostServidorSmtp, mensagem );
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
