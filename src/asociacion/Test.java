package asociacion;

public class Test {
	public static void main(String[] args) {
		Chofer choferuno = new Chofer();
		Taxi taxiuno = new Taxi();
		taxiuno.setChofer(choferuno);
	}
}
