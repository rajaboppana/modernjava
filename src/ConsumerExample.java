import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        // Looping through all the instructors and printing out the values of instructor
        Consumer<Instructor> c1 = System.out::println;
        instructors.forEach(c1);

        //Loop through all the instructors and print their names and courses
        System.out.println("----------------------");
        Consumer<Instructor> c2 = (s1) -> print(s1.cources);
        instructors.forEach(c1.andThen(c2));

        //Loop through all the instructors and print out their name if the years of
        // experience >10
        System.out.println("----------------------");
        instructors.forEach(s1 -> {
            if (s1.yearsOfExperience == 10){
                c1.accept(s1);
            }
        });

        //Loop through all the instructors and print out their name if the years of
        // experience >5 and teaches course online
        System.out.println("----------------------");
        instructors.forEach(s1 -> {
            if (!s1.onlineCources  && s1.yearsOfExperience >5 ){
                c1.andThen(c2).accept(s1);
            }
        });

    }

    public static void print(List<String> course){
        System.out.println(course);
    }

}