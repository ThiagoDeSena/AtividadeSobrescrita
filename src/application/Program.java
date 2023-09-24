package application;

import entities.Hospital;
import entities.Medico;
import entities.Paciente;

public class Program {

	public static void main(String[] args) {
		
		Hospital hospital1 = new Hospital("Sarah Kubicheck", "Avenida imperador, nª1250 - Parquelândia");
		Paciente paciente1 = new Paciente("João Alves", "Rua 02, nª44 - Horto", 34, "00078899923", 'M', "Gripe", "Dipirona");
		Medico medico1 = new Medico("Eloisa", "Rua pingo de Ouro, nª507 - Jangurusu", 27, "11133322254", 'F', "DDRR78", 10000, "Clinica Geral");
		
		System.out.println("Hospital: "+hospital1.getNome());
		System.out.println("Endereço do Hospital: "+hospital1.getEndereço());
		System.out.println();
		
		System.out.println("Informações do Paciente: ");
		paciente1.imprimirValores();
		paciente1.andar();
		paciente1.sentirDor();
		paciente1.alta();
		System.out.println();
		
		System.out.println("Informações do Médico");
		medico1.imprimirValores();
		medico1.andar();
		medico1.plantao();
		System.out.println();
		
		
		
		
	}
}
