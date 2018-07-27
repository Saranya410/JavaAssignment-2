import java.util.Comparator;
import java.io.*;
public class Employeesort implements Comparator {

	
	@Override
	public int compare(Object o1,Object o2)
	{
		EmployeeVO evo1=(EmployeeVO)o1;
		EmployeeVO evo2=(EmployeeVO)o2;
		int retval=0;
		if(evo1.getIncome_tax()<evo2.getIncome_tax())
			retval=-1;
		else
			if(evo1.getIncome_tax()>evo2.getIncome_tax())
				retval=-1;
			else
				retval=0;
			
		return retval;
	}
	

}
