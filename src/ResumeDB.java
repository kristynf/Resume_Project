import java.util.ArrayList;

public class ResumeDB {


    private ArrayList<Resume> ResumeArrayList;

    public ResumeDB(ArrayList<Resume> ResumeDBArrayList) {
        this.ResumeArrayList = ResumeDBArrayList;
    }


    Resume a = new Resume();


    //resume database..where new resumes will be stored
    public ResumeDB() {
        ArrayList<Resume> resume = new ArrayList<Resume>();
    }
    public ResumeDB (String name){
        ResumeDB database = new ResumeDB();
        database.resumeReturn(name);
    }

    public void welcome() {
        System.out.println("-------Welcome to Kristyn's Resume Generator-------");
        System.out.println("Enter your information as prompted and a spiffy new resume will be generated");
    }//array list getter

    public ArrayList<Resume> getResumeArrayList() {
        return ResumeArrayList;
    }

    //array list setter
    public void setResumeArrayList(ArrayList<Resume> ResumeArrayList) {
        this.ResumeArrayList = ResumeArrayList;
    }

    public void resumeReturn(String name) {
        String resumeReturn = "";
        for (int i = 0; i < getResumeArrayList().size(); i++) {

            if (name.equals(getResumeArrayList().get(i).getName())) {
                resumeReturn = getResumeArrayList().get(i).getDisplayResume();
                break;//break statement necessary or it will just go right to else

            } else {
                resumeReturn = "No resume found";
            }

        }
        System.out.println(resumeReturn);
    }


}
