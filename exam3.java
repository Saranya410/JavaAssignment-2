import java.io.*;
public class exam3 {
//InputStreamReader isr=new InputStreamReader(System.in);
//BufferedReader br=new BufferedReader(isr);
  public static boolean checktriplets(int arr[]) {
	  //int[]arr=new arr[];
	  int x=0;
	  for(int i=0;i<arr.length-2;i++)
	  {
		  if(arr[i]==arr[i+1])
		  {
			  if(arr[i+1]==arr[i+2])
			  {
				  x=1;
			  }
			  else
			  {
				  x=0;
			  }
		  }
	  }
		  if(x==1)
			  System.out.println("true");
		  else
			  System.out.println("false");
	  
	return true;
  }
}


