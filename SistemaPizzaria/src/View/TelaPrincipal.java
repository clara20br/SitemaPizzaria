package View; // Define que esta classe pertence ao pacote "view", onde ficam as telas do sistema

// Importações das bibliotecas necessárias
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import util.GlobalStyle; // Importa a classe de estilos visuais personalizada (cores, fontes, etc.)

// Classe principal da tela inicial do sistema da oficina
public class TelaPrincipal extends JFrame {

    // Número de versão da classe (usado por segurança em serialização)
    private static final long serialVersionUID = 1L;

    // Construtor da classe — é chamado automaticamente quando criamos uma nova TelaPrincipal
    public TelaPrincipal() {

        // Define o título que aparece na barra superior da janela
        setTitle("Pizzaria Pizzas - Sistema");

        // Define o tamanho da janela (largura x altura)
        setSize(500, 300);

        // Define a ação padrão ao clicar no X: fechar o programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Faz a janela aparecer centralizada na tela do computador
        setLocationRelativeTo(null);

        // Define o layout principal da janela (dividido em regiões: Norte, Sul, Leste, Oeste e Centro)
        setLayout(new BorderLayout());

        // ------------------------------------------------------------------
        // 🔹 Configuração do fundo da tela
        // Define a cor de fundo da janela usando o estilo padrão definido em GlobalStyle
        getContentPane().setBackground(GlobalStyle.COR_FUNDO);

        // ------------------------------------------------------------------
        // 🔹 Criação e configuração do título superior
        // JLabel é um componente para exibir textos (ou ícones)
        // Aqui, ele mostra o título centralizado horizontalmente
        JLabel lblTitulo = new JLabel("Sistema da Pizzaria Pizzas", SwingConstants.CENTER);

        // Aplica o estilo de título (fonte e cor) definido na classe GlobalStyle
        GlobalStyle.estilizarTitulo(lblTitulo);

        // Adiciona o título na parte superior (NORTE) da janela
        add(lblTitulo, BorderLayout.NORTH);

        // ------------------------------------------------------------------
        // 🔹 Criação do painel central onde ficarão os botões
        // GridLayout(3, 1, 10, 10) → 3 linhas, 1 coluna, espaçamento horizontal e vertical de 10px
        JPanel painelBotoes = new JPanel(new GridLayout(3, 3, 10, 10));

        // Aplica o estilo de painel (cor de fundo) definido no GlobalStyle
        GlobalStyle.estilizarPainel(painelBotoes);

        // ------------------------------------------------------------------
        // 🔹 Criação dos botões principais
        // Cada botão executará uma ação diferente no sistema
        JButton btnCadastrar = new JButton("Cadastrar Entregador"); // Abre tela de cadastro
        JButton btnListar = new JButton("Listar Entregador");// Abre tela de listagem
        JButton btnCadastrarPizza = new JButton("Cadastrar Pedido"); // Abre tela de cadastro
        JButton btnListarPizza = new JButton("Listar Pedido"); 
        JButton btnSair = new JButton("Sair");  // Fecha o programa

        // ------------------------------------------------------------------
        // 🔹 Aplicando o estilo visual aos botões
        // Cada botão recebe a cor, fonte e aparência definidas em GlobalStyle
        GlobalStyle.estilizarBotao(btnCadastrar);
        GlobalStyle.estilizarBotao(btnListar);
        GlobalStyle.estilizarBotao(btnCadastrarPizza);
        GlobalStyle.estilizarBotao(btnListarPizza);
        GlobalStyle.estilizarBotao(btnSair);

        // ------------------------------------------------------------------
        // 🔹 Adiciona os botões ao painel central
        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnListar);
        painelBotoes.add(btnCadastrarPizza);
        painelBotoes.add(btnListarPizza);
        painelBotoes.add(btnSair);


        // Adiciona o painel completo ao centro da janela principal
        add(painelBotoes, BorderLayout.CENTER);

        // ------------------------------------------------------------------
        // 🔹 Configuração das ações dos botões

        // Quando o botão "Cadastrar Veículo" for clicado:
        // → Abre a tela de cadastro e esconde a tela principal
        btnCadastrar.addActionListener(e -> {
            new TelaCadastro(this).setVisible(true); // Cria e mostra a tela de cadastro
            this.setVisible(false);                  // Esconde a tela principal
        });

        // Quando o botão "Listar Veículos" for clicado:
        // → Abre a tela de listagem e esconde a tela principal
        btnListar.addActionListener(e -> {
            new TelaListagem(this).setVisible(true); // Cria e mostra a tela de listagem
            this.setVisible(false);                  // Esconde a tela principal
        });
        
        btnCadastrarPizza.addActionListener(p -> {
            new TelaCadastroPedido(this).setVisible(true); // Cria e mostra a tela de cadastro
            this.setVisible(false);                  // Esconde a tela principal
        });
        
        btnListarPizza.addActionListener(p -> {
            new TelaListagemPedido(this).setVisible(true); // Cria e mostra a tela de cadastro
            this.setVisible(false);                  // Esconde a tela principal
        });

        // Quando o botão "Sair" for clicado:
        // → Encerra o programa imediatamente
        btnSair.addActionListener(e -> System.exit(0));
    }
}