package br.com.estudos.model.funcionario;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
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
    
	public void calculaSalario(double salario){
        this.salario = salario - (salario * 0.06);
    }

    //Sobrecarga de M�todo
    public void calculaSalario(double salario, double horaExtra){
        double valorHoraExtra = (salario/30) / 8 * horaExtra;
        this.salario = salario - (salario * 0.06) + valorHoraExtra;
    }

    public void bonifica (double valor){
        System.out.println("--------------");
        System.out.println("Parabens. Salario Atual::" + salario + " Bonificacao de::" + valor);
        salario += valor;
        System.out.println("SalarioAtual::" + salario);
    }

    public void demite(){
        estaNaEmpresa = false;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }
    
}
