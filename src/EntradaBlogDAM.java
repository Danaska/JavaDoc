
//Danaska Alonso 25/04/2020

/**
 * @author $danaska
 *
 * ${tags}
 */
		//java.lang.Object
		//EntradaBlogDAM

		//public class EntradaBlogDAM
		//extends java.lang.Object
	
	public class EntradaBlogDAM {
		//separador es el carácter que separa ENTRADA DE del
		//nombre del autor
		
		public static char separador=':';
		//public static char separador
		private int id;
		private String texto;
		private String autor;
		
		//Constructor de la clase. recibe el número de entrada, el nombre del autor
		//de la entrada y el texto que contiene la entrada. Si el número de entrada
		//es negativo, lanza una excepción.
		
		//Constructor Detail

		//EntradaBlogDAM
		//public EntradaBlogDAM(int id,
		//                     java.lang.String autor,
		//                    java.lang.String texto)
		//             throws java.lang.IllegalArgumentException
		//Throws:
		//java.lang.IllegalArgumentException
		
		public EntradaBlogDAM(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		
		//Method Summary

		//All MethodsStatic MethodsInstance MethodsConcrete Methods
		//Modifier and Type	Method and Description
		//java.lang.String	devuelveAutor() 
		//java.lang.String	getAutor() 
		//int	getId() 
		//java.lang.String	getTexto() 
		//static void	main(java.lang.String[] args) 
		//java.lang.String	toString() 
		//Methods inherited from class java.lang.Object
		//equals, getClass, hashCode, notify, notifyAll, wait, wait, wait

		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		//Devuelve el número de la entrada
		public int getId(){
			return this.id;
		}
		
		//devuelve el texto completo de la entrada
		public String getTexto(){
			return this.texto;
		}
		
		//devuelve el nombre del autor de la entrada en mayúsculas
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		public String devuelveAutor(){
			return this.autor;
		}
		
		//No tiene por qué tener argumentos.
		public static void main(String[] args) {
	                //Modificar.
			EntradaBlogDAM e1=new EntradaBlogDAM(-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
	}


