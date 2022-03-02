import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("TB001", "Thất Tình Không Sao", "Nguyễn Ngọc Thạch", "Short story","NXB Giáo dục", 2020);
        listBook[1] = new Book("TB002", "Cho Tôi Xin Một Vé Đi Tuổi Thơ", "Nguyễn Nhật Ánh", "Novel","NXB Trẻ", 2018);
        listBook[2] = new Book("TB003", "Hôm Nay Tôi Thất Tình", "Hạ Vũ", "Diary","NXB Hà Nội", 2019);
        listBook[3] = new Book("TB004", "Duyên Phận Ý Trời Hay Tại Lòng Người", "Tuệ Nhi", "Short story","NXB Hà Nội", 2022);
        listBook[4] = new Book("TB005", "Bức Xúc Không Làm Ta Vô Can", "Đặng Hoàng Giang", "Short story","NXB Nhã Nam", 2022);

        System.out.println("Sách có tên cho tôi xin một vé đi tuổi thơ");
        for ( int i =0; i<listBook.length; i++){
            if (listBook[i].name.equals("Cho Tôi Xin Một Vé Đi Tuổi Thơ")){
                System.out.println(listBook[i]);
            }
        }

        System.out.println("Sách có thể loại short story");
        for ( int i =0; i<listBook.length; i++){
            if (listBook[i].category.equals("Short story")){
                System.out.println(listBook[i]);
            }
        }

        System.out.println("Sách xuất bản trong năm nay");
        for ( int i =0; i<listBook.length; i++){
            if (listBook[i].year == 2022){
                System.out.println(listBook[i]);
            }
        }
    }
}
