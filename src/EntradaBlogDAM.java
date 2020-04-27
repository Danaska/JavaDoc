

/**
 * @author $danaska
 * @version 25/04/2020
 * 
 */

	
	public class EntradaBlogDAM {
		/**
		 * Constructor de la clase. recibe el número de entrada, el nombre del autor de la entrada y el texto que contiene la entrada. 
		 * @param separador Carácter que separa ENTRADA DE del nombre del autor
		 * @param autor Autor
		 * @param id Id
		 * @param texto Texto
		 * @throws IllegalArgumentException Si Id es negativo 
		 */
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		
		public EntradaBlogDAM(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		

		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		/**
		* Devuelve el número de la entrada
		* @return id
		*/
		public int getId(){
			return this.id;
		}
		/**
		* Devuelve el texto completo de la entrada
		* @return texto
		*/
		public String getTexto(){
			return this.texto;
		}
		/**
		* Devuelve el nombre del autor de la entrada en mayúsculas
		* @return autor
		*/
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		/**
		* Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		* @return autor
		*/
		public String devuelveAutor(){
			return this.autor;
		}
		
		public static void main(String[] args) {
	               
			EntradaBlogDAM e1=new EntradaBlogDAM(-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
	}


