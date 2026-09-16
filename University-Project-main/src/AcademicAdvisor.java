public class AcademicAdvisor {
    private String advisor;
    private String department;
    private int assignedStudent;
    private boolean isActive;


    public void setAssignedStudent(int count) throws InvalidAdvisingLoadException{
        if(count<1||count>50){
            throw new InvalidAdvisingLoadException("Assigned students count("+count+") must be between1to50");
        }

        this.assignedStudent = count;
    }

    public AcademicAdvisor(String advisor, String department, int assignedStudent) throws InvalidAdvisingLoadException{
        this.advisor=advisor;
        this.department=department;
        setAssignedStudent(assignedStudent);
        this.isActive=true;


    }

    public String getAdvisor() {
        return advisor;
    }

    public String getDepartment() {
        return department;
    }

    public int getAssignedStudent() {
        return assignedStudent;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active){
        this.isActive=active;
    }
}
