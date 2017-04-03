import java.io.IOException;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Texto texto = new Texto();
		String pacientes = texto.leerTexto();
		String[] listaPacientes = null;
		
		for(int i = 0; i<pacientes.length(); i++){
			listaPacientes = pacientes.split(",");
		}
		
		for(int i=0; i<listaPacientes.length; i++){
			System.out.println(listaPacientes[i]);
		}
		
		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		Paciente paciente3 = new Paciente();

		
		paciente1.setNombre(listaPacientes[0]);
		paciente1.setEnfermedad(listaPacientes[1]);
		paciente1.setCodigo(listaPacientes[2]);
		
		paciente2.setNombre(listaPacientes[3]);
		paciente2.setEnfermedad(listaPacientes[4]);
		paciente2.setCodigo(listaPacientes[5]);
		
		paciente3.setNombre(listaPacientes[6]);
		paciente3.setEnfermedad(listaPacientes[7]);
		paciente3.setCodigo(listaPacientes[8]);
		
		Vector vector = new Vector();
		
		vector.add(paciente1.getCodigo());
		vector.add(paciente2.getCodigo());
		vector.add(paciente3.getCodigo());
		
		System.out.println("el vector es" + vector);

		
	}

}
