
package util;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GlobalStyle {

    // 🎨 Cores principais do sistema
    public static final Color COR_FUNDO = new Color(255, 249, 239); // Cinza claro
    public static final Color COR_BOTAO = new Color(239, 202, 146); // Azul moderno
    public static final Color COR_BOTAO_TEXTO = Color.BLACK;
    public static final Color COR_TEXTO_TITULO = new Color(173, 39, 39); // Cinza escuro
    public static final Color COR_PAINEL = new Color(255, 249, 239);

    // 🔠 Fontes padronizadas
    public static final Font FONTE_TITULO = new Font("Arial", Font.BOLD, 18);
    public static final Font FONTE_TEXTO = new Font("Segoe UI", Font.PLAIN, 14);
    public static final Font FONTE_BOTAO = new Font("Segoe UI", Font.BOLD, 14);

    // 🖌️ Método para aplicar estilo a botões
    public static void estilizarBotao(JButton botao) {
        botao.setBackground(COR_BOTAO);
        botao.setForeground(COR_BOTAO_TEXTO);
        botao.setFont(FONTE_BOTAO);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
    }

    // 🖌️ Método para aplicar estilo a labels
    public static void estilizarTitulo(JLabel label) {
        label.setFont(FONTE_TITULO);
        label.setForeground(COR_TEXTO_TITULO);
    }

    // 🖌️ Método para aplicar fundo aos painéis
    public static void estilizarPainel(JPanel painel) {
        painel.setBackground(COR_PAINEL);
    }
}
