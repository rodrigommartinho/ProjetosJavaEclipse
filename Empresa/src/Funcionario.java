/**
     * Documentação da Classe Funcionario da Empresa
     * @author rodrigo
     */
public abstract class Funcionario {
    private String nome;
    private String departamento;
    protected double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;
    
    /**
     * Método get do Atributo Nome
     * @return nome
     * @author rodrigo
     */
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
    
	public abstract boolean calculaSalario();

    public abstract boolean calculaSalario(double horaExtra);
    
    public abstract double bonifica();

    public void demite(){
        estaNaEmpresa = false;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }
    
}
