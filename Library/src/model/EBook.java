package model;

public class EBook extends ListBook {
    private int capacity;
    private int num_download;

    public EBook(String id, String name, String description, String author, String category, int pub_year, String pub_company, int capacity, int num_download) {
        super(id, name, description, author, category, pub_year, pub_company);
        this.capacity = capacity;
        this.num_download = num_download;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNum_download() {
        return num_download;
    }

    public void setNum_download(int num_download) {
        this.num_download = num_download;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity=" + capacity + ", numberofdownload=" + num_download + '}';
    }
}
