package controller;

import java.util.Scanner;

import model.logic.Mundo;
import view.MVCView;

public class Controller {

	/* Instancia del Modelo*/
	private Mundo mundo;

	/* Instancia de la Vista*/
	private MVCView view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new MVCView();
		
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){

			case 1:
				try
				{
					mundo = new Mundo();	
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

				break;

			case 2: 
				mundo.generarMuestraHeap(200000);
				mundo.generarMuestra(200000);
				System.out.println("Se tom� la muestra correctamente");
			case 3: 
				System.out.println("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			default: 
				System.out.println("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}

	}	
}
