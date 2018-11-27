package speedDemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double c=0,m,v,r,Max =60,result;
		Scanner in = new Scanner(System.in);
		m = in.nextDouble();
		double[] ar = {1,10,20,40};
		r = 3;
		Determinations ob = new Determinations();
		for(double d :ar) {
		
		result = ob.calculate(d,r,m);
		System.out.println("result will be-> "+result);
		if(result>=Max) {
			System.out.println("greatest speed will be-> "+c);
			break;
		}
		c=d;
		}
		
	}

}
