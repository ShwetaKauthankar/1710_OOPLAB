
public class ContractTeacher extends TeachingStaff implements DailyWage,Schedule{

	@Override
	public void wage() {
		System.out.println("Calculate Wages");
	}

	@Override
	public void calculatePay() {
		System.out.println("Calculate Pay");
		
	}

	@Override
	public void calculateSalary() {
		System.out.println("Calculate Salary");
		wage();
		calculatePay();
	}
	
	
	

}
