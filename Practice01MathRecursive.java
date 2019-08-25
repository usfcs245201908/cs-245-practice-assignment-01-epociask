import java.lang.*;




public class Practice01MathRecursive implements Practice01Math{



	public Practice01MathRecursive(){
		return;

	}



	public int fact(int n) throws Exception{

		if(n < 0){
			throw new IllegalArgumentException("ERROR NON NEGATIVE NUMBERS ONLY ");
		}
		if(n<=1){
			return 1;
		}
			return n * fact(n-1);
	}



	public int fib(int n) throws Exception{

		if(n < 0){
			throw new IllegalArgumentException("ERORR NON NEGATIVE NUMBERS");
		}

		else if(n <= 1){
		 	return n;
		 }

		 else{
		 	return fib(n-2) + fib(n-1);
		 }
	}


	
}