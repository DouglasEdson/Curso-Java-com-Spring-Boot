public class PromocaoAutomatica{
	public static void main(String[] args){

		byte a = 10;
		short b = 20;
		char c = 'A'; //o tipo char é usado para representar caracteres, como letras e símbolos.
		int d = 30;
		long e = 40L;
		float f = 1.5f;
		double g =2.5;

		int resultado = a + b;
		System.out.println("Resultado da soma:" + resultado);

		long resultadoLong = d + e;
		float resultadoFlot = d * f;
		double resultadoDouble = d * g;

		System.out.println("Resultado long: " +resultadoLong);
		System.out.println("Resultado float: " + resultadoFlot);
		System.out.println("Resultado double: " + resultadoDouble);

		System.out.println("Valor do char: " + c);


	}
}