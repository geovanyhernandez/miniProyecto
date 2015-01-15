public class aeroPuerto  extends Avion {
	private String nombre;
	private int desembarque;
 
 	public void setNombre(String nombre){
		this.nombre=nombre;
	}
 	public void setDesembarque(int desembarque){
		this.desembarque=desembarque;
	}
	public String getNombre(){
		return nombre;
	}
 	public int getDesembarque(){
		return desembarque;
	}
 

}