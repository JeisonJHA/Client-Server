package Client;

import java.util.List;

/**
 * Created by nosie on 24/08/2016.
 */
public class PessoaJuridica {
    private String cnpj;
    private String nomeFantasia;
    private List<PessoaFisica> socios;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<PessoaFisica> getSocios() {
        return socios;
    }

    public void setSocios(List<PessoaFisica> socios) {
        this.socios = socios;
    }
}
