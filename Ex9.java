
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ex9 {

    public static void main(String[] args) {
        //Criando os componentes
        JFrame janela = new JFrame(); //Cria a janela
        JLabel labelUsuario = new JLabel("Usuário:"); //Cria o texto fixo
        JTextField campoUsuario = new JTextField("Insira seu usuário"); //Cria um campo texto para preencher
        JLabel labelSenha = new JLabel("Senha:"); //Cria o texto fixo
        JPasswordField campoSenha = new JPasswordField(); //Cria um campo senha para preencher
        JButton botao = new JButton("Login"); //Cria o botão 

        //Definindo locais e tamanhos dos componentes
        labelUsuario.setBounds(300, 100,50,50); //Define local e tamanho do texto na janela        
        campoUsuario.setBounds(400,100,120,50); //Define local e tamanho do campo texto na janela
        labelSenha.setBounds(300, 200,50,50); //Define local e tamanho do texto na janela        
        campoSenha.setBounds(400,200,120,50); //Define local e tamanho do campo texto na janela
        botao.setBounds(400, 300, 100, 50); //Define local e tamanho do botão na janela


        //Adicionado os componentes
        janela.add(labelUsuario); //Adiciona o texto na janela
        janela.add(campoUsuario); //Adiciona o campo texto na janela
        janela.add(labelSenha); //Adiciona o texto na janela
        janela.add(campoSenha); //Adiciona o campo senha na janela
        janela.add(botao); //Adiciona o botão na janela janela.add(botao); //Adiciona o botão na janela


        botao.addActionListener((ActionEvent e) -> { //Dispara ao pressionar do botão
            String usuario = campoUsuario.getText(); //Captura o que digitou de usuário
            String senha = new String(campoSenha.getPassword()); //Captura o que digitou de senha
            System.out.println("A conta atual é: " + usuario + " => " + senha); //Reporta por CMD
            campoUsuario.setText(""); //Limpa o campo na tela
            campoSenha.setText(""); //Limpa o campo na tela
        });

        janela.setLayout(null); //Apaga o layout padrão de deixar todo objeto na tela inteira

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //Pega o tamanho do monitor

        janela.setBounds(screenSize.width/6, screenSize.height/6, screenSize.width/2, screenSize.height/2); //Define local e tamanho da janela, proporcional ao monitor

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Define que a janela feche quando o programa parar
        janela.setVisible(true); //Deixa a janela visível

    }
}
