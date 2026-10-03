/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oficinamecanica;

/**
 *
 * @author Angelo Murgia
 */
import javax.swing.JOptionPane;

public class OficinaMecanica {

    public static void main(String[] args) {
        // Protótipo visual da funcionalidade de Cadastro (Requisitos RF01 e RF02)
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema OficinaPro!\nIniciando protótipo de cadastro...");
        
        // Simulando a entrada de dados
        String nomeCliente = JOptionPane.showInputDialog("Tela de Cadastro\n\nDigite o nome do cliente:");
        String modeloCarro = JOptionPane.showInputDialog("Digite o modelo do veículo (ex: BMW X3):");
        String placaCarro = JOptionPane.showInputDialog("Digite a placa do veículo:");
        
        // Simulando o resultado final
        String resumo = "Cadastro realizado com sucesso no banco de dados!\n\n"
                      + "Cliente: " + nomeCliente + "\n"
                      + "Veículo: " + modeloCarro + " (Placa: " + placaCarro + ")";
                      
        JOptionPane.showMessageDialog(null, resumo);
    }
}
