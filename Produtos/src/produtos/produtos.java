/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import apresentacao.JFrameProduto;

/**
 *
 * @author Lucas Rosario de Oliveira - 2017101742
 */
public class produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrameProduto JFrameProduto = new JFrameProduto(); //Cria o objeto Janela
        JFrameProduto.setTitle("Cadastro de Produtos"); //Define o título na Janela
        JFrameProduto.setLocationRelativeTo(null); //Coloca a janela no centro da tela
        JFrameProduto.setVisible(true); //Mostra a janela

    }

}
