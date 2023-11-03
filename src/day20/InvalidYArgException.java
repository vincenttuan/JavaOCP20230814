package day20;

//自訂錯誤類
public class InvalidYArgException extends Exception {
	InvalidYArgException(String errorMessage) {
		super(errorMessage);
	}
}
