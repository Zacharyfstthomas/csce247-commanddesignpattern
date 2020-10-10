package csce247.assignments.command;

import java.util.ArrayList;

public class Agent {

	
	private ArrayList<Command> orders;
	
	public Agent() {
		
		orders = new ArrayList<Command>();
	}
	
	public void placeOrder(Command command) {
			command.execute(); // temporary maybe not permanent
		
	}
	
	public void processOrders() {}
	
	
}
