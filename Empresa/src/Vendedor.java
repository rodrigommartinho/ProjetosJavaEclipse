public class Vendedor extends Funcionario{

	@Override
	public boolean calculaSalario() {
		if(this.salario <= 1000.00) {
			this.salario = this.salario - (this.salario * 0.06);
			return true;
		}else {
			System.out.println("Valores Inválidos!!");
			return false;
		} 
	}
	
	@Override
	public boolean calculaSalario(double horaExtra) {
    	if(this.salario <= 1000.00) {
	        double valorHoraExtra = (this.salario/30) / 8 * horaExtra;
	        this.salario = this.salario - (this.salario * 0.06) + valorHoraExtra;
	        return true;
    	}else {
			System.out.println("Valores Inv�lidos!!");
			return false;
    	}
	}

	@Override
	public double bonifica() {
		return this.salario * 0.10;
	}
	
}
