// linha 1
package View;
// Define que esta classe pertence ao pacote "view".
// O pacote "view" é responsável pelas telas (interfaces gráficas) do sistema.
// Assim mantemos o código organizado: view (telas), model (dados) e main (controle).

// linha 2
import javax.swing.*;
// Importa todas as classes gráficas do pacote javax.swing (JFrame, JButton, JTextArea, JScrollPane, etc.).
// Swing é a biblioteca do Java usada para criar janelas, botões, áreas de texto, tabelas e muito mais.

// linha 3
import java.awt.*;
// Importa classes do AWT (Abstract Window Toolkit).
// Aqui, vamos usar o BorderLayout, um gerenciador de layout que organiza os componentes nas regiões da janela (Norte, Sul, Leste, Oeste e Centro).

// linha 4
import model.pizza;
// Importa a classe Veiculo, que representa os veículos cadastrados no sistema.
import util.GlobalStyle;
// linha 5
import main.SistemaPizzariaGUI;
// Importa a classe principal do sistema, usada para acessar a lista de veículos armazenada.

// linha 6 (linha em branco)

// linha 7
public class TelaListagemPedido extends JFrame {
// Declara a classe pública TelaListagem, que **herda (extends)** da classe JFrame.
// Isso significa que TelaListagem é uma janela gráfica Swing completa.
// Será usada para exibir todos os veículos cadastrados.

// linha 8
    private static final long serialVersionUID = 1L;
    // Campo padrão usado para controle interno do Java na serialização.
    // Garante compatibilidade se a classe for salva em arquivo.
// Não influencia no funcionamento visual da tela.

// linha 9 (linha em branco)

// linha 10
    public TelaListagemPedido(JFrame telaAnterior) {
        // Construtor da classe TelaListagem.
        // Recebe como parâmetro a "telaAnterior" — ou seja, a janela de onde ela foi chamada.
        // Assim podemos voltar para essa tela ao clicar no botão "Voltar".

        // linha 11
        setTitle("Lista de Sabores Pedidos");
        // Define o título da janela (aparece na barra superior da tela).

        // linha 12
        setSize(450, 300);
        // Define o tamanho da janela (largura = 450 px, altura = 300 px).

        // linha 13
        setLocationRelativeTo(null);
        // Centraliza a janela no centro da tela.

        // linha 14
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o comportamento ao fechar a janela.
        // EXIT_ON_CLOSE encerra todo o programa quando essa janela for fechada.
        getContentPane().setBackground(GlobalStyle.COR_FUNDO);
        // linha 15
        setLayout(new BorderLayout());
        // Define o layout da janela como BorderLayout.
        // Esse layout divide a janela em 5 regiões: Norte, Sul, Leste, Oeste e Centro.
        // Aqui usaremos o CENTRO para o texto e o SUL para o botão.

        // linha 16
        JTextArea areaTexto = new JTextArea();
        // Cria uma área de texto multilinha onde exibiremos a listagem dos veículos.

        // linha 17
        areaTexto.setEditable(false);
        // Impede que o usuário edite o texto (somente leitura).
        // Assim, a área serve apenas para visualizar as informações.

        // linha 18
        StringBuilder sb = new StringBuilder();
        // Cria um objeto StringBuilder para montar o texto da listagem.
        // É mais eficiente do que concatenar strings diretamente com o operador "+".

        // linha 19
        for (pizza p : SistemaPizzariaGUI.getPedido()) {
            // Loop "for-each" que percorre a lista de veículos cadastrados.
            // Para cada objeto "v" da lista, vamos pegar e formatar seus dados.

            // linha 20
            sb.append("Sabor: ").append(p. getNumPedido()).append("\n");
            // Adiciona o modelo do veículo ao texto.

            // linha 21
            sb.append("Tamanho: ").append(p. getNumTamanho()).append("\n");
            // Adiciona a placa do veículo.
           
            // linha 23
            sb.append("----------------------------------\n");
            // Adiciona uma linha separadora entre cada veículo.
        }

        // linha 24
        if (sb.length() == 0)
            sb.append("Nenhum pedido cadastrado.");
        // Se o StringBuilder estiver vazio (ou seja, não havia veículos na lista),
        // mostra uma mensagem informando que não há registros.

        // linha 25
        areaTexto.setText(sb.toString());
        // Converte o conteúdo do StringBuilder em texto e exibe dentro da área de texto.

        // linha 26
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        // Adiciona a área de texto dentro de um JScrollPane (painel de rolagem).
        // Isso permite rolar o texto caso a lista seja muito longa.
        // O painel é colocado na região CENTRAL da janela (BorderLayout.CENTER).

        // linha 27
        JButton btnVoltar = new JButton("Voltar");
        // Cria o botão "Voltar" para retornar à tela anterior.
        GlobalStyle.estilizarBotao(btnVoltar);
        // linha 28
        btnVoltar.addActionListener(p -> {
            // Adiciona um "ouvinte de ação" ao botão.
            // Quando o botão for clicado, o código dentro das chaves será executado.

            // linha 29
            telaAnterior.setVisible(true);
            // Reexibe a tela anterior (geralmente a TelaPrincipal).

            // linha 30
            dispose();
            // Fecha (descarta) a janela atual e libera os recursos.
        });

        // linha 31
        add(btnVoltar, BorderLayout.SOUTH);
        // Adiciona o botão "Voltar" à região inferior da janela (SUL no BorderLayout).
    }
    // linha 32 (fim do construtor)
}
// linha 33 (fim da classe)