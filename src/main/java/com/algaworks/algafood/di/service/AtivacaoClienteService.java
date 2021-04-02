package com.algaworks.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private List<Notificador> notificadores;
	
	public AtivacaoClienteService(List<Notificador> notificadores) {
		this.notificadores = notificadores;
		
		System.out.println("AtivacaoClienteService: " + notificadores);
	}

	
	public void ativar(Cliente cliente) throws Exception {
		cliente.ativar();
		
		if (notificadores != null) {
			throw new Exception("Notificador não encontrado");
		} else {
			for (Notificador notificador : notificadores) {
				notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
			}
		}
		
	}
}
