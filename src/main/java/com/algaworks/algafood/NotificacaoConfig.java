package com.algaworks.algafood;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

public class NotificacaoConfig {

	@Bean
	public List<Notificador> notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.setCaixaAlta(true);
		
		List<Notificador> notificadores = new ArrayList<Notificador>();
		notificadores.add(notificador);
		return notificadores;
	}
}
