public class evenDigitsOnly {
	boolean evenDigitsOnlyMethod(int n) {
		if(n<30){
		        if(n%2==0){
		            return true;
		        }
		        else{
		            return false;
		        }
		    }
		    else{
		        while(n>0){
		            int r = n%10;
		            if(r%2==0){
		                n=n/10;
		            continue;
		        }
		        else{
		            return false;
		        }
		        }
		    }
		    return true;
		}
}
/*
 * boolean evenDigitsOnly(int n) {
    if (n == 0) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return evenDigitsOnly(n / 10);
}


the best solution
return Integer.toString(n).matches("(0|2|4|6|8)*");
 *
 */