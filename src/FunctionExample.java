import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(64));

        Function<String, String> lowercase = String::toLowerCase;
        System.out.println(lowercase.apply("PROGRAMMING"));

        Predicate<Instructor> onlineCourseFilter = Instructor::isOnlineCources;
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if (onlineCourseFilter.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        });

        System.out.println(mapFunction.apply(Instructors.getAll()));


        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>>
                mapBiFunction = ((instructors, instructorPredicate) -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if (instructorPredicate.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        });
        System.out.println(mapBiFunction.apply(Instructors.getAll(), onlineCourseFilter));
    }
}
