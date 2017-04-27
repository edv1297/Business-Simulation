import java.util.Random;
import structure5.*;

public class SingleLine extends BusinessSimulation{

    PriorityQueue<Customer> customers = new VectorHeap<Customer>();
    Customer[] TellerList;
    
    public SingleLine(int numCustomers, int numServicePoints, int maxEventStart, int seed){
	super(numCustomers, numServicePoints, maxEventStart, seed);
	this.TellerList = new Customer[numServicePoints];
    }

    protected PriorityQueue<Customer> makeSingleLine (){
	customers = generateCustomerSequence(this.numCustomers, this.maxEventStart, this.seed);
	return customers;
    }

    //single step
    @Override
    protected boolean step(){
	if(this.customers.isEmpty()){
	    return true;
	}
	++this.time;
	for(int teller = 0; teller < TellerList.length; teller++){
	    if(--this.TellerList[teller].serviceTime == 0){
		this.TellerList[teller] = customers.getFirst();
		//pop off the queue and add the popped customer in that location
	    }
	    --this.TellerList[teller].serviceTime;	    
	}
	return false;
    }
    
    //arbitrary amount of steps
    protected boolean step(int timeSteps){
	if(this.customers.isEmpty()){
	    return true;
	}	
	this.time += timeSteps;
	for(int teller = 0; teller < TellerList.length; teller++){
	    if(this.TellerList[teller].serviceTime - timeSteps == 0){
		this.TellerList[teller] = customers.getFirst();
	    }
	    this.TellerList[teller].serviceTime -= timeSteps;
	}
	return false;
    }

    public String toString(){
	String singleLine = "{ Current Customers: ";
	for(int i = 0; i < this.numCustomers; i++){
	    singleLine + 
	}
	return ("{ Current Customers: " +  

	

    }
    public static void main(String[] args){
	SingleLine line = new Single(10, 3, 100, 5);

	while(line.step()){

	}
	
    }    
}

//figure out the the queue situation for tellers
// figure out the popping situation for customers
//conqeur the comp sci lab
//get money
