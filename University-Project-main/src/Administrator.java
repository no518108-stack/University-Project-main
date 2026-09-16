public class Administrator extends UniversityEmployee implements Evaluatable{
    private double overtime;
    public Administrator(String employeeId,String fullName,double baseSalary, double overtime){
        super(employeeId,fullName,baseSalary);
        this.overtime=overtime;

    }
    @Override
    public  double calculateMonthlySalary(){
        return  getBaseSalary()+(overtime*45);
    }
    @Override
    public void conductDuties(){
        System.out.println("Administrator " + getFullName() + " is managing department operations and schedules.");
    }
    @Override
    public void evaluateperformance(double score){
        if (score<0||score>100){
            throw new IllegalArgumentException("Score must be between 0 t0 100.");
        }
        System.out.println("Professor"+getFullName()+"evaluate with performance score:"+score);


    }
}
