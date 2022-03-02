public class Book {
    String Id;
    String name;
    String author;
    String category;
    String publishingCompany;
    int year;

    public Book(String id, String name, String author, String category, String publishingCompany, int year) {
        Id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.publishingCompany = publishingCompany;
        this.year = year;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Mã sách:" + Id + " " + "Tên sách:" + name + " " + "Tác giả:" + author + " " + "Thể loại:" + category + " " +"Nhà xuất bản:"+ publishingCompany + " " +"Năm xuất bản:"+ year;
    }
}
