package day22;

public interface TransactionCallback {
	void onTransactionCompleted(String result, int amount, int price);
}
