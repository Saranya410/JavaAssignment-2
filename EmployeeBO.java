class EmployeeBO
{
	public void calincmetax(EmployeeVO evo)
	{
		double incmetax=evo.getAnnual_income()*.3;
		evo.setIncome_tax(incmetax);
	
		
		}

}
