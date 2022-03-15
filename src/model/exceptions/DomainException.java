package model.exceptions;

/*extends RuntimeException (compilador n�o obriga a trata
ou Exception (obrigado a tratar)*/
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L; // Add default serial version ID
	
	public DomainException(String msg) {
		super(msg);
	}
}
