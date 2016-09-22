package prob5;

public class Money {
	private int amount;
	
	public Money( int t ){
		this.amount = t;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add( Money money ) {
		money.setAmount( this.amount + money.getAmount() );
		return money;
    }
    public Money minus( Money money ) {
    	money.setAmount( Math.abs(this.amount - money.getAmount()));
    	return money;
    }
    public Money multiply( Money money ) {
    	money.setAmount( this.amount * money.getAmount());
    	return money;
      }
    public Money devide( Money money ) {
    	money.setAmount( this.amount / money.getAmount());
    	return money;
    }
    
    @Override
    public boolean equals( Object obj ) {
    	if( this == obj ){
    		return true;
    	}
    	
    	if( this.getClass() == obj.getClass() ){
    		return true;
    	}
    	
    	return false;
    }
}
