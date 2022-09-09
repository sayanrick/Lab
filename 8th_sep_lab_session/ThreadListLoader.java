package Lab_Session_8th_Sep;

import java.util.ArrayList;

public class ThreadListLoaderLab implements Runnable{
	public void run() {
		ArrayList<Integer> numbers = new ArrayList<Integer>(1000000);

		for (int i = 0; i <= 1000000; i++)
		{
		   numbers.add(i);
		   System.out.println(numbers.get(i));
		}
		System.out.println("time taken in ms:"+System.currentTimeMillis ());
	}
		
				
		

		public static void main(String[] args) {
			Runnable r= new ThreadListLoaderLab();
		
			Thread t=new Thread(r);//creating object
			t.start();//call
			
		}
	
	}
