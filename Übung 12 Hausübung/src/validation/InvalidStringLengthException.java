package validation;

public class InvalidStringLengthException extends ValidationException{

	/**
	 * Exception, falls ein String nicht einer bestimmten L�nge entspricht
	 */
	public InvalidStringLengthException() {
		super("String entspricht nicht der vorgesehen L�nge.");
	}

}
