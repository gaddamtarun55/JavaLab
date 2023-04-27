
public class Account {
 long accountNo;
 String accountType;
 double accountBalanace;
 public void setAccountDetails(long i , String s , double d){
	 accountNo = i;
	 accountType ="s";
	 accountBalanace =d;
	 }
 public void withdraw(double amount) 
 {
	 
	 accountBalanace=accountBalanace-amount;
 }
 public void deposit(double amount)
 {
	 accountBalanace=accountBalanace+amount;
 }
 
}
