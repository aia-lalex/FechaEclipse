/**
 * Tarea ENDES 04
 * Versi�n 1.0
 * Versi�n 1.1 Refactorizado atributos
 * Versi�n 1.2 Refactorizado parametros del constructor
 * Versi�n 1.3 Refactorizado el metodo valida
 * Versi�n 1.4 Refactorizado el metodo validar
 * FechaEclipse
 */
package FechaEclipse;
/**
 * @author Alejandro Hurtado Navarro
 *
 */
public class FechaEclipse {
	public int dia;
	public int mes;
	public int a�o;

	public FechaEclipse(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	public boolean valida() {
		return validarFecha();
	}
	/**
	 * @return Resultado de refactorizar el metodo valida
	 */
	public boolean validarFecha() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
	
		// Determinamos la cantidad de d�as del mes:
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
	
		case 2: // Verificamos si el a�o es bisiesto
			if ((a�o % 400 == 0) || ((a�o % 4 == 0) && (a�o % 100 != 0)))
				diasMes = 29;
			else
				diasMes = 28;
			break;
		}
		if (dia > diasMes)
			return false;
		else
			return true;
	}
}
