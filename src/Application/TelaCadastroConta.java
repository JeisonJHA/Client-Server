package Application;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Created by nosie on 24/08/2016.
 */
class TelaCadastroConta extends JFrame{
    private JTextField nome_correntista;
    private JTextField matricula_aluno;
    private JTextField curso_aluno;
    private JButton cadastrar;
    private JButton cancelar;

    private void Configura() {
        setBounds(200, 200, 400, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    }
    public void ConfiguraLabel(){
        JLabel label1 = new JLabel("Escreva as informações:");
        label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label1.setBounds(46, 10, 219, 16);

        JLabel label2 = new JLabel("Nome do aluno:");
        label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label2.setBounds(46, 39, 110, 16);
        label2.setVerticalAlignment(SwingConstants.TOP);

        JLabel label3 = new JLabel("Matricula do aluno:");
        label3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label3.setBounds(46, 71, 122, 16);

        JLabel label4 = new JLabel("Curso do aluno:");
        label4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label4.setBounds(46, 100, 110, 16);

        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
    }

    public void ConfiguraTextField(){
        JTextField textfield1 = new JTextField();
        textfield1.setBounds(179, 37, 130, 22);
        textfield1.setColumns(10);
        setNome_aluno(textfield1);

        JTextField textField2 = new JTextField();
        textField2.setColumns(10);
        textField2.setBounds(178, 70, 130, 22);
        setMatricula_aluno(textField2);

        JTextField textField3 = new JTextField();
        textField3.setColumns(10);
        textField3.setBounds(179, 99, 130, 22);
        setCurso_aluno(textField3);

        getContentPane().add(getNome_aluno());
        getContentPane().add(getMatricula_aluno());
        getContentPane().add(getCurso_aluno());
    }
    public void ConfiguraButton(){
        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(59, 129, 97, 25);
        setCadastrar(cadastrar);

        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(159, 129, 97, 25);
        setCancelar(cancelar);

        getContentPane().add(getCadastrar());
        getContentPane().add(getCancelar());
    }

    TelaCadastroConta(){
        Configura();
    }
}
