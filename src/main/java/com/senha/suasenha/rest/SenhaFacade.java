package com.senha.suasenha.rest;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.senha.suasenha.api.bean.SenhaBean;

public class SenhaFacade {
	public String getSenha(SenhaBean parametrosSenha) {
		if (!parametrosSenha.isLetrasMaiusculas() && !parametrosSenha.isLetrasMinusculas()
				&& !parametrosSenha.isNumeros() && !parametrosSenha.isSimbolos()) {
			return "";
		}

		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letrasMaiusculas = alfabeto;
		String letrasMinusculas = alfabeto.toLowerCase();
		String numeros = "0123456789";
		String simbolos = "!@#$%&*()-_+={}[]|:<>?.";

		StringBuilder caracteres = new StringBuilder();

		caracteres.append(parametrosSenha.isLetrasMaiusculas() ? letrasMaiusculas : "");
		caracteres.append(parametrosSenha.isLetrasMinusculas() ? letrasMinusculas : "");
		caracteres.append(parametrosSenha.isNumeros() ? numeros : "");
		caracteres.append(parametrosSenha.isSimbolos() ? simbolos : "");

		return gerarSenha(caracteres.toString(), parametrosSenha.getQuantidadeCaracteres());
	}

	private String gerarSenha(String caracteres, int tamanho) {
		SecureRandom random = new SecureRandom();
		List<Character> chars = new ArrayList<Character>();

		for (int i = 0; i < tamanho; i++) {
			chars.add(caracteres.charAt(random.nextInt(caracteres.length())));
		}

		Collections.shuffle(chars);

		StringBuilder sb = new StringBuilder();
		for (Character c : chars) {
			sb.append(c);
		}

		return sb.toString();
	}

}
