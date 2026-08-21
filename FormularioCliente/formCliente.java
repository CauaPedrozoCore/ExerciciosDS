import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class formCliente extends JFrame {
        
    private JLabel lbNome, lbEmail, lbGenero, lbServicos, lbCidade;
    private JTextField txNome, txEmail;
    private JButton btSalvar;
    
    private ButtonGroup grupoGenero;
    private JRadioButton btMasc, btFem;
    private JCheckBox chkSuporte, chkManutencao;
    private JComboBox<String> comboCidade;
            
    public formCliente() {
        setTitle("Cadastro de Cliente");
        setSize(450, 350);
        setLocationRelativeTo(null); // centraliza a janela na tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // layout nulo para posicionamento manual via setBounds
        
        // nome
        lbNome = new JLabel("Nome:");
        lbNome.setBounds(30, 30, 80, 25);
        add(lbNome);                
        
        txNome = new JTextField();
        txNome.setBounds(100, 30, 250, 25);
        add(txNome);
        
        // email
        lbEmail = new JLabel("E-mail:");
        lbEmail.setBounds(30, 70, 80, 25);
        add(lbEmail);                
        
        txEmail = new JTextField();
        txEmail.setBounds(100, 70, 250, 25);
        add(txEmail);
        
        // gênero
        lbGenero = new JLabel("Gênero:");
        lbGenero.setBounds(30, 110, 80, 25);
        add(lbGenero);
        
        btMasc = new JRadioButton("Masculino");
        btMasc.setBounds(100, 110, 100, 25);
        add(btMasc);                
        
        btFem = new JRadioButton("Feminino");
        btFem.setBounds(200, 110, 100, 25);
        add(btFem);        
        
        grupoGenero = new ButtonGroup(); 
        grupoGenero.add(btMasc);
        grupoGenero.add(btFem);
        
        // serviços
        lbServicos = new JLabel("Serviços:");
        lbServicos.setBounds(30, 150, 80, 25);
        add(lbServicos);

        chkSuporte = new JCheckBox("Suporte Técnico");
        chkSuporte.setBounds(100, 150, 130, 25);
        add(chkSuporte);        
        
        chkManutencao = new JCheckBox("Manutenção");
        chkManutencao.setBounds(230, 150, 120, 25);
        add(chkManutencao);        
        
        // cidade
        lbCidade = new JLabel("Cidade:");
        lbCidade.setBounds(30, 190, 80, 25);
        add(lbCidade);

        comboCidade = new JComboBox<>();
        comboCidade.addItem("São Paulo");
        comboCidade.addItem("Guarulhos");
        comboCidade.addItem("Campinas");
        comboCidade.addItem("Osasco");
        comboCidade.setBounds(100, 190, 150, 25);
        add(comboCidade);
        
        // botão salvar
        btSalvar = new JButton("Salvar");
        btSalvar.setBounds(150, 240, 100, 30);
        add(btSalvar);
        
        // ação do botão
        btSalvar.addActionListener(new ActionListener() {                        
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txNome.getText();
                String email = txEmail.getText();
                
                String genero = "";
                if (btMasc.isSelected()) {
                    genero = btMasc.getText();
                } else if (btFem.isSelected()) {
                    genero = btFem.getText();
                }
                
                String servicos = "";
                if (chkSuporte.isSelected()) {
                    servicos += " " + chkSuporte.getText();
                }
                if (chkManutencao.isSelected()) {
                    servicos += " " + chkManutencao.getText();
                }        
                
                String cidade = comboCidade.getSelectedItem().toString();
                
                // apresentação no diálogo
                JOptionPane.showMessageDialog(null, 
                    "-----> Dados do Cliente \n" +
                    "Nome: " + nome + "\n" +
                    "E-mail: " + email + "\n" +
                    "Gênero: " + genero + "\n" +
                    "Serviços: " + servicos + "\n" +
                    "Cidade: " + cidade
                );
            }                        
        });                
        
        setVisible(true); // sempre por último no construtor
    }
}