package com.aranzazu.appnoites15;



	public class Actividad {
		
		private String hora;
		private String nombre;
		
		private int aviso1;
		private int aviso2;
		
		public Actividad(String hora, String nombre, int aviso1, int aviso2){
		
		this.hora = hora;
		this.nombre = nombre;
		this.aviso1 = aviso1;
		this.aviso2 = aviso2;
		}
	

		
		public String getHora() {
	
		return hora;
	
		}
        public String getNombre() {

            return nombre;

        }

		public int getAviso1() {
			
			return aviso1;
		
			}
		public int getAviso2() {
			
			return aviso2;
		
			}
	
		

	
		}

