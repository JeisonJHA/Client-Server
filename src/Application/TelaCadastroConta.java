package Application;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nosie on 24/08/2016.
 */
abstract class TelaCadastroConta extends JFrame{
    protected static final int LabelSize = 170;
    protected static final int TextLeft = 210;
    protected int topBotao = 130;
    protected int topLabel = 40;
    protected int topCampo = 39;
    private JTextField nome_correntista;
    private JTextField numero_conta;
    private JTextField endereco_correntista;
    private JButton cadastrar;
    private JButton cancelar;
    private int height = 300;

    private void Configura() {
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        ConfiguraLabel();
        ConfiguraTextField();
        ConfiguraButton();
        setBounds(200, 200, 400, height);
    }
    protected void ConfiguraLabel(){
        JLabel label1 = new JLabel("Escreva as informações:");
        label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label1.setBounds(46, 10, 219, 16);
        getContentPane().add(label1);

        criarLabel("Numero da conta:");
        criarLabel("Nome do correntista:");
        criarLabel("Endereço do correntista:");
    }

    protected void criarLabel(String nome) {
        JLabel label = new JLabel(nome);
        label.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label.setBounds(46, topLabel, LabelSize, 16);
        topLabel += 30;
        getContentPane().add(label);
    }

    protected void ConfiguraTextField(){
        numero_conta = criarCampo();
        nome_correntista = criarCampo();
        endereco_correntista = criarCampo();
    }

    protected JTextField criarCampo(){
        JTextField textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(TextLeft, topCampo, 130, 22);
        topCampo += 30;
        getContentPane().add(textField);
        return textField;
    }

    protected void ConfiguraButton(){
        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(59, topBotao, 97, 25);
        setCadastrar(cadastrar);

        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(159, topBotao, 97, 25);
        setCancelar(cancelar);

        getContentPane().add(getCadastrar());
        getContentPane().add(getCancelar());
        getCadastrar().addActionListener(new Cadastrar());
        getCancelar().addActionListener(new Cancelar());
        if (topBotao + 50 >= height) {
            height = topBotao + 80;
        }
    }

    private class Cadastrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class Cancelar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            limparCampos();
        }
    }

    protected void limparCampos(){
        numero_conta.setText("");
        nome_correntista.setText("");
        endereco_correntista.setText("");
    }

    TelaCadastroConta(){
        Configura();
    }

    public JTextField getEndereco_correntista() {
        return endereco_correntista;
    }

    public void setEndereco_correntista(JTextField endereco_correntista) {
        this.endereco_correntista = endereco_correntista;
    }

    public JTextField getNome_correntista() {
        return nome_correntista;
    }

    public void setNome_correntista(JTextField nome_correntista) {
        this.nome_correntista = nome_correntista;
    }

    public JTextField getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(JTextField numero_conta) {
        this.numero_conta = numero_conta;
    }

    public JButton getCadastrar() {
        return cadastrar;
    }

    public void setCadastrar(JButton cadastrar) {
        this.cadastrar = cadastrar;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public void setCancelar(JButton cancelar) {
        this.cancelar = cancelar;
    }
}
