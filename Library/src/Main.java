import model.EBook;
import model.TextBook;
import repository.BookRepository;
import service.BookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();

        BookService<TextBook> textBookBookService = new BookService<>();
        ArrayList<TextBook> textBooks = bookRepository.getAllTextBook();

        BookService<EBook> eBookBookService = new BookService<>();
        ArrayList<EBook> eBooks = bookRepository.getAllEBook();

        System.out.println("Danh sách ban đầu: ");
        textBookBookService.show(textBooks);

        TextBook newTextBook = new TextBook("TB4", "SGK Lớp 4", "SGK Lớp 4", "BGD&ĐT", "Sách giáo khoa", 2018, "NXB Giáo dục", 100, 1000);
        textBookBookService.add(textBooks, newTextBook);
        System.out.println("Danh sách sau khi thêm: ");
        textBookBookService.show(textBooks);

        TextBook findTextBookByName = textBookBookService.get_book_by_name(textBooks, "SGK Lớp 1");
        System.out.println("Sách cần tìm: ");
        System.out.println(findTextBookByName);

        EBook findEBookByID = eBookBookService.get_book_by_id(eBooks, "EB3");
        System.out.println("Sách cần tìm: ");
        System.out.println(findEBookByID);

        eBookBookService.remove(eBooks, findEBookByID);
        System.out.println("Danh sách sau khi xóa: ");
        eBookBookService.show(eBooks);

        TextBook updateTextBook = textBookBookService.update_textbook(textBooks, "TB1");
        System.out.println("Danh sách sau khi update: ");
        textBookBookService.show(textBooks);

        EBook updateEBook = eBookBookService.update_ebook(eBooks, "EB2");
        System.out.println("Danh sách sau khi update: ");
        eBookBookService.show(eBooks);
    }
}
