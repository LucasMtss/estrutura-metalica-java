package too.estruturametalica;

public abstract class Peca {
	String nome;
	int quantidade;
	public static enum Material {FERRO, ALUMINIO};
	
	Material material;

	public abstract String getNome();
	
	public abstract void setNome(String nome);
	
	public abstract int getQuantidade();
	
	public abstract void setQuantidade(int quantidade);
	
	public abstract Material getMaterial();
	
	public abstract void setMaterial(Material material);
	
	public abstract double getVolume();

	public abstract double getArea();

	@Override
	public String toString() {
		return String.format("\nNome: %s \nQuantidade: %d \nMaterial: %s", nome, quantidade, material == Material.FERRO ? "Ferro" : "Alumínio");
	}
	
	
}

