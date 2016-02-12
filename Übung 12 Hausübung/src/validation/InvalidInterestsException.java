package validation;

public class InvalidInterestsException extends ValidationException{

	/**
	 * Exception, falls nicht passende Interessenfelder �bergeben wurden.
	 */
	public InvalidInterestsException() {
		super("Es wurden keine/nicht passende Interessenfelder �bergeben.");
	}

}
