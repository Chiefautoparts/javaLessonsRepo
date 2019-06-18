public class Package {
	public int shippingNumber;
	public String shippingAddress;
	public Boolean atWarehouse;

	public Package(int shippingNumber, String shippingAddress){
		this.shippingNumber = shippingNumber;
		this.shippingAddress = shippingAddress;
		this.atWarehouse = true;
	}
	
}