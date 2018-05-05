public class Filme {
    //Atributos da Classe Filmes
    int codigo;
    String nome;
    double valor;
    boolean estaDisponivel;
    
    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setDisponivel(boolean disponivel) {
    	this.estaDisponivel = disponivel;
    }
    
    public boolean isEstaDisponivel() {
		return estaDisponivel;
	}

	public void retirar(){
    	if (this.estaDisponivel == true) {
    		this.estaDisponivel = false;
    		System.out.println("-----------------------");
    		System.out.println("Este Filme::" +  this.nome + " foi alugado com sucesso!!");
    	} else {
    		System.out.println("-----------------------");
    		throw new RuntimeException("Este Filme::" + this.nome + " não esta disponivel para locação!!!");
    	}
    }

    public void devolver(){
        estaDisponivel = true;
    }
    
    public void mostra() {
    	System.out.println("-----------------------");
    	System.out.println(codigo);
		System.out.println(nome);
		System.out.println(valor);
		System.out.println(estaDisponivel);
    }
}
