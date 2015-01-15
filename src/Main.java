import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		aeroPuerto informacion = new aeroPuerto();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nombre de aeropuerto: ");
		informacion.setNombre(sc.next());
	
			
		System.out.println("nombre de aerolinea: ");
		informacion.setAerolinea(sc.next());
		
		System.out.println("Nº puerta desembarque: ");
		informacion.setDesembarque(sc.nextInt());
		
		System.out.println("Nº de vuelo: ");
		informacion.setNumerovuelo(sc.nextInt());
		
		System.out.println("Nombre de vuelo: " + informacion.getNombre());
		System.out.println("Nombre de aerolinea: " + informacion.getAerolinea());
		System.out.println("Numero desembarque " + informacion.getDesembarque());
		System.out.println("Numero de vuelo: " + informacion.getNumerovuelo());
	}

}
