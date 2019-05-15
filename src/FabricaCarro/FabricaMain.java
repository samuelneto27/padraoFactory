package FabricaCarro;

public class FabricaMain {

	public static void main(String[] args) {
		
		FabricaFiat FF = new FabricaFiat();
		FF.criarCarro().exibirInfo();
		
		FabricaFord FFord = new FabricaFord();
		FFord.criarCarro().exibirInfo();
		
		FabricaVolkswagen FV = new FabricaVolkswagen();
		FV.criarCarro().exibirInfo();
		
		FabricaChevrolet FC = new FabricaChevrolet();
		FC.criarCarro().exibirInfo();

	}

}
