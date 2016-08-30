package Application;

import javax.swing.*;

/**
 * Created by nosie on 29/08/2016.
 */
public class TelaCadastroPessJuridica extends TelaCadastroConta{
    private JTextField cnpj_correntista;
    private JTextField nomefantasia_correntista;
    private JButton socios_correntista;
    @Override
    protected void ConfiguraLabel(){
        super.ConfiguraLabel();
        criarLabel("CNPJ:");
        criarLabel("Nome Fantasia:");
        criarLabel("Socios:");
    }

    @Override
    protected void ConfiguraTextField(){
        super.ConfiguraTextField();
        cnpj_correntista = criarCampo();
        nomefantasia_correntista = criarCampo();

        JButton textField = new JButton("Consultar");
//        textField.setColumns(10);
        textField.setBounds(TextLeft, topCampo, 130, 22);
        topCampo += 30;
        getContentPane().add(textField);
        socios_correntista = textField;
    }

    @Override
    protected void limparCampos(){
        super.limparCampos();
        cnpj_correntista.setText("");
        nomefantasia_correntista.setText("");
//        socios_correntista.setText("");
    }

    @Override
    protected void ConfiguraButton(){
        topBotao += (30 * 3);
        super.ConfiguraButton();

    }
}
