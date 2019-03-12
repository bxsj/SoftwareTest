package noUse;
//50 20 5 5 1 1 1
public class TranigleProblem {
    public boolean canTakeOut(int money) {
    	if(money>=50) {
    		money -=50;
    	}
    	if(money>=20) {
    		money -= 20;
    	}
    	if(money>=5) {
    		money -= 5;
    	}
    	if(money>=5) {
    		money -= 5;
    	}
    	if(money>=1) {
    		money -= 1;
    	}
    	if(money>=1) {
    		money -= 1;
    	}
    	if(money>=1) {
    		money -= 1;
    	}
    	return (money==0);
    }
}
