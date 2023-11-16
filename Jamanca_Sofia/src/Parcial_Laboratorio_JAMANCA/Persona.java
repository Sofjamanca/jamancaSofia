package Parcial_Laboratorio_JAMANCA;
import java.util.*;

public class Persona {
	String nombre;
	String apellido;
	
	Scanner entrada = new Scanner (System.in);
	
	public Persona()
	{
		this.nombre = "";
		this.apellido = "";
	}
	
	public Persona(String nombre, String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void setNombre()
	{
		String nombre;
		System.out.println("Ingrese el nombre");
		nombre = entrada.nextLine();
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setApellido()
	{
		String apellido;
		System.out.println("Ingrese el apellido: ");
		apellido = entrada.nextLine();
		this.apellido = apellido;
	}
	
	public String getApellido()
	{
		return this.apellido;
	}
	
}






//JAMANCA SOFIA
