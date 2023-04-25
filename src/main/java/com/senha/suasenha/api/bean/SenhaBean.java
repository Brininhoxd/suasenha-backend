package com.senha.suasenha.api.bean;

public class SenhaBean {

	private int quantidadeCaracteres;
	private boolean letrasMaiusculas;
	private boolean letrasMinusculas;
	private boolean simbolos;
	private boolean numeros;

	public int getQuantidadeCaracteres() {
		return quantidadeCaracteres;
	}

	public void setQuantidadeCaracteres(int quantidadeCaracteres) {
		this.quantidadeCaracteres = quantidadeCaracteres;
	}

	public boolean isLetrasMaiusculas() {
		return letrasMaiusculas;
	}

	public void setLetrasMaiusculas(boolean letrasMaiusculas) {
		this.letrasMaiusculas = letrasMaiusculas;
	}

	public boolean isLetrasMinusculas() {
		return letrasMinusculas;
	}

	public void setLetrasMinusculas(boolean letrasMinusculas) {
		this.letrasMinusculas = letrasMinusculas;
	}

	public boolean isSimbolos() {
		return simbolos;
	}

	public void setSimbolos(boolean simbolos) {
		this.simbolos = simbolos;
	}

	public boolean isNumeros() {
		return numeros;
	}

	public void setNumeros(boolean numeros) {
		this.numeros = numeros;
	}

	public String toString() {
		return "Quantidade: " + quantidadeCaracteres + ", LM: " + letrasMaiusculas + ", lm: " + letrasMinusculas
				+ ", S: " + simbolos + ", n: " + numeros;
	}
}
