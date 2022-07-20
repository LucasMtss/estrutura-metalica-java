package too.estruturametalica;

import java.util.ArrayList;
import java.util.List;

public class EstruturaMetalica {
	List<Peca> estruturas;
	
	public EstruturaMetalica() {
		estruturas = new ArrayList<Peca>();
	}
	
	public boolean inserirPeca(Peca peca) {
		return estruturas.add(peca);
	}
	
	public int numeroDePecas() {
		return estruturas.size();
	}
	
	public List<Peca> getPecas(){
		return estruturas;
	}
}
