
public class VeiculoMain {

	public static void main(String[] args) {
		Onibus bus = new Onibus("QZE0124", 2014, 20);
		Caminhao cam = new Caminhao("ABC1502", 2010, 2);
		bus.exibirDados();
		cam.exibirDados();
	}

}
