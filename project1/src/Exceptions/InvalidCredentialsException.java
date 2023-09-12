package Exceptions;

public class InvalidCredentialsException extends Exception {
//private String msg;

public InvalidCredentialsException(String msg) {
	//this.msg=msg;
	super(msg);
}

}
