import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        BiConsumer<String, String> biConsumer =
                (name, gender) -> System.out.println(name + "is a " + gender );

        instructors.forEach(instructor -> {
            biConsumer.accept(instructor.getName(), instructor.getGender());
        });
    }
}
