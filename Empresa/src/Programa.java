public class Programa {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Joao");
		funcionario.setRg("00.000.000-00");
		funcionario.setDepartamento("Almoxarifado");
		funcionario.setDataEntrada("00/00/0000");
		funcionario.setSalario(1000.00);
		funcionario.setEstaNaEmpresa(true);

		Gerente gerente = new Gerente();
		gerente.setNome("Kleber");
		gerente.setRg("00.000.000-00");
		gerente.setDepartamento("Almoxarifado");
		gerente.setDataEntrada("00/00/0000");
		gerente.setSalario(2000.00);
		gerente.setEstaNaEmpresa(true);
		gerente.setLogin("g1");
		gerente.setSenha("123");
		
		Supervisor supervisor = new Supervisor();
		supervisor.setSalario(3000.00);
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.calculaTotalDeBonus(funcionario);
		controle.calculaTotalDeBonus(gerente);
		controle.calculaTotalDeBonus(supervisor);

		System.out.println("Nome::" + funcionario.getNome());
		System.out.println("Rg::" + funcionario.getRg());
		System.out.println("Departamento::" + funcionario.getDepartamento());
		System.out.println("Data de Entrada::" + funcionario.getDataEntrada());
		System.out.println("Salario::" + funcionario.getSalario());
		System.out.println("Ativo::" + funcionario.isEstaNaEmpresa());
		//System.out.println("Bonificação::" + funcionario.bonifica());
		//System.out.println(funcionario.calculaSalario());
		//System.out.println("Calcula Salario::" + funcionario.getSalario());
		System.out.println("---------------------------------");
		
		gerente.autentica("g1", "123");
		System.out.println("Nome Gerente::" + gerente.getNome());
		System.out.println("Rg Gerente::" + gerente.getRg());
		System.out.println("Departamento Gerente::" + gerente.getDepartamento());
		System.out.println("Data de Entrada Gerente::" + gerente.getDataEntrada());
		System.out.println("Salario Gerente::" + gerente.getSalario());
		System.out.println("Ativo Gerente::" + gerente.isEstaNaEmpresa());
		//System.out.println("Bonificação Gerente::" + gerente.bonifica());
		//System.out.println(gerente.calculaSalario());
		//System.out.println("Calcula Salario Gerente::" + gerente.getSalario());
		System.out.println("---------------------------------");

		System.out.println("Total de Bonus::" + controle.getTotalDeBonus());
		
	}
}
