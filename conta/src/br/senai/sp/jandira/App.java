package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		
		Conta contaDaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaDaAnaGomes.setTitular("Ana Gomes");
		contaDaAnaGomes.setNumero("111-98");
		contaDaAnaGomes.setTipo("Corrente");
		contaDaAnaGomes.setAtiva(true);
		contaDaAnaGomes.setChequeespecial(200);
		contaDaAnaGomes.depositar(100);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.depositar(30);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(50);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(500);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(50);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(80);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.depositar(100);
		contaDaAnaGomes.mostrarSaldoDaConta();
		
		double valorSaldo = contaDaAnaGomes.getSaldo();
		
		System.out.println("*****" + valorSaldo);
//		System.out.println("Nome:"+ contaDaAnaGomes.getTitular());
		System.out.println("Tipo:" + contaDaAnaGomes.getNumero());
		System.out.println("Conta:" + contaDaAnaGomes.getChequeespecial());
		
		
		
	} 


}

