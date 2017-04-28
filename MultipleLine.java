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
	this.multipleLines = new SingleLine[NUM_OF_TELLERS];
    }
}
