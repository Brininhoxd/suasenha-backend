package com.senha.suasenha.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senha.suasenha.api.bean.SenhaBean;
import com.senha.suasenha.rest.SenhaFacade;

@RestController
@RequestMapping("/senha")
public class SenhaService {
	private SenhaFacade senhaFacade = new SenhaFacade();

	@GetMapping("")
	public String getSenha(SenhaBean parametrosSenha) {
		return senhaFacade.getSenha(parametrosSenha);
	}
}
