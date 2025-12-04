package main;
// Aqui dizemos que a classe SistemaOficinaGUI está dentro do pacote "main".

import java.util.ArrayList;
// Importa a classe ArrayList do pacote java.util.
// ArrayList é uma implementação de lista dinâmica (vetor que cresce).
// Usamos ArrayList para armazenar a lista de veículos em memória.

// linha 4

import model.entregador;
import model.pizza;
// Importa a classe Veiculo do pacote model.
// Isso permite usar o tipo "Veiculo" diretamente no código abaixo.

// linha 5
import View.TelaPrincipal;
// Importa a classe TelaPrincipal do pacote view.
// TelaPrincipal é a janela Swing que abre a interface gráfica principal.


public class SistemaPizzariaGUI {
// Declara a classe pública chamada SistemaOficinaGUI.
// "public" permite que outras classes (de outros pacotes) acessem esta classe.
// Esta classe será o ponto de entrada do programa (contém o método main).


    private static ArrayList<entregador> entregadores = new ArrayList<>();
    private static ArrayList<pizza> pedido = new ArrayList<>();
    // Declara um campo (variável de classe) chamado "veiculos".
    // - "private": só pode ser acessado dentro dessa classe.
    // - "static": pertence à classe, não a instâncias; existe apenas uma lista compartilhada.
    // - Tipo: ArrayList<Veiculo> — lista que armazena objetos Veiculo.
    // - Inicialização com "new ArrayList<>()": cria a lista vazia ao carregar a classe.
    // Propósito: simular um repositório em memória ("banco de dados" temporário)
    // onde todos os veículos cadastrados pela interface serão guardados.


    public static void main(String[] args) {
        // Método principal (entry point) da aplicação Java.
        // - "public": pode ser chamado pela JVM.
        // - "static": a JVM chama esse método sem criar uma instância da classe.
        // - "void": não retorna valor.
        //
        // Quando você executa o programa, a JVM procura este método e inicia a execução por aqui.


        new TelaPrincipal().setVisible(true);
        // Cria uma nova instância (objeto) da tela principal (TelaPrincipal).
        // Em seguida chama o método setVisible(true) para tornar a janela visível.
        //
        // Efeito prático: a interface gráfica aparece para o usuário.
        // Observação: aqui não guardamos a referência da janela em uma variável
        // porque não precisamos manipulá-la depois deste ponto.
    }

 
    public static void adicionarEntregador(entregador e) {
        // Declara um método público e estático chamado adicionarVeiculo.
        // - "public": pode ser chamado por outras classes.
        // - "static": pode ser chamado sem criar uma instância de SistemaOficinaGUI.
        // - Parâmetro: recebe um objeto Veiculo chamado "v".
        //
        // Responsabilidade: adicionar o veículo recebido à lista global "veiculos".
        // (por exemplo, a TelaCadastro chama esse método quando o usuário salva um veículo).


    	entregadores.add(e);
        // Chama o método add da ArrayList para inserir o veículo no final da lista.
        // Após essa chamada, o veículo fica disponível para ser listado ou manipulado.
    }

    public static ArrayList<entregador> getEntregadores() {
        // Declara um método público e estático que retorna a lista de veículos.
        // - "public": acessível por outras classes (por exemplo, TelaListagem).
        // - "static": sem necessidade de instanciar SistemaOficinaGUI.
        // - Retorna: ArrayList<Veiculo> (a própria lista em memória).
        //
        // Observação de design: estamos retornando a referência direta à lista.
        // Em aplicações maiores, pode-se querer retornar uma cópia imutável
        // ou uma view para evitar modificações diretas externas.

        return entregadores;
        // Retorna a referência ao ArrayList que guarda os veículos cadastrados.
    }
    public static void adicionarPedido(pizza p) {
        // Declara um método público e estático chamado adicionarVeiculo.
        // - "public": pode ser chamado por outras classes.
        // - "static": pode ser chamado sem criar uma instância de SistemaOficinaGUI.
        // - Parâmetro: recebe um objeto Veiculo chamado "v".
        //
        // Responsabilidade: adicionar o veículo recebido à lista global "veiculos".
        // (por exemplo, a TelaCadastro chama esse método quando o usuário salva um veículo).


    	pedido.add(p);
        // Chama o método add da ArrayList para inserir o veículo no final da lista.
        // Após essa chamada, o veículo fica disponível para ser listado ou manipulado.
    }
    public static ArrayList<pizza> getPedido() {
        // Declara um método público e estático que retorna a lista de veículos.
        // - "public": acessível por outras classes (por exemplo, TelaListagem).
        // - "static": sem necessidade de instanciar SistemaOficinaGUI.
        // - Retorna: ArrayList<Veiculo> (a própria lista em memória).
        //
        // Observação de design: estamos retornando a referência direta à lista.
        // Em aplicações maiores, pode-se querer retornar uma cópia imutável
        // ou uma view para evitar modificações diretas externas.

        return pedido;
        // Retorna a referência ao ArrayList que guarda os veículos cadastrados.
    }

}
// (fim do arquivo)
// Fecha a declaração da classe.