package entities;

public abstract class Conta {
    private int numero;
    private String cpf;
    protected double saldo = 300.0;
    private boolean ativo;

    public Conta(int numero, String cpf) {
        this.numero = numero;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo() {
        this.ativo = true;
    }

    public double debito(double valorDebito) {
        if (valorDebito <= this.saldo) {
            this.saldo -= valorDebito;
        } else {
            System.out.println("SALDO INDISPONÍVEL");
        }
        return this.saldo;
    }

    public double credito(double valorCredito) {
        this.saldo += valorCredito;
        return this.saldo;
    }
}
