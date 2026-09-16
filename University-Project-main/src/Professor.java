public class Professor extends UniversityEmployee implements Evaluatable {
    private int publishedPapers;
    public Professor(String employeeId,String fullName,double baseSalary,int publishedPapers){
        super(employeeId,fullName,baseSalary);
        this.publishedPapers=publishedPapers;
    }
    @Override
    public double calculateMonthlySalary(){
        return getBaseSalary()+(publishedPapers*150);
    }
    @Override
    public void conductDuties() {
        System.out.println("Professor" + getFullName() + "is conducting research and teaching lectures.");
    }
    @Override
    public void evaluateperformance(double score){
        if(score<0||score>100){
            throw new IllegalArgumentException("Score must be between 0 t0 100.");

        }
        System.out.println("Professor"+getFullName()+"evaluate with performance score:"+score);
    }
}
