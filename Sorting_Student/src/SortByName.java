import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2){
        return stu1.getFullName().substring(stu1.getFullName().lastIndexOf(" ") + 1)
                .compareTo(stu2.getFullName().substring(stu2.getFullName().lastIndexOf(" ") + 1));
    }
}
