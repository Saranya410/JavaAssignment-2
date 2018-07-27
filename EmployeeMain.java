import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of employees: ");
		n=Integer.parseInt(br.readLine());
		EmployeeVO evo[]=new EmployeeVO[n];
		
		for(int i=0;i<n;i++) {
		
		
		System.out.println("Enter employee id: ");
		int num=Integer.parseInt(br.readLine());
		
		System.out.println("Enter name: ");
		String name=(br.readLine());
		
		System.out.println("Enter annual income: ");
		double income=Double.parseDouble(br.readLine());
		
		evo[i]=new EmployeeVO(num, name, income);
		}
		
		
		// Let's call the method to calculate the it
		EmployeeBO ebo=new EmployeeBO();
		
		for (int i=0;i<n;i++)
		{
			
			
			ebo.calincmetax(evo[i]);
			System.out.println(evo[i]);
	}
		Arrays.sort(evo, new Employeesort());
		for (int i=0;i<n;i++)
		{
			
			
			ebo.calincmetax(evo[i]);
			System.out.println(evo[i]);
	}
		
	}
	}


