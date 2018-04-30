public class Conta {
	private int numeroConta;
	private Cliente titular;
	private double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
            //System.out.println("Saldo Insuficiente para Saque");
	    }
	}
	
	public void depositar (double valor){
	    this.saldo += valor;
	}
	
	public boolean transferir (Conta contaDestino, double valor){
	    System.out.println("---------------------------");
	    System.out.println("--------------Transferencia");
	    System.out.println("Saldo da ContaOriginal::" + this.saldo);
	    System.out.println("Saldo da ContaDestino::" + contaDestino.saldo);
	
	    if(valor <= this.saldo){
	        this.saldo -= valor;
	        contaDestino.saldo += valor;
	        System.out.println("--------------Transferencia de::" + valor + " realizada");
	        System.out.println("SaldoAtual da ContaOriginal::" + this.saldo);
	        System.out.println("SaldoAtual da ContaDestino::" + contaDestino.saldo);
	        return true;
	    }else {
	        System.out.println("--------------Transferencia de::" + valor + " nao realizada. Saldo de::" + this.saldo + " insuficiente");
	        System.out.println("SaldoAtual da ContaOriginal::" + this.saldo);
	        System.out.println("SaldoAtual da ContaDestino::" + contaDestino.saldo);
	        return false;
	    }
	    
	}
}
