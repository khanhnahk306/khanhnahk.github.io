package repository;

import model.EBook;
import model.TextBook;

import java.util.ArrayList;

public class BookRepository {
    public ArrayList<TextBook> getAllTextBook() {
        ArrayList<TextBook> list = new ArrayList<>();
        list.add(new TextBook("TB1", "SGK Lớp 1", "SGK Lớp 1", "BGD&ĐT", "Sách giáo khoa", 2018, "NXB Giáo dục", 100, 1000));
        list.add(new TextBook("TB2", "SGK Lớp 2", "SGK Lớp 2", "BGD&ĐT", "Sách giáo khoa", 2018, "NXB Giáo dục", 100, 1000));
        list.add(new TextBook("TB3", "SGK Lớp 3", "SGK Lớp 3", "BGD&ĐT", "Sách giáo khoa", 2018, "NXB Giáo dục", 100, 1000));
        return list;
    }

    public ArrayList<EBook> getAllEBook() {
        ArrayList<EBook> list = new ArrayList<>();
        list.add(new EBook("EB1", "Đề Kiểm Tra Trắc Nghiệm Toán 12", "Đề Kiểm Tra Trắc Nghiệm Toán 12", "Phạm Quốc Phong", "Toán học", 2019, "NXB Đại học quốc gia", 1500, 1000));
        list.add(new EBook("EB2", "500 Bài Toán Chọn Lọc 12", "500 Bài Toán Chọn Lọc 12", "Ngô Long Hậu", "Toán học", 2018, "NXB Đại học quốc gia", 2000, 2000));
        list.add(new EBook("EB3", "Bất Đẳng Thức Và Bài Toán Min – Max", "Bất Đẳng Thức Và Bài Toán Min – Max", "Nguyễn Phú Khánh", "Toán học", 2020, "NXB Đại học sư phạm", 3000, 5000));
        return list;
    }
}
