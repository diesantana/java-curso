import java.util.Scanner;

public class estrutura_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		int indiceDia = leitura.nextInt();
		String dia;
		
		switch (indiceDia){
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sabado";
				break;
			default:
				dia = "Valor inválido";
				break;
		}
		
		/*
		if(indiceDia == 1) {
			dia = "Domingo";
		}else if(indiceDia == 2) {
			dia = "Segunda";
		}else if(indiceDia == 3) {
			dia = "Terça";
		}else if(indiceDia == 4) {
			dia = "Quarta";
		}else if(indiceDia == 5) {
			dia = "Quinta";
		}else if(indiceDia == 6) {
			dia = "Sexta";
		}else if(indiceDia == 7) {
			dia = "Sabado";
		}else {
			dia = "VALOR INVÁLIDO!";
		}
		*/
		
		
		
		System.out.println("Dia da semana: " + dia);
		
		
		leitura.close();
	}

}
