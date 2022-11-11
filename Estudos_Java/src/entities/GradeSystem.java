package entities;

public class GradeSystem {
    
    public String name;
    public double value;

    public double finalGrade(){
        return value += value;
    }
    public String toString() {
        return String.format("Final Grade = %.2f", finalGrade());
    } 
    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }     
    }
}