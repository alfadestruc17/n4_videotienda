/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id: Pelicula.java,v 1.1 2005/12/16 15:13:33 k-marcos Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_videotienda
 * Autor: Katalina Marcos - Diciembre 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.videotienda.mundo;
/**
 * esta clase representa una copia de una película que se encuentra en la videotienda.
 */
public class Copia 
{
	
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------
	
	/**
	 * Título de la película a la que pertenece la copia
	 */
     private String tituloPelicula;
     
     /**
      * Código de la copia
      */
     private int codigo;
     
     // -----------------------------------------------------------------
     // Constructores
     // -----------------------------------------------------------------
     
     /**
	  * Crea una copia de la película con el título y código dados. <br>
	  * post: La copia se crea con el título y código dados.
	  * @param laPelicula Título de la película a la que pertenece la copia. laPelicula != null.
	  * @param elCodigo Código de la copia. elCodigo > 0.
	  */
     public Copia( String laPelicula, int elCodigo) {
    	 tituloPelicula = laPelicula;
         codigo = elCodigo; 
     }
     
     // -----------------------------------------------------------------
     // Métodos
     // -----------------------------------------------------------------
     
     /**
	  * Retorna el código de la película a la que pertenece la copia
	  * @return Código de la película
	  */
     public int darCodigo() {
		 return codigo;
	 }
     
     /**
      * Retorna el título de la película a la que pertenece la copia
      * @return Título de la película a la que pertenece la copia
      */
     public String darTituloPelicula() {
    	 return tituloPelicula;
     }
     
     /**
      * Verifica si dos copias son iguales. Dos copias son iguales si tienen el mismo código y pertenecen a la misma película.
      * @return true si son iguales, false en caso contrario1
      * @param otra Copia a comparar
      */
     public boolean esIgualA(Copia otra) {
    	 return codigo == otra.darCodigo() && 
                 tituloPelicula.equals(otra.darTituloPelicula());
     }
}
