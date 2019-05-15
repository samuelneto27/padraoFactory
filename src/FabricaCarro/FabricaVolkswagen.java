package FabricaCarro;

public class FabricaVolkswagen implements FabricadeCarro {
	
	
	public Carro criarCarro() {
		return new Gol();
	}

}
