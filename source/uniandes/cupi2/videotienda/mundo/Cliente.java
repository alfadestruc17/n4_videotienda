/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id: Pelicula.java,v 1.1 2005/12/16 15:13:33 k-marcos Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_videotienda
 * Autor: Katalina Marcos - Diciembre 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.videotienda.mundo;
import java.util.ArrayList;


/**
 * Esta clase representa una pel�cula que se encuentra en la videotienda y
 * de la cual puede haber copias disponibles o prestadas.
 */ 
public class Cliente
{

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	
	private String cedula;
	
	
	private String nombre;
	
	private String direccion;
	
	private int saldo;
	
	private ArrayList<Copia> alquiladas;

	//-----------------------------------------------------------------
	// Constructores
	//-----------------------------------------------------------------

	
	public Cliente( String laCedula, String elNombre, String laDireccion )
	{
		cedula = laCedula;
		nombre = elNombre;
		direccion = laDireccion;
		saldo = 0;
		alquiladas = new ArrayList<Copia>();
	}
	
	
	//-----------------------------------------------------------------
	// M��todos
	//-----------------------------------------------------------------
	
	public String darCedula() 
	{
		return cedula;
	}
	
	
	public int darSaldo() 
	{
		return saldo;
	}
	
	
	public String darNombre() 
	{
		return nombre;
	}
	
	
	public String darDireccion() 
	{
		return direccion;
	}
	
	
	public void alquilarCopia(Copia copia) 
	{
		alquiladas.add(copia);
	}
	
	
	public void cargarSaldo(int monto) 
	{
		saldo += monto;
	}
	
	
	public void descargarSaldo(int monto) 
	{
		saldo -= monto;
	}
	
	
	public int darNumeroAlquiladas() 
	{
		return alquiladas.size();
	}
	
	
	public ArrayList<Copia> darAlquiladas() 
	{
		return alquiladas;
	}
	
	
	public Copia buscarPeliculaAlquilada(String pelicula, int codigo) 
	{
		for(Copia copia : alquiladas) 
		{
			if(Copia.darTituloPelicula().equals(pelicula) && copia.darCodigo() == codigo) 
			{
				return copia;
			}
		}
		return null;
	}
	
	
	public void devolverCopia(String pelicula, int codigo) 
	{
		
	}
}