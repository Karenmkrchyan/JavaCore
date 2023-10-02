package classwork.library;

public class BookStorage {
    public Book[] books = new Book[10];
    private int size;


    public void add(Book book) {
        if (size == books.length) {
            extent();
        }
        books[size++] = book;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " + books[i].getPrice() + " " + books[i].getCount());

        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)
                    || books[i].getAuthorName().contains(keyword)) {

                System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " + books[i].getPrice() + " " + books[i].getCount());
            }
        }
    }

    private void extent() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }
}

