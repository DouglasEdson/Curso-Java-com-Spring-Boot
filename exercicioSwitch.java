public class exercicioSwitch{
	public static void main(String[] args){

		String dia = "Terça";

		String tipoDeDia = switch (dia){
			case"Segunda", "Terça", "Quarta","Quinta","Sexta" -> "Dia util";
			case "Sábado", "Domingo" -> "Fim de semana";
			default -> "Desconhecido";
		};
			System.out.println(tipoDeDia);
		}
	}
