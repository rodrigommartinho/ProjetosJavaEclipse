public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Joao");
		pessoa.setEndereco("Alameda Jau");
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Alexandre");
		fornecedor.setEndereco("Alameda Campinhas");
		fornecedor.setCnpj("06.028.596/0001-14");

		Cliente cliente = new Cliente();
		cliente.setNome("Romulo");
		cliente.setEndereco("Avenida Paulista");
		cliente.setCpf("000.000.000-00");
		
		System.out.println("Nome Pessoa::" + pessoa.getNome());
		System.out.println("Endereço Pessoa::" + pessoa.getEndereco());
		System.out.println("----------------------------------");
		System.out.println("Nome Fornecedor::" + fornecedor.getNome());
		System.out.println("Endereço Fornecedor::" + fornecedor.getEndereco());
		System.out.println("CNPJ Fornecedor::" + fornecedor.getCnpj());
		System.out.println("----------------------------------");
		System.out.println("Nome Cliente::" + cliente.getNome());
		System.out.println("Endereço Cliente::" + cliente.getEndereco());
		System.out.println("CPF Cliente::" + cliente.getCpf());
		
	}

}
