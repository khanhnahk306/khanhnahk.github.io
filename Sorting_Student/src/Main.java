import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nguyễn Văn Bảo Khanh", 24, 10));
        studentList.add(new Student("Ngô Công Tuyền", 26, 9));
        studentList.add(new Student("Nguyễn Văn Bảo Khanh", 26, 8));
        studentList.add(new Student("Vũ Xuân Thắng", 27, 7));

        Collections.sort(studentList, new SortByFullName());
        System.out.println(studentList);

        Collections.sort(studentList, new SortByAge());
        System.out.println(studentList);

        Collections.sort(studentList, new SortByName());
        System.out.println(studentList);
    }

}