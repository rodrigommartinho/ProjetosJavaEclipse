public class Programa {

	public static void main(String[] args) {

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Alexandre");
		fornecedor.setEndereco("Alameda Campinhas");
		fornecedor.setCnpj("06.028.596/0001-14");

		Cliente cliente = new Cliente();
		cliente.setNome("Romulo");
		cliente.setEndereco("Avenida Paulista");
		cliente.setCpf("000.000.000-00");
		
		System.out.println("Nome Fornecedor::" + fornecedor.getNome());
		System.out.println("Endereço Fornecedor::" + fornecedor.getEndereco());
		System.out.println("CNPJ Fornecedor::" + fornecedor.getCnpj());
		System.out.println("----------------------------------");
		System.out.println("Nome Cliente::" + cliente.getNome());
		System.out.println("Endereço Cliente::" + cliente.getEndereco());
		System.out.println("CPF Cliente::" + cliente.getCpf());
		
	}

}
