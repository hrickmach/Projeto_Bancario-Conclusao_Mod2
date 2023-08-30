package entities;

public class ContaEspecial extends Conta {
    private double limite = 1000.0;

    public ContaEspecial(int numero, String cpf, double limite) {
        super(numero, cpf);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
				
    public double debito(double valorDebito) {
        if (valorDebito <= this.saldo) {
            this.saldo -= valorDebito;
            System.out.println("Seu saldo é de: R$" + this.saldo + ". Limite especial não utilizado.");
        } else if (valorDebito > this.saldo && valorDebito <= limite) {
            limite = (this.saldo + limite) - valorDebito;
            this.saldo = 0;

            System.out.println("Seu saldo é de: R$" + this.saldo + ". Seu limite especial é de: R$" + limite);
        } else if (valorDebito > limite && valorDebito > this.saldo) {
            System.out.println("----------------------------");
            System.out.println("Limite e saldo indisponíveis.");
            System.out.println("----------------------------");
        }
        return limite;
    }
}
