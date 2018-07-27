
public class EmployeeVO {



		int emp_id;
		String name;
		double annual_income;
		double income_tax;
		
		
		public EmployeeVO(int emp_id, String name, double annual_income) {
			super();
			this.emp_id = emp_id;
			this.name = name;
			this.annual_income = annual_income;
		}
		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAnnual_income() {
			return annual_income;
		}
		public void setAnnual_income(double annual_income) {
			this.annual_income = annual_income;
		}
		public double getIncome_tax() {
			return income_tax;
		}
		public void setIncome_tax(double income_tax) {
			this.income_tax = income_tax;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.emp_id+" "+this.name+" "+this.annual_income+" "+this.income_tax;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(annual_income);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + emp_id;
			temp = Double.doubleToLongBits(income_tax);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EmployeeVO other = (EmployeeVO) obj;
			if (Double.doubleToLongBits(annual_income) != Double.doubleToLongBits(other.annual_income))
				return false;
			if (emp_id != other.emp_id)
				return false;
			if (Double.doubleToLongBits(income_tax) != Double.doubleToLongBits(other.income_tax))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
	}



