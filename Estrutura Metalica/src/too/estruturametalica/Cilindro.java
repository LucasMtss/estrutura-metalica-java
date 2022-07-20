package too.estruturametalica;

public class Cilindro extends Peca {
	double raio, altura;
	
	public Cilindro() {
		this.nome="cilindro";
	}

	public Cilindro(double raio, double altura, String nome, int quantidade, Material material ) {
		this();
		this.raio = raio;
		this.altura = altura;
		this.setMaterial(material);
		this.setNome(nome);
		this.setQuantidade(quantidade);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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
		return raio * raio * altura;
	}

	@Override
	public double getArea() {
		return 2 * Math.PI * Math.PI * altura;
	}

	@Override
	public String toString() {
		return String.format("%s\n\nRaio = %.2fm, Altura = %.2fm", super.toString(), raio, altura);
	}

	
	
	

}
