package validation;

public class InvalidCharacterException extends ValidationException {

	/**
	 * Exception, falls sich unerlaubte Zeichen im Namen befinden
	 */
	public InvalidCharacterException() {
		super("Es befinden sich im �bergeben Namen unerlaubte Zeichen.");
	}

}
