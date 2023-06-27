import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){
        List<Instructor> instructors = new ArrayList<>();

        // Instructor 1
        String[] courses1 = {"Mathematics", "Physics"};
        Instructor instructor1 = new Instructor("John Doe", 10, "Professor", "Male", true, Arrays.asList(courses1));
        instructors.add(instructor1);

        // Instructor 2
        String[] courses2 = {"English Literature", "Creative Writing"};
        Instructor instructor2 = new Instructor("Jane Smith", 5, "Assistant Professor", "Female", true, Arrays.asList(courses2));
        instructors.add(instructor2);

        // Instructor 3
        String[] courses3 = {"Computer Science", "Data Structures", "Algorithms"};
        Instructor instructor3 = new Instructor("David Johnson", 8, "Associate Professor", "Male", true, Arrays.asList(courses3));
        instructors.add(instructor3);

        // Instructor 4
        String[] courses4 = {"History", "Political Science"};
        Instructor instructor4 = new Instructor("Sarah Thompson", 6, "Lecturer", "Female", false, Arrays.asList(courses4));
        instructors.add(instructor4);

        // Instructor 5
        String[] courses5 = {"Chemistry", "Biology"};
        Instructor instructor5 = new Instructor("Michael Davis", 6, "Professor", "Male", true, Arrays.asList(courses5));
        instructors.add(instructor5);

        return instructors;
    }
}
