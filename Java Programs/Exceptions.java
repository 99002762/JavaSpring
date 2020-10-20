package training1;

import java.util.Scanner;

public class Exceptionss {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
        int y=sc.nextInt();
		
        try{
            
            int res=x/y;
            if(res==0)
            {
            	throw new customException();
            }
        }
        
        catch (Exception e)
        {
        	System.out.println("Error");
        }
		
	}
}
