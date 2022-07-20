package too.estruturametalica;

public class Paralelepipedo extends Peca {
	double largura, altura, profundidade;
	
	public Paralelepipedo() {
		this.nome="paralelepípedo";
	}
	
	public Paralelepipedo(double largura, double altura, double profundidade, String nome, int quantidade, Material material) {
		this();
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
		this.setMaterial(material);
		this.setNome(nome);
		this.setQuantidade(quantidade);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public int getQuantidade() {
		return this.quantidade;
	}

	@Override
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public Material getMaterial() {
		return this.material;
	}

	@Override
	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public double getVolume() {
		return altura * largura * profundidade;
	}

	@Override
	public double getArea() {
		return 2 * (altura * largura + altura * profundidade + largura * profundidade);
	}

	@Override
	public String toString() {
		return String.format("%s\n\nLargura = %.2fm, Altura = %.2fm, Profundidade = %.2fm", super.toString(), largura, altura, profundidade);
	}

}
