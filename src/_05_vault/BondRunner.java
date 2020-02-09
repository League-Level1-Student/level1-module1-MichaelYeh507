package _05_vault;

public class BondRunner {
	public static void main(String[] args) {
		Bond bond = new Bond();
		Vault vault = new Vault();
		System.out.println(bond.findCode(vault));
		
	}
}
