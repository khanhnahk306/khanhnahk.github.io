package service;

import model.EBook;
import model.ListBook;
import model.TextBook;

import java.util.ArrayList;

public class BookService<B> {
    public void add(ArrayList<B> list, B book) {
        list.add(book);
    }

    public B get_book_by_name(ArrayList<? extends ListBook> list, String name) {
        for (ListBook listBook : list) {
            if (listBook.getName() == name) {
                return (B) listBook;
            }
        }
        return null;
    }

    public B get_book_by_id(ArrayList<? extends ListBook> list, String id) {
        for (ListBook listBook : list) {
            if (listBook.getId() == id) {
                return (B) listBook;
            }
        }
        return null;
    }

    public void remove(ArrayList<B> list, B book) {
        list.remove(book);
    }

    public B update_textbook(ArrayList<? extends TextBook> list, String id) {
        for (TextBook textBook : list){
            if (textBook.getId() == id){
                textBook.setAmount(10000);
            }
        }

        return null;
    }

    public B update_ebook(ArrayList<? extends EBook> list, String id) {
        for (EBook eBook : list) {
            if (eBook.getId() == id) {
                eBook.setNum_download(10000);
            }
        }
        return null;
    }

    public void show(ArrayList<B> list){
        for(B book : list){
            System.out.println(book);
        }
    }

}
