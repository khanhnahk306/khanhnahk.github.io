import java.util.Comparator;

public class SortByFullName implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2){
        if (stu1.getFullName() == stu2.getFullName()){
            return String.valueOf(stu2.getAge()).compareTo(String.valueOf(stu1.getAge()));
        }
        return stu1.getFullName().compareTo(stu2.getFullName());
    }
}
