package assignment14; //created package name as assignment14

public class ThreadExample extends Thread{ //created class names as ThreadExample which extends thread to implement the threads

		public void run(){   // Here  Extending Thread Class is required to 'override run()' method.
			                 // Here The run method contains the actual logic to be executed by thread.  
			
			for (int orderNumber=1;orderNumber<=10;orderNumber++){	 //here creating a for loop  to execute it  for 10 times
				try{                            //the sleep method throws an Interrupted Exception to handle this we are using try catch block
						
						Thread.sleep(3000);//here sleep() it makes current executing thread to sleep for a specified interval of time. Time is in milli seconds.
				}
				catch (InterruptedException e){      // throws an interrupted exception
						
				}
	    System.out.println("Welcome to AcadGild");   //it gives the output as welcome to AcadGild for every 3 seconds
			}
		  }   
		  public static void main(String args[]){      //here created main method
			  
		    ThreadExample object=new ThreadExample();    //created  object 
		    
		     object.start();   //Creating of thread object never starts execution, we need to call 'start()' method to run a thread
		  }
		
		}  

	


