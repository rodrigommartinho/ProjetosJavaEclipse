public class Funcionario {
    private String nome;
    private String departamento;
    protected double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
    
	public boolean calculaSalario(){
		if(this.salario <= 1000.00) {
			this.salario = this.salario - (this.salario * 0.06);
			return true;
		}else {
			System.out.println("Valores Inválidos!!");
			return false;
		} 
    }

    //Sobrecarga de Método
    public boolean calculaSalario(double horaExtra){
    	if(this.salario <= 1000.00) {
	        double valorHoraExtra = (this.salario/30) / 8 * horaExtra;
	        this.salario = this.salario - (this.salario * 0.06) + valorHoraExtra;
	        return true;
    	}else {
			System.out.println("Valores Inválidos!!");
			return false;
    	}
    }

    public double bonifica (){
    	return this.salario * 0.10;
    }

    public void demite(){
        estaNaEmpresa = false;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }
    
}
