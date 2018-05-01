public class Gerente extends Funcionario{
    private String login;
    private String senha;
    
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	    
    public void autentica (String login, String senha) {
    	if((this.login == login) && (this.senha == senha)) {
    		System.out.println("Acesso Permitido!!");
    	}else {
    		System.out.println("Acesso Negado!!");
    	}
    }
    
    @Override
	public boolean calculaSalario(){
		if(this.salario > 1000.00) {
			this.salario = this.salario - (this.salario * 0.11);
			return true;
		}else {
			System.out.println("Valores Inv�lidos!!");
			return false;
		} 
    }

    @Override
    public boolean calculaSalario(double horaExtra){
    	if(this.salario > 1000.00) {
	        double valorHoraExtra = (this.salario/30) / 8 * horaExtra;
	        this.salario = this.salario - (this.salario * 0.11) + valorHoraExtra;
	        return true;
    	}else {
			System.out.println("Valores Inv�lidos!!");
			return false;
    	}
    }
    
    @Override
    public double bonifica (){
    	return this.salario * 0.15;
    }
}
