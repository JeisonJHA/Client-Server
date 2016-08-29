package Client;

import java.util.List;

/**
 * Created by nosie on 24/08/2016.
 */
public class Correntista {
    private List<Conta> conta;
    private String nome;
    private String endereco;

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
