import java.io.IOException;

public class Paciente {
	public String nombre;
	public String enfermedad;
	public String codigo;

	public Paciente() throws IOException {
		// TODO Auto-generated constructor stub
		Texto texto = new Texto();
		String pacientes = texto.leerTexto();
		
		String[] listaPacientes = pacientes.split("\n"); // Lista de pacientes
		String paciente1 = listaPacientes[1]; // paciente 1
		String atributos1 = listaPacientes[1];
		String paciente2 = listaPacientes[2]; // paciente 2
		String atributos2 = listaPacientes[1];
		String paciente3 = listaPacientes[3]; // paciente 3
		String atributos3 = listaPacientes[1];
		String paciente4 = listaPacientes[4]; // paciente 3	
		String atributos4 = listaPacientes[1];

	}
	public String getNombre(){
		//nombre = paciente1[1];
		return nombre;
	}
	public String getEnfermedad(){
		return enfermedad;
	}
	public String getCodigo(){
		return codigo;
	}

}
