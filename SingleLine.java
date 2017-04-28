import java.util.Random;
import structure5.*;

public class SingleLine extends BusinessSimulation{

    PriorityQueue<Customer> customers = new VectorHeap<Customer>();
    Customer[] tellerList;
    
    public SingleLine(int numCustomers, int numServicePoints, int maxEventStart, int seed){
	super(numCustomers, numServicePoints, maxEventStart, seed);
	this.tellerList = new Customer[numServicePoints];
    }

    protected PriorityQueue<Customer> makeSingleLine (){
	this.customers = generateCustomerSequence(this.numCustomers, this.maxEventStart, this.seed);
	return this.customers;
    }

    //single step
    @Override
    protected boolean step(){
	if(this.customers.isEmpty()){
	    return true;
	} 
	++this.time;
	for(int teller = 0; teller < tellerList.length; teller++){
	    if(--this.tellerList[teller].serviceTime == 0){
		this.tellerList[teller] = customers.getFirst();
		//pop off the queue and add the popped customer in that location
	    }
	    --this.tellerList[teller].serviceTime;	    
	}
	return false;
    }
    
    //arbitrary amount of steps
    protected boolean step(int timeSteps){
	if(this.customers.isEmpty()){
	    return true;
	}	
	this.time += timeSteps;
	for(int teller = 0; teller < tellerList.length; teller++){
	    if(this.tellerList[teller].serviceTime - timeSteps == 0){
		this.tellerList[teller] = customers.getFirst();
	    }
	    this.tellerList[teller].serviceTime -= timeSteps;
	}
	return false;
    }

    //represent the number of customers left in the line after each step
    public String toString(){
	String singleLine = "";
	Iterator <Customers> getCustomers = new Iterator();
	for (int i =0; i < numCustomers; ++i){
	    singleLine + getCustomers.next().  + "\n";
	}
	return "Current Customers: " + singleLine;  

	

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
