package Client;

/**
 * Created by nosie on 24/08/2016.
 */
public class Conta {
    private Correntista correntista;
    private Agencia agencia;
    private int numero;
    private double saldo;
    private double limite;

    private Correntista getCorrentista() {
        return correntista;
    }

    private void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    private Agencia getAgencia() {
        return agencia;
    }

    private void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    private int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {

    }

    public void sacar(double valor){

    }

    public double saldo(){

        return 0;
    }

    public void CriarConta(Correntista cor, Agencia age) {

    }
}
