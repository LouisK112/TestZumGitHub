package validation;

public class ValidationException extends Exception {

	/**
	 * Oberklasse f�r Exceptions
	 * @param fehler Fehlermeldung
	 */
	public ValidationException(String fehler) {
		super(fehler);
	
	}

}
