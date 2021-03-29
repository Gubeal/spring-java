package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail {
	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através de email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem );
	}
}
