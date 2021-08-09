package agregacion;

public class Test {
	public static void main(String[] args) {
		Auto unauto = new Auto();
		Estereo unestereoe = new Estereo();
		Motor unmotor = new Motor();
		unauto.ensamblar(unauto, unestereoe);
		
	}
}
