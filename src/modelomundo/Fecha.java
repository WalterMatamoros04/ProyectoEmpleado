package modelomundo;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	//Constructor
	public Fecha (int pDia, int pMes, int pAnio){
		dia= pDia;
		mes= pMes;
		anio = pAnio;
	}
	
	public Fecha (){
		dia= 0;
		mes= 0;
		anio =0;
	}
	//Métodos analizadores
	
	
	public int getDia() {
		return dia;
		
	}
	public int getMes() {
		return mes;
		
	}
	public int getAnio() {
		return anio;
		
	}
	
	//Métodos funcionales
	
	//fecha 1  23/04/2000  fecha 2 15/08/2008
	
	public int darDiferenciaEnMeses (Fecha pFecha) {
		int numeroMeses =0;
		int difAnios = pFecha.getAnio()-anio*12;
		int difMese= mes - pFecha.getMes();
		
		if (mes<pFecha.getMes()) {
			difMese = mes-pFecha.getMes();
		}
		
		int difDias = 0;
		if(mes < pFecha.getMes()) {
			difDias =(pFecha.getDia()-dia )/30;
		}
		
		numeroMeses = difAnios+ difMese+difDias;
		
		
		 return 0;
	}
	
	public String toString() {
		
		return dia + "-"+ mes+ "-"+ anio;
	}

	
}
