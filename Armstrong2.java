package pgdac_march23a;

public class Armstrong2 {

	public static void main(String[] args) {
		
		int n=1634;
		int m=n;
		int rem=0;
		int p=0;
		while(n!=0)
		{
		rem= n%10;
		//p+= rem*rem*rem;  //p= 3+3*3 +5*5*5 + 1*1*1
		p+=Math.pow(rem, 4);
		
		//System.out.println(rem);
		n=n/10; 


		}

		if( m==p)
		  System.out.println("number is armstrong"+ m + " "+ p);
		else 
		System.out.println(" not armstrong"+ m +"  "+p);
	}

}
