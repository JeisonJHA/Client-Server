package Application;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Application.TipoPessoa.*;

/**
 * Created by nosiej on 24/08/2016.
 */

class MainForm extends JFrame {
    private JMenuItem sair;
    private JMenuItem conta;
    private JMenuItem correntista;
    private JMenuItem pessoaFisica;
    private JMenuItem pessoaJuridica;
    private JMenuItem agencia;

    private void Configura() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 500, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        {
            JLabel lblBemVindo = new JLabel("Bem vindo!!");
            lblBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblBemVindo.setBounds(157, 76, 165, 62);
            contentPane.add(lblBemVindo);
        }
        this.PreparaMenu();
        getSair().addActionListener(new Sair(this));
        getPessoaFisica().addActionListener(new Conta(Fisica));
        getPessoaJuridica().addActionListener(new Conta(Juridica));
    }

    private void PreparaMenu(){
        JMenuBar barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);

        JMenu inicio = new JMenu("Inicio");
        JMenu cadastro = new JMenu("Cadastro");
        JMenu movimentacoes = new JMenu("Movimentações");
        barraMenu.add(inicio);
        barraMenu.add(cadastro);
        barraMenu.add(movimentacoes);

        setSair(new JMenuItem("Sair"));
        inicio.add(getSair());

        setAgencia(new JMenuItem("Agência"));
        cadastro.add(getAgencia());
        setCorrentista(new JMenu("Correntista"));
        cadastro.add(getCorrentista());
        setConta(new JMenuItem("Conta"));
        cadastro.add(getConta());

        setPessoaFisica(new JMenuItem("Pessoa Física"));
        setPessoaJuridica(new JMenuItem("Pessoa Jurídica"));
        getCorrentista().add(getPessoaFisica());
        getCorrentista().add(getPessoaJuridica());
    }

    private JMenuItem getSair() {
        return sair;
    }

    private void setSair(JMenuItem sair) {
        this.sair = sair;
    }

    private JMenuItem getConta() {
        return conta;
    }

    private void setConta(JMenuItem conta) {
        this.conta = conta;
    }

    private JMenuItem getCorrentista() {
        return correntista;
    }

    private void setCorrentista(JMenuItem correntista) {
        this.correntista = correntista;
    }

    private JMenuItem getAgencia() {
        return agencia;
    }

    private void setAgencia(JMenuItem agencia) {
        this.agencia = agencia;
    }

    public JMenuItem getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(JMenuItem pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public JMenuItem getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(JMenuItem pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    private class Sair implements ActionListener {

        private MainForm tela;

        Sair(MainForm tela) {
            this.tela = tela;
        }

        public void actionPerformed(ActionEvent e) {
            tela.setVisible(false);
            Runtime.getRuntime().exit(0);
        }
    }

    private class Conta implements ActionListener {
        private TipoPessoa tipoPessoa;

        Conta(TipoPessoa t){
            tipoPessoa = t;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Fisica == tipoPessoa) {
                TelaCadastroPessFisica conta = new TelaCadastroPessFisica();
                conta.setVisible(true);
            }
            else if (Juridica == tipoPessoa){
                TelaCadastroPessJuridica conta = new TelaCadastroPessJuridica();
                conta.setVisible(true);
            }
        }
    }

    MainForm(){
        Configura();
    }
}
