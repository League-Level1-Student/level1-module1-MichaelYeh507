package _05_vault;

public class Vault {
	int secretCode = 45698752;
	boolean tryCode(int code) {
		if (code == secretCode) {
			return true;
		} else {
			return false;
		}
	}
}
