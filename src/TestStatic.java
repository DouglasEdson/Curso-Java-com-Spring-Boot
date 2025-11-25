public class TestStatic {
	public static void exibirValor(int a) {
		System.out.println("O valor do inteiro é: " + a);
	}
	
	public static void main(String[] args) {
		TestStatic ts = new TestStatic();

		ts.exibirValor (10);
	}
}