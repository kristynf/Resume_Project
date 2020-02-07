import java.util.ArrayList;

public class Skills {
    private String skillName;
    private String skillProficiency;

    public ArrayList<String> skills = new ArrayList<>();

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
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
}

