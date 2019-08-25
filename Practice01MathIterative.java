import java.util.*;

public class Practice01MathIterative implements Practice01Math{


	public int fib(int n) throws Exception{

		if(n < 0){
			throw new IllegalArgumentException("ERROR INVALID INPUT");
		}

		else if(n <= 1){
			return n;
		}

		else{

		int currentVal = 1, previousVal = 1, temp;

		for(int i = 2; i < n; i++){
			 temp = currentVal;
			currentVal += previousVal;
			previousVal = temp;


		}

		return currentVal;



	}

	


	}


	public int fact(int n) throws Exception{

		if(n < 0){
			throw new IllegalStateException("ERROR INVALID INPUT");

		}

			int x = 1, i; 


			for(i = 1; i <= n; i++){
					
				x = x * i;	


			}

			return x; 
		}
	}




