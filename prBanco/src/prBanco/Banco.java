package prBanco;

public class Banco {
int iban;
double saldo;
	public Banco(int iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}
	public int getIban (){
	     return iban;
	}

	public void setAtributo (int iban){
	    this.iban = iban;
	}
	public double getSaldo (){
	     return saldo;
	}

	public void setSaldo (double saldo){
	    this.saldo = saldo;
	}
	
}
