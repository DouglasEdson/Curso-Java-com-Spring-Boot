public class exercicioVerificadorMes{
	public static void main(String[] args){

		int mes = 6; // Exemplo: 1 representa Janeiro

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Feveiro");
			break;
		case 3:
			System.out.println("Março");
		case 4:
			System.out.println("Abril");
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
		System.out.println("Valor inválido para o mês.") ;

		}
	}
}