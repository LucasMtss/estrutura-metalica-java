package too.estruturametalica.utils;

import too.estruturametalica.Peca;
import too.estruturametalica.errors.ErroTipoMaterial;

public class Utils {
	public static Peca.Material ConverteMaterial(int material) throws Exception{
		if(material == 0) return Peca.Material.FERRO;
		if(material == 1) return Peca.Material.ALUMINIO;
		else throw new ErroTipoMaterial();
	}
	
	public static String calcularLatasDeTinta(double area) {
		Double lataCincoLitros=0d, lataDoisLitros=0d, lataMeioLitro=0d;
		lataCincoLitros = Math.floor(area / 5);
		lataDoisLitros = Math.floor((area % 5) / 2);
		lataMeioLitro = Math.ceil(((area % 5) % 2) / 0.5);
		
		return String.format("\nLatas de tinta necessárias para pintar a estrutura: %d latas de 5L, %d latas de 2L e %d latas de 0,5L\n", lataCincoLitros.intValue(), lataDoisLitros.intValue(), lataMeioLitro.intValue());
	}
}

