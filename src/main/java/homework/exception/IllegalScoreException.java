package homework.exception;

public class IllegalScoreException extends RuntimeException{
	public IllegalScoreException(){
		super();
	}
	public IllegalScoreException(String s){
		super(s);
	}
}
