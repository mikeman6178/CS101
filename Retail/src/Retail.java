

class Customer{
	private int customerId;
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	public int getCustomerId(){
		return customerId;
	}
}
class Retail{
	public static void main(String args[]){
		Customer Mike = new Customer();
		Mike.setCustomerId(1001);
		System.out.println("customer Id : " + Mike.getCustomerId());
	}
}