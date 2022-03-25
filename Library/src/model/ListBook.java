package model;

public class ListBook {
    private String id;
    private String name;
    private String description;
    private String author;
    private String category;
    private int pub_year;
    private String pub_company;

    public ListBook(String id, String name, String description, String author, String category, int pub_year, String pub_company) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.category = category;
        this.pub_year = pub_year;
        this.pub_company = pub_company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getPub_year() {
        return pub_year;
    }

    public void setPub_year(int pub_year) {
        this.pub_year = pub_year;
    }

    public String getPub_company() {
        return pub_company;
    }

    public void setPub_company(String pub_company) {
        this.pub_company = pub_company;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", pub_year=" + pub_year +
                ", pub_company='" + pub_company + '\'';
    }
}
