
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente outra = null;
		//cc.deposita(100.0);
		
		int a =3;
		int b = a/0;
		
		ContaCorrente cc = new ContaCorrente(111, 112);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(221, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: "+cc.getSaldo());
		System.out.println("CP: "+cp.getSaldo());
		
	}

}
