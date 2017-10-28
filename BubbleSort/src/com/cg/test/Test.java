package com.cg.test;

public class Test {
	
	
	public static void main(String[] args) {
		
		int [] arr= {1,4,5,3,8,34,12};
		  
		  for(int i=0;i<arr.length-1;i++){
			  
			  
			  
			  boolean flagSwiped=false;
			  for(int j=0;j<arr.length-i-1;j++) {
				   
				  if(arr[j]>arr[j+1]) {
					  
					  int temp;
					  temp=arr[j+1];
					  arr[j+1]=arr[j];
					  arr[j]=temp;
					  flagSwiped=true;
					  
					  
				  }
				  
				
				  
			  }
			  
			  if(flagSwiped==false) {
					System.out.println("breaked");
					  break;
				  } 
		  }
		
	
		  for(int k:arr) {
			  System.out.println(k);
		  }
  
	  
	  
  }
}



