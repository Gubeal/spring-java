package com.algaworks.algafood;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Configuration
public class AlfaConfig {
	
//	@Autowired
//	private NotificadorEmail notificadorEmail;
////	@Bean
////	public NotificadorEmail notificadorEmail() {
////		NotificadorEmail notificador = new NotificadorEmail();
////		notificador.setCaixaAlta(true);
////		
////		return (notificador);
////	}
//	
//	@Bean
//	public AtivacaoClienteService ativacaoClienteService() {
//		List<Notificador> notificadores = new ArrayList<Notificador>();
//		notificadores.add(notificadorEmail);
//		return new AtivacaoClienteService(notificadores);
//	}
}
