package iter;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the world in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		Iterator iter = bookShelf.iterator();
		while (iter.hasNext()) {
			Book book = (Book)iter.next();
			System.out.println(book.getName());
		}
	}
}
