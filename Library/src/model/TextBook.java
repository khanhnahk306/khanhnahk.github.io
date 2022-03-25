package model;

public class TextBook extends ListBook {
    private int page;
    private int amount;

    public TextBook(String id, String name, String description, String author, String category, int pub_year, String pub_company, int page, int amount) {
        super(id, name, description, author, category, pub_year, pub_company);
        this.page = page;
        this.amount = amount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", page=" + page + ", amount=" + amount + '}';
    }
}
