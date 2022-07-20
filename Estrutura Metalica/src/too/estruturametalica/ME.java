package too.estruturametalica;

import too.estruturametalica.Peca;
import java.util.Iterator;

import too.estruturametalica.gui.EntradaESaida;
import too.estruturametalica.utils.Utils;

public class ME implements Estrutura{
	static final String 
			TITULO="Estrutura Metálica", 
			MENU="Selecione a opção desejada:", 
			ERRO_MENU="ERRO! Favor selecionar uma opção válida.",
			ERRO_VALOR_INVALLIDO="ERRO! Por favor informe um valor válido",
			TIPO_PECA="Informe o tipo da peça",
			TAMANHO_ARESTA="Informe o tamanho da aresta (m):",
			TAMANHO_RAIO="Informe o tamanho do raio (m):",
			TAMANHO_ALTURA="Informe a altura (m):",
			TAMANHO_LARGURA="Informe a largura (m):",
			TAMANHO_PROFUNDIDADE="Informe a profundidade (m):",
			QUANTIDADE="Informe a quantidade:",
			MATERIAL="Informe o material:",
			RELATORIO="\t\tRelatório:\n\n",
			SEPARACAO="\n-----------------------------------------------\n\n";

	public static void main(String[] args) {
		String[] opcoes = {"Cadastrar peça", "Exibir relatório", "Sair"};
		int opcaoSelecionada;
		EstruturaMetalica estruturasMetalicas = new EstruturaMetalica();
		System.out.println("Número de peças " + estruturasMetalicas.numeroDePecas());

		do {
			opcaoSelecionada = EntradaESaida.menu(TITULO, MENU, opcoes);
			System.out.println(opcaoSelecionada);
	
			switch (opcaoSelecionada) {
			case 0: {
				cadastrarPeca(estruturasMetalicas);
				System.out.println("Número de peças " + estruturasMetalicas.numeroDePecas());
				break;
			}
			case 1: {
				new ME().exibirRelatorio(estruturasMetalicas);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcaoSelecionada);
			}
			
		}while(opcaoSelecionada != 2);

	}
	
