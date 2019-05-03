import java.util.*;

public class Labor4 {
    public static void main(String[] args) {
        Student[] list = new Student[6];
        list[0] = new Student("Ivan", 19, 2, 92, true);
        list[1] = new Student("Volodymyr", 25, 3, 61.6, false);
        list[2] = new Student("Ignat", 17, 1, 88.7, false);
        list[3] = new Student("Mikilangelo", 21, 2, 76.6, false);
        list[4] = new Student("Vasyl", 22, 3, 60.4, false);
        list[5] = new Student("Artem", 45, 1, 99.5, true);

        for (Student st : list) {
            System.out.println(st);
        }
        Arrays.sort(list, Comparator.comparing(Student::getName));
        System.out.println("\nСортування за ім'ям:");
        for (Student st : list) {
            System.out.println(st);
        }

        Arrays.sort(list, Comparator.comparing(Student::getStypendia).reversed());
        System.out.println("\nЗворотнє сортування за наявністю стипендії");
        for (Student st : list) {
            System.out.println(st);
        }
    }
}
