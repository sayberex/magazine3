package clients;

public class VipVisitor extends BaseVisitor {
	private float discount;
	
	
	
	@Override
	public void buy() {
		if (checkDiscount())
			super.buy();
		else {
			//buy with discount
		}
	}



	private boolean checkDiscount() {return discount > 0;}
}
