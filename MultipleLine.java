import java.util.Random;
import structure5.*;

public class MultipleLine extends BusinessSimulation{
    
    PriorityQueue<Customer> customers = new VectorHeap<Customers>();
    SingleLine[] multipleLines;
    
    //not sure if want this to be final or modifiable by the user?
    static final int NUM_OF_TELLERS = 3;
    
    public MultipleLine(int numCustomers, int numServicePoints,
			int maxEventStart, int seed){
	super(numCusomters, intNumServicePoints, maxEventStart, seed );
	this.multipleLines = new SingleLine[numServicePoints];
    }

    protected PriorityQueue<Customer> makeMultipleLines(){
	this.customers = generateCustomer(this.numCustomers, this.maxEventStart, this.seed);
	return this.customers;
    }

    protected boolean step(){
	if(this.customers.isEmpty()){
	    return true;
	}
	++this.time;
	for (int teller= 0; teller< multipleLines; ++teller){
	    
	    if(multiplelines[teller].step())
	}
    }
}