	private static boolean cadastrarPeca(EstruturaMetalica estruturasMetalicas) {
		Cubo cubo = new Cubo();
		Cilindro cilindro = new Cilindro();
		Paralelepipedo paralelepipedo = new Paralelepipedo();
		String dados;
		int tipoPeca, tipoMaterial;
		String[] opcoesPecas = {"Cubo", "Cilindro", "Paralelepípedo", "Cancelar"};
		String[] opcoesMateriais = {"Ferro", "Alumínio", "Cancelar"};
		
		tipoPeca = EntradaESaida.menu(TITULO, TIPO_PECA, opcoesPecas);
		if(tipoPeca == 3) return false;
		
		if(tipoPeca == 0) {
			do {
				dados = EntradaESaida.lerString(TITULO, TAMANHO_ARESTA);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			cubo.setAresta(Double.valueOf(dados));
			do {
				dados = EntradaESaida.lerString(TITULO, QUANTIDADE);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			cubo.setQuantidade(Integer.valueOf(dados));
			tipoMaterial = EntradaESaida.menu(TITULO, MATERIAL, opcoesMateriais);
				
			
			try {
				cubo.setMaterial(Utils.ConverteMaterial(tipoMaterial));
				System.out.println(cubo.toString()); 
				return estruturasMetalicas.inserirPeca(cubo);
			} catch (Exception e) {
				EntradaESaida.msgErro(TITULO, e.getMessage());
				return false;
			}
		}//CUBO
		
		else if(tipoPeca == 1) {
			do {
				dados = EntradaESaida.lerString(TITULO, TAMANHO_RAIO);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			cilindro.setRaio(Double.valueOf(dados));
			do {
				dados = EntradaESaida.lerString(TITULO, TAMANHO_ALTURA);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			cilindro.setAltura(Double.valueOf(dados));
			do {
				dados = EntradaESaida.lerString(TITULO, QUANTIDADE);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			cilindro.setQuantidade(Integer.valueOf(dados));
			tipoMaterial = EntradaESaida.menu(TITULO, MATERIAL, opcoesMateriais);
				
			
			try {
				cilindro.setMaterial(Utils.ConverteMaterial(tipoMaterial));
				System.out.println(cilindro.toString());
				return estruturasMetalicas.inserirPeca(cilindro);
			} catch (Exception e) {
				EntradaESaida.msgErro(TITULO, e.getMessage());
				return false;
			}
			
		}//CILINDRO
		
		else if(tipoPeca == 2) {
			do {
				dados = EntradaESaida.lerString(TITULO, TAMANHO_LARGURA);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			paralelepipedo.setLargura(Double.valueOf(dados));
			do {
				dados = EntradaESaida.lerString(TITULO, TAMANHO_ALTURA);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			paralelepipedo.setAltura(Double.valueOf(dados));
			do {
				dados = EntradaESaida.lerString(TITULO, TAMANHO_PROFUNDIDADE);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			paralelepipedo.setProfundidade(Double.valueOf(dados));
			do {
				dados = EntradaESaida.lerString(TITULO, QUANTIDADE);
				if(dados.isEmpty())
					EntradaESaida.msgErro(TITULO, ERRO_VALOR_INVALLIDO);
			}while(dados.isEmpty());
			paralelepipedo.setQuantidade(Integer.valueOf(dados));
			tipoMaterial = EntradaESaida.menu(TITULO, MATERIAL, opcoesMateriais);	
			
			try {
				paralelepipedo.setMaterial(Utils.ConverteMaterial(tipoMaterial));
				System.out.println(paralelepipedo.toString());
				return estruturasMetalicas.inserirPeca(paralelepipedo);
			} catch (Exception e) {
				EntradaESaida.msgErro(TITULO, e.getMessage());
				return false;
			}
		}//PARALELEPIPEDO
		
		return false;
	}

	@Override
	public float pesoTotal(EstruturaMetalica estruturas) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float volumeTotal(EstruturaMetalica estruturas) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numeroDeLatasParaPintar(EstruturaMetalica estruturas) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeTotalDasEstruturas(EstruturaMetalica estruturas) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void exibirRelatorio(EstruturaMetalica estruturas) {
		StringBuilder texto = new StringBuilder();
		double pesoTotal, volumeTotal, areaTotal, volumeTotalCilindros=0, volumeTotalCubos=0, volumeTotalParalelepipedo=0;
		texto.append(RELATORIO);
		for (Peca peca : estruturas.estruturas) {
			pesoTotal = peca.getVolume() * peca.getQuantidade() * (peca.getMaterial() == Peca.Material.FERRO ? 7.8 : 2.7);
			volumeTotal = peca.getVolume() * peca.getQuantidade();
			areaTotal = peca.getArea() * peca.getQuantidade();
			if(peca instanceof Cubo)
				volumeTotalCubos += peca.getVolume() * peca.getQuantidade();
			else if(peca instanceof Cilindro)
				volumeTotalCilindros += peca.getVolume() * peca.getQuantidade();
			else if(peca instanceof Paralelepipedo)
				volumeTotalParalelepipedo += peca.getVolume() * peca.getQuantidade();
			texto.append(peca.toString());
			texto.append(String.format("\nVolume total: %.2f metros cúbicos", volumeTotal));
			texto.append(String.format("\nÁera total: %.2f metros quadrados", areaTotal));
			texto.append(String.format("\nPeso total: %.2f metros quadrados", pesoTotal));
			texto.append(Utils.calcularLatasDeTinta(peca.getArea() * peca.getQuantidade()));
			texto.append(SEPARACAO);
		}
		texto.append(String.format("\n\nVolume total dos cubos: %.2f metros cúbicos", volumeTotalCubos));
		texto.append(String.format("\nVolume total dos cilíndros: %.2f metros cúbicos", volumeTotalCilindros));
		texto.append(String.format("\nVolume total dos paralelepípedos: %.2f metros cúbicos", volumeTotalParalelepipedo));
		EntradaESaida.exibirTexto(TITULO, texto.toString(), 30, 50);
	}
	
	
	

}
