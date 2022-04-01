package com.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ClienteTest {

	public static void main(String[] args) {
		Cliente vinicius = new Cliente("vinicius", new Telefone("16997509324", 50), new Conta(250));
		
		vinicius.getConta().setRecarga(25);
		
		new Recarga().realizaRecarga(vinicius);
		
		Assert.assertEquals(vinicius.getConta().getSaldo(), 225);
	}
}
