package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;

public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
//		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
}
