
// linha 1
package View;
// Define que esta classe pertence ao pacote "view".
// O pacote "view" (visão) é usado para guardar as telas (interfaces gráficas) do sistema.
// Isso ajuda a manter o código organizado (MVC: Model, View, Controller).

// linha 2
// Importa todas as classes do pacote javax.swing (como JFrame, JButton, JLabel, JTextField, etc.).
// Swing é a biblioteca gráfica do Java usada para criar janelas, botões e campos de texto.

// linha 3
import java.awt.*;
// Importa classes do pacote AWT (Abstract Window Toolkit) que complementam o Swing.
// Aqui usamos o GridLayout (gerenciador de layout que organiza os componentes em grade).

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// linha 4

// Importa a classe Cliente (modelo que representa o dono do veículo).

// linha 5
import model.entregador;
// Importa a classe Veiculo (modelo que representa o carro ou moto cadastrada).
import util.GlobalStyle;
// linha 6
import main.SistemaPizzariaGUI;
// Importa a classe principal do sistema (que guarda a lista de veículos e possui métodos estáticos).
// Vamos usá-la para salvar os veículos cadastrados.

// linha 7 (linha em branco para separar as importações da classe)

// linha 8
public class TelaCadastro extends JFrame {
// Declara uma classe pública chamada TelaCadastro que **herda (extends)** de JFrame.
// Isso significa que TelaCadastro é uma janela (frame) Swing completa.
// Toda tela gráfica principal do Swing normalmente herda de JFrame.

// linha 9
    private static final long serialVersionUID = 1L;
    // Campo padrão do Java para controle de versões de classes serializáveis.
    // É gerado automaticamente para evitar alertas.
    // Não influencia no funcionamento da tela, mas é uma boa prática deixar aqui.

    // linha 10
    private JTextField txtnome, txtplacaMoto,txttelefone;
    // Declara os campos de texto (JTextField) que o usuário vai preencher na tela.
    // Cada um desses campos é uma caixa de entrada de texto.
    // txtNome -> nome do cliente
    // txtCpf -> CPF do cliente
    // txtTelefone -> telefone
    // txtModelo -> modelo do veículo
    // txtPlaca -> placa do veículo

    // linha 11 (linha em branco)

    // linha 12
    public TelaCadastro(JFrame telaAnterior) {
        // Construtor da tela de cadastro.
        // Recebe como parâmetro uma referência para a tela anterior (por exemplo, a TelaPrincipal),
        // para que o botão "Voltar" saiba qual janela reabrir depois.

        // linha 13
        setTitle("Cadastro do Entregador");
        // Define o título da janela que aparece na barra superior.

        // linha 14
        setSize(500, 500);
        // Define o tamanho da janela (largura = 400px, altura = 400px).

        // linha 15
        setLocationRelativeTo(null);
        // Centraliza a janela no meio da tela (null = centro da tela principal).

        // linha 16
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o comportamento ao fechar a janela.
        // Aqui, o programa será encerrado quando o usuário fechar esta janela.

        // linha 17
        setLayout(new GridLayout(9, 5, 30, 5));
        
        getContentPane().setBackground(GlobalStyle.COR_FUNDO);
        // Define o layout da janela.
        // GridLayout organiza os componentes em uma grade (linhas e colunas).
        // (7, 2) = 7 linhas e 2 colunas.
        // (5, 5) = espaçamento horizontal e vertical entre os componentes.
        // Assim cada linha terá um rótulo (label) e um campo ao lado.

        // linha 18
        add(new JLabel("Nome do Entregador:"));
        // Adiciona um texto fixo (rótulo) à tela.

        // linha 19
        txtnome = new JTextField();
        // Cria o campo onde o usuário digitará o nome do cliente.

        // linha 20
        add(txtnome);
        // Adiciona o campo txtNome à tela, logo ao lado do rótulo anterior.

        // linha 21
        add(new JLabel("Placa da Moto:"));
        // Adiciona outro rótulo (para o campo de CPF).

        // linha 22
        txtplacaMoto = new JTextField();
        // Cria o campo de entrada para o CPF.

        // linha 23
        add(txtplacaMoto);
        // Adiciona o campo txtCpf à tela.

        // linha 24
        add(new JLabel("Telefone:"));
        // Adiciona um rótulo "Telefone" à tela.

        // linha 25
        txttelefone = new JTextField();
        // Cria o campo de texto para o telefone do cliente.

        // linha 26
        add(txttelefone);
        // Adiciona o campo à janela.

        // linha 33
        JButton btnSalvar = new JButton("Salvar");
        // Cria um botão de ação com o texto "Salvar".

        // linha 34
        JButton btnVoltar = new JButton("Voltar");
        // Cria outro botão com o texto "Voltar".

        // linha 35
        add(btnSalvar);
        // Adiciona o botão "Salvar" à tela (será exibido abaixo dos campos).

        // linha 36
        add(btnVoltar);
        // Adiciona o botão "Voltar" ao lado do botão "Salvar".

        // linha 37 (linha em branco)
        GlobalStyle.estilizarBotao(btnSalvar);
        GlobalStyle.estilizarBotao(btnVoltar);
        // linha 38
        btnSalvar.addActionListener(e -> {
            // Adiciona um "ouvinte de ação" (listener) ao botão "Salvar".
            // Quando o botão for clicado, o código dentro das chaves será executado.

            // linha 39
            entregador entregador = new entregador(
                txtnome.getText(),
                txtplacaMoto.getText(),
                txttelefone.getText()
            );
            // Cria um novo objeto Cliente com os dados digitados nos campos de texto.


            // linha 41
            SistemaPizzariaGUI.adicionarEntregador(entregador);
            // Chama o método estático da classe principal para adicionar o veículo à lista.
            // Isso simula salvar o veículo no "banco de dados" (a lista estática em memória).

            // linha 42
            JOptionPane.showMessageDialog(this, "✅ Entregador cadastrado com sucesso!");
            // Exibe uma janela de mensagem informando que o cadastro foi realizado.

            // linha 43–47
            txtnome.setText("");
            txtplacaMoto.setText("");
            txttelefone.setText("");
            // Limpa todos os campos de texto da tela após o cadastro.
            // Isso facilita o cadastro de um novo veículo sem fechar a janela.
        });

        // linha 48
        btnVoltar.addActionListener(e -> {
            // Adiciona um listener ao botão "Voltar".
            // Quando clicado, o sistema volta para a tela anterior.

            // linha 49
            telaAnterior.setVisible(true);
            // Reexibe a janela anterior (TelaPrincipal).

            // linha 50
            dispose();
            // Fecha (descarta) a janela atual, liberando os recursos.
        });
    }
    // linha 51 (fim do construtor)
}
// linha 52 (fim da classe)
