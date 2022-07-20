package too.estruturametalica.errors;

public class ErroTipoMaterial extends Exception{
	String codigoErro;
	public ErroTipoMaterial() {
		super("Tpo de material inválido!");
		this.codigoErro = "EM-001";
	}
}
