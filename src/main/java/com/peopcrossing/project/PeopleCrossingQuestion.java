package com.peopcrossing.project;


public class PeopleCrossingQuestion {
	
	public int Solution(int[] arr)
	{
		int count=0;
		  for(int i=0; i<arr.length;i++)
		  {
			  if(arr[i]==0) 
			  { 
				  for(int j=0;j<arr.length;j++)
			  {
					  if(arr[j] == 1 && i < j)
			  {
				  System.out.println(i+"  "+j); 
				  count++;
				  }
					  }
				  }
			  }

		  if(count > 1000000000)
		  {
		  return -1;
		  }
		  
		  return count;

	}

public static void main(String args[])
	
	{
		
		  int [] arr = {0,1,0,1,1,0,1,1,0,0,1,0,0,1,1};
		  PeopleCrossingQuestion a = new PeopleCrossingQuestion();
		  System.out.println(a.Solution(arr));	
	}		

	}
