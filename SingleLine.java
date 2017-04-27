import java.util.Random;
import structure5.*;

public class SingleLine extends BusinessSimulation{

    
    public SingleLine(int numCustomers, int numServicePoints, int maxEventStart, int seed){
	super();
    }

    protected VectorHeap<Customer> makeSingleLine (){
	this.customers = generateCustomerSequence(this.numCustomers, this.maxEventStart, this.seed);
    }

    //single step
    public boolean step(){
	if(this.customer.isEmpty()){
	    return true;
	}
	++this.time;
	//we also want to modify each tellers customers and the service time remaining for that customer
    }
    
    //arbitrary amount of steps
    public boolean step(int timeSteps){
	if(this.customer.isEmpty()){
	    return true;
	}
	this.time += timeSteps;
	//we also want to modify each tellers customers and the service time remaining for that customer
    }
}
