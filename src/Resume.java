public class Resume {
    private String name;
    private String emailAddress;
    private String degreeType;
    private String universityName;
    private String major;
    private int gradYear;
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;
    private String skillName;
    private String skillProficiency;
//default constructor
    public Resume() {
//overloaded constructor
    }

    public Resume(String name, String emailAddress, String degreeType, String universityName, String major, int gradYear, String company,
                  String jobTitle, String startDate, String endDate, String description, String skillName, String skillProficiency) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.degreeType = degreeType;
        this.universityName = universityName;
        this.major = major;
        this.gradYear = gradYear;
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.skillName = skillName;
        this.skillProficiency = skillProficiency;
    }
//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillProficiency() {
        return skillProficiency;
    }


    public void setSkillProficiency(String skillProficiency) {
        this.skillProficiency = skillProficiency;
    }
//code to display the resume (hope it works!)
    public String getDisplayResume() {
        return "++--++--++--++--++--++--++--++--++--++--++--++--++--++--++--++"
                + getName() + "\n"
                + getEmailAddress() + "\n " +
                "\n" +
                "EDUCATION" +
                "\n"
                + getDegreeType() + " in " + getMajor() +
                "\n"
                + getUniversityName() + ", " + getGradYear() +
                "\n"
                + "WORK EXPERIENCE" +
                "\n"
                + getJobTitle() +
                "\n"
                + getCompany() + ", " + getStartDate() + " - " + getEndDate() + "\n"
                + "       " + getDescription() + "\n"
                + "SKILLS" + "\n"
                + getSkillName() + ", " + getSkillProficiency() + "\n"
                + getSkillName() + ", " + getSkillProficiency() + "\n"
                + getSkillName() + ", " + getSkillProficiency() + "\n";


    }

}


