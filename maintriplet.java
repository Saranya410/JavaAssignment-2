import java.io.*;
public class maintriplet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a Value");
		int val=Integer.parseInt(br.readLine());
		if(val<=2)
		{
			System.out.println("Cant procced");
		}
		else
		{
			int arr[]=new int[val];
			System.out.println("Enter Numbers");
			for(int i=0;i<arr.length;i++)
			{
				String s1=br.readLine();
				int x=Integer.parseInt(s1);
				arr[i]=x;
			}
			exam3.checktriplets(arr);
			
		
		}
		
		
	}

}
