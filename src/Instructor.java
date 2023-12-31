import java.util.List;

public class Instructor {
    String name;
    int yearsOfExperience;
    String title;
    String gender;
    boolean onlineCources;
    List<String> cources;

    public Instructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCources, List<String> cources) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.title = title;
        this.gender = gender;
        this.onlineCources = onlineCources;
        this.cources = cources;
    }

    public Instructor(InstructorBuilder instructorBuilder){
        this.name = instructorBuilder.name;
        this.title = instructorBuilder.title;
        this.yearsOfExperience = instructorBuilder.yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOnlineCources() {
        return onlineCources;
    }

    public void setOnlineCources(boolean onlineCources) {
        this.onlineCources = onlineCources;
    }

    public List<String> getCources() {
        return cources;
    }

    public void setCources(List<String> cources) {
        this.cources = cources;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", onlineCources=" + onlineCources +
                ", cources=" + cources +
                '}';
    }

    public static class InstructorBuilder{

        public final String name;

        public final int yearsOfExperience;

        public String title;

        public InstructorBuilder(String name, int yearsOfExperience) {
            this.name = name;
            this.yearsOfExperience = yearsOfExperience;
        }

        public InstructorBuilder setTitle(String title){
            this.title = title;
            return this;
        }

        public Instructor build(){
            return new Instructor(this);
        }
    }
}
