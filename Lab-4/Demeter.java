
public class Demeter {
  public static void main(String[] args) {
    ShopKeeper john = new ShopKeeper();
    Wallet wallet = new Wallet(100);
    System.out.println("Value in wallet is: " + wallet.getTotalMoney());
    Customer aoife = new Customer(wallet);
    john.chargeCustomer(aoife, 50);
    System.out.println("Value in wallet is: " + wallet.getTotalMoney());
  }
}

class Wallet {
	  public  Wallet(float newValue) {
	    value = newValue;
	  }
	  public float getTotalMoney() {
	    return value;
	  }
	  public void addMoney(float deposit) {
	    value += deposit;
	  }
	  public Float subtractMoney(float debit) {
	    value -= debit;
	    return value;
	  }
	  private float value;
	}


class Customer {
  public Customer(Wallet wallet){
    name=""; //unused
    myWallet = wallet;
  }
  public String getName() {
    return name;
  }
  public Float getWalletTotalMoney(){
	  return myWallet.getTotalMoney();
  }
  public Float getWalletSubtractMoney(float debit){
	  return myWallet.subtractMoney(debit);
  }
 
  private String name;
  private Wallet myWallet;
}


class ShopKeeper {
  public void chargeCustomer(Customer cust, float amount){
    if(cust.getWalletTotalMoney() > amount){
    	cust.getWalletSubtractMoney(amount);
    	}else{
    		// get the baseball bat...
    	}
  }
}



