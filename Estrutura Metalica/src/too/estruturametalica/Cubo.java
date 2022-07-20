package too.estruturametalica;

public class Cubo extends Peca {
	double aresta;
	

	public Cubo() {
		this.nome="cubo";
	}

	public Cubo(double aresta, String nome, int quantidade, Material material) {
		this();
		this.aresta = aresta;
		this.setMaterial(material);
		this.setNome(nome);
		this.setQuantidade(quantidade);
	}
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
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
		return aresta * aresta * aresta;
	}

	@Override
	public double getArea() {
		return 6.0 * aresta * aresta;
	}

	@Override
	public String toString() {
		return String.format("%s\n\nAresta = %.2fm", super.toString(), aresta);
	}
	
	
	
}
