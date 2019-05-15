package FabricaCarro;

public class FabricaFiat implements FabricadeCarro {
	
	public Carro criarCarro() {
		return new Palio();
	}

}
