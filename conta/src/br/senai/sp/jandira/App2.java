package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alvares Cabral");
		pedro.setCpf("12345645");
		pedro.setTelefone("4563732");
        pedro.setCep("23354");		
        
        // Criar da conta do Pedro 
        Conta contaPedro = new Conta();
        contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("2255-10");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
	}

}
