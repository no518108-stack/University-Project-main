public abstract class UniversityEmployee {

    private String employeeId;
    private String fullName;
    private double baseSalary;


    public UniversityEmployee(String employeeId,String fullName,double baseSalary){
        this.employeeId = employeeId;
        this.fullName = fullName;

        if(baseSalary<0) {
            System.out.println(" Base salary cannot be negative");
        } else
            this.baseSalary = baseSalary;
    }


    public String getEmployeeId(){
       return  employeeId ;
    }
    public String getFullName(){
        return fullName ;
    }
    public double getBaseSalary(){
        return baseSalary ;
    }


    public void displayProfile() {
        System.out.println("Employee Id = " + employeeId);
        System.out.println("FullName = " + fullName);
        System.out.println("Base Salary = " + baseSalary);
    }


    public abstract double calculateMonthlySalary();
    public abstract void conductDuties();



    }



