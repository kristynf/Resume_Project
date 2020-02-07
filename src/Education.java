public class Education {
    private String degreeType;
    private String universityName;
    private int gradYear;

    public Education(){

    }

    public Education(String degreeType,String universityName,int gradYear){
        this.degreeType=degreeType;
        this.universityName=universityName;
        this.gradYear=gradYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}





   /*
   At least 1
   degree type (Associate's, Bachelor's, Master's, PhD, etc.),
            major,
                 university name,
                 graduation year,*/