package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false)
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if (notificador != null) {
			notificador.notificar(cliente, "Não existe notificador, mas cliente foi ativado");
		} else {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
		
	}
}
