package bank;

import java.util.ArrayList;


public class bankaccount {
	public static void main(String[] args) {
		
		 ArrayList<bankaccountp> cust = new ArrayList<bankaccountp>();
		 cust.add(new bankaccountp(1,"Bubble"));
		 cust.add(new bankaccountp(2,"Momo"));
		 cust.add(new bankaccountp(3,"Kokoh"));
		 cust.add(new bankaccountp(4,"Lalaloy"));
		 cust.add(new bankaccountp(5,"Hank"));
		 
		 cust.get(0).deposit(500);
		 cust.get(0).deposit(500);
		 cust.get(0).withdraw(500);
		 cust.get(0).deposit(500);
		 
		 cust.get(1).deposit(3000);
		 cust.get(1).withdraw(500);
		 cust.get(1).withdraw(500);
		 cust.get(1).withdraw(500);
		 
		 cust.get(2).deposit(2500);
		 cust.get(2).deposit(2500);
		 cust.get(2).deposit(2500);
		 cust.get(2).deposit(2500);
		 cust.get(2).addInterest(3);
		 
		 cust.get(3).deposit(200);
		 cust.get(3).deposit(500);
		 cust.get(3).withdraw(1000);
		 cust.get(3).withdraw(1000);
		 
		 cust.get(4).deposit(800);
		 cust.get(4).withdraw(200);
		 cust.get(4).withdraw(200);
		 cust.get(4).withdraw(200);
		 
		 
		double n = cust.get(0).getBalance(); 
		 
		 for (int i = 0; i < cust.size(); i++) {
			 if(n < cust.get(i).getBalance()) {
		           n = cust.get(i).getBalance();
			 }
		 }	
		 
		 for (int i = 0; i < cust.size(); i++) {
			 if(n==cust.get(i).getBalance()) {
				 System.out.printf("The person with highest account balance is %s ($%.2f)\n",cust.get(i).customerName,n);
			 }
		 }
		 
		 for (int i = 0; i < cust.size(); i++) {
			 if(n > cust.get(i).getBalance()) {
		           n = cust.get(i).getBalance();
			 }
		 }
		 
		 for (int i = 0; i < cust.size(); i++) {
			 if(n==cust.get(i).getBalance()) {
				 System.out.printf("The person with lowest account balance is %s ($%.2f)\n",cust.get(i).customerName,n);
			 }
		 }
		 
		 String Deposit = "D",Withdraw = "W";
		 int[] Dtimes,Wtimes;
		 Dtimes = new int[10];
		 Wtimes = new int[10];
	        for (int j = 0; j < cust.size();j++) {
	        	for (int i = 0; i < cust.get(j).getTransactions().length(); i++) {
		            if (cust.get(j).getTransactions().substring(i).startsWith(Deposit)) {
		                Dtimes[j] ++;
		                Wtimes[j] --;
		                if(Wtimes[j] == -1) {
		                	Wtimes[j]++;
		                }
		            }
		            else {
		            	Dtimes[j] --;
		            	Wtimes[j] ++;
		            	if(Dtimes[j] == -1) {
		            		Dtimes[j]++;
		            }
		        }
	        }
	        }
         	
	        for (int i = 0; i < cust.size(); i++) {
	        	if(Dtimes[i]>Wtimes[i]) {
	        		System.out.println(cust.get(i).customerName + " : Longest repeating activity : Deposit (" + Dtimes[i] +"times)" );
	        	}
	        	else if(Dtimes[i]<Wtimes[i]) {
	        		System.out.println(cust.get(i).customerName + " : Longest repeating activity : Withdraw (" + Wtimes[i] +"times)" );
	        	}	
	        }
		
	}
}
