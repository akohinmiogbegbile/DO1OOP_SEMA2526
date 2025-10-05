package methods;

public class Player {
    int position;
    public void move() {
    	
        if (position < 10) {
        	position = position + 1;
    		System.out.println("Player moved forward to position " + position);
    	} else {
    		position = 10;
    		System.out.println("Player has reached the limit, Position stays at " + position);
    	}
    }
    public void back() {
    	if (position > 0 ) {
    		position = position - 1;
    		System.out.println("Player moved back to position " + position);
    	} else {
    		position = 0;
    		System.out.println("You're already at the start buddy");
    	}

    }

}
