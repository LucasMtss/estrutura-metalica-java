package too.estruturametalica.gui;

import static javax.swing.JOptionPane.*;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EntradaESaida {
	public static String lerString(String titulo, String mensagem) {
		return showInputDialog(null, mensagem, titulo, QUESTION_MESSAGE);
	}
	
	public static int menu(String titulo, String mensagem, String[] opcoes) {
		return showOptionDialog(null, mensagem, titulo, CANCEL_OPTION, QUESTION_MESSAGE, null, opcoes, opcoes[0]);
	}
	
	public static void msgInfo(String titulo, String mensagem) {
		showMessageDialog(null, mensagem, titulo, INFORMATION_MESSAGE);
	}
	
	public static void msgInfo(String titulo, Object componente) {
		showMessageDialog(null, componente, titulo, INFORMATION_MESSAGE);
	}
	
	public static void msgErro(String titulo, String mensagem) {
		showMessageDialog(null, mensagem, titulo, ERROR_MESSAGE);
	}
	
	public static void exibirTexto(String titulo, String mensagem, int numeroLinhas, int numeroColunas) {
		JTextArea painel = new JTextArea(numeroLinhas, numeroColunas);
		painel.setEditable(false);
		painel.setWrapStyleWord(true);
		painel.setLineWrap(true);
		painel.setText(mensagem);
		
		msgInfo(titulo, new JScrollPane(painel));
	}
}
