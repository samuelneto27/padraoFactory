package FabricaCarro;

public class FabricaFord implements FabricadeCarro {
	
	
	public Carro criarCarro() {
		return new Fiesta();
	}

}
