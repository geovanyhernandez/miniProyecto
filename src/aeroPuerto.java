public class aeroPuerto {
	private String nombre;
	private String aerolinea;
	private int desembarque;
	private int numerovuelo;
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setAerolinea(String aerolinea){
		this.aerolinea=aerolinea;
	}
	public void setDesembarque(int desembarque){
		this.desembarque=desembarque;
	}
	public void setNumerovuelo(int numerovuelo){
		this.numerovuelo=numerovuelo;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getAerolinea(){
		return aerolinea;
	}
	public int getDesembarque(){
		return desembarque;
	}
	public int getNumerovuelo(){
		return numerovuelo;
	}

}