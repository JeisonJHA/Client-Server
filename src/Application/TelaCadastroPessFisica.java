package Application;

import Client.EstadoCivil;
import Client.TipoSexo;

import javax.swing.*;

/**
 * Created by nosie on 29/08/2016.
 */
class TelaCadastroPessFisica extends TelaCadastroConta {
    private JTextField cpf_correntista;
    private JTextField idade_correntista;
    private JTextField nascimento_correntista;
    private JComboBox sexo_correntista;
    private JComboBox estadocivil_correntista;

    @Override
    protected void ConfiguraLabel(){
        super.ConfiguraLabel();
        criarLabel("CPF:");
        criarLabel("Idade:");
        criarLabel("Nascimento:");
        criarLabel("Sexo:");
        criarLabel("Estado Civil:");
    }

    @Override
    protected void ConfiguraTextField(){
        super.ConfiguraTextField();
        cpf_correntista = criarCampo();
        idade_correntista = criarCampo();
        nascimento_correntista = criarCampo();
        sexo_correntista = new JComboBox<>(TipoSexo.values());
        sexo_correntista.setBounds(TextLeft, topCampo, 130, 22);
        sexo_correntista.setSelectedIndex(-1);
        topCampo += 30;
        getContentPane().add(sexo_correntista);
        estadocivil_correntista = new JComboBox<>(EstadoCivil.values());
        estadocivil_correntista.setBounds(TextLeft, topCampo, 130, 22);
        estadocivil_correntista.setSelectedIndex(-1);
        topCampo += 30;
        getContentPane().add(estadocivil_correntista);
    }

    @Override
    protected void limparCampos(){
        super.limparCampos();
        cpf_correntista.setText("");
        idade_correntista.setText("");
        nascimento_correntista.setText("");
        sexo_correntista.setSelectedIndex(-1);
        estadocivil_correntista.setSelectedIndex(-1);
    }

    @Override
    protected void ConfiguraButton(){
        topBotao += (30 * 5);
        super.ConfiguraButton();
    }
}
