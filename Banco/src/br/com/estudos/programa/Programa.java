package br.com.estudos.programa;
import br.com.estudos.model.cliente.Cliente;
import br.com.estudos.model.conta.Conta;

public class Programa {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		cliente.setCpf("000.000.000-00");
		
		Conta conta = new Conta();
		conta.setNumeroConta(123);
		conta.setTitular(cliente);
		conta.setSaldo(1000.00);
		
		System.out.println("Nome::" + conta.getTitular().getNome());
		System.out.println("Cpf::" + conta.getTitular().getCpf());
		System.out.println("NumeroConta::" + conta.getNumeroConta());
		System.out.println("Saldo::" + conta.getSaldo());
		
	}
}
