package entities;

public class ContaCorrente extends Conta {
    private int contadorTalao;

    public ContaCorrente(int numero, String cpf) {
        super(numero, cpf);
    }

    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }

    public int pedirTalao(int contador) {
        if (contador > 3) {
            this.debito(30 * contador);
        }
        return this.contadorTalao += contador;
    }

    @Override
    public String toString() {
        return "| Numero da conta: " + getNumero() + "| Saldo da Conta: " + getSaldo()
                + "| CPF do Titular: " + getCpf() + "  Quantidade de Talões: " + getContadorTalao() + " |";
    }
}
