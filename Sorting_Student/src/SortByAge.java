import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2){
        if (stu1.getAge() == stu2.getAge()){
            return String.valueOf(stu2.getGPA()).compareTo(String.valueOf(stu1.getAge()));
        }
        return String.valueOf(stu1.getAge()).compareTo(String.valueOf(stu2.getAge()));
    }
}
