public class ControleDeBonificacao {
	private double totalDeBonus;
	
	public double getTotalDeBonus() {
		return totalDeBonus;
	}

	public double calculaTotalDeBonus(Funcionario funcionario) {
		return this.totalDeBonus += funcionario.bonifica();
	}
	
	//Sobrecarga do Metodo
	/*
	public double calculaTotalDeBonus(Gerente gerente) {
		return this.totalDeBonus += gerente.bonifica();
	}
	
	public double calculaTotalDeBonus(Supervisor supervisor) {
		return this.totalDeBonus += supervisor.bonifica();
	}
	*/
}
