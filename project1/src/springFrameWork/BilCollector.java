package springFrameWork;

public class BilCollector {
 Payment p= new DebitCard();
 public void billPay(double amount) {
	 String result =p.payment();
	 System.out.println(result);
 }
}
