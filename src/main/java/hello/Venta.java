package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Venta {
	private int id;
	private String nombrepelicula;
	private int duracionpelicula;
	private String tipoestreno;// E, N
	private String horapelicula;
	private String salapelicula;
	private String nombrecliente;
	private String dnicliente;
	private String asiento;
	private int cantidad;
	private String tipopago;// EFECTIVO - TARJETA
	private double montopago;

	public Venta() {
		super();
	}
	
	public String getHorapelicula() {
		return horapelicula;
	}

	public void setHorapelicula(String horapelicula) {
		this.horapelicula = horapelicula;
	}

	public String getSalapelicula() {
		return salapelicula;
	}

	public void setSalapelicula(String salapelicula) {
		this.salapelicula = salapelicula;
	}

	public String getDnicliente() {
		return dnicliente;
	}

	public void setDnicliente(String dnicliente) {
		this.dnicliente = dnicliente;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public String getNombrepelicula() {
		return nombrepelicula;
	}

	public void setNombrepelicula(String nombrepelicula) {
		this.nombrepelicula = nombrepelicula;
	}

	public int getDuracionpelicula() {
		return duracionpelicula;
	}

	public String getTipoestreno() {
		return tipoestreno;
	}

	public void setTipoestreno(String tipoestreno) {
		this.tipoestreno = tipoestreno;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public void setDuracionpelicula(int duracionpelicula) {
		this.duracionpelicula = duracionpelicula;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipopago() {
		return tipopago;
	}

	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}

	public double getMontopago() {
		return montopago;
	}

	public void setMontopago(double montopago) {
		this.montopago = montopago;
	}

    @Override
    public String toString() {
    	
    	String est=null;
if (tipoestreno.toString().equals("E")){
	est="Si";    			
    	}else
    est="No";
    	{
    		
    		}
        return "Venta #" + id + "Película: "+nombrepelicula+
    	" duracion: " + duracionpelicula +
    	"min. Estreno: " +est+	
    	" Hora: "+horapelicula +
    	" Sala: "+salapelicula +
    	" Cliente: "+nombrecliente +
    	" DNI: "+dnicliente +
     	" Asiento(s): "+asiento +
    	" # de entradas: "+cantidad +
    	" Tipo de pago: "+tipopago +
    	" Total: "+montopago +
                "";
    }
}