package MindGame;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class examStream {

	public static void main(String[] args) {
//		List<Book> books = Arrays.asList(new Book("ABook_1", 20.0),
//				                         new Book("ABook_1", 30.0),
//				                         new Book("Book_3", 10.0)
//				                         );
		
//		List<Integer> ls = Arrays.asList(11,20,20,30,40,40,50);
//		ls.stream()
//		.distinct()
//		.forEach(System.out::println);
//		
		
		//Price
//		double expensiveBook = books.stream()
//				.filter(book -> book.getPrice()>30)
//				.mapToDouble(Book::getPrice)
//				.average()
//				.orElse(0.0);
//		System.out.println(expensiveBook);
		//Title
//		 books.stream()
//				.map(Book::getTitle)
//				.filter(book ->book.startsWith("A"))
//				.forEach(System.out::println);
		
//		books.stream()
//		.map(Book::getTitle)
//		.filter(book -> book.startsWith("A"))
//		.forEach(System.out::println);
		
		
//		books.stream()
//		.map(Book::getPrice)
//		.forEach(System.out::println);
		
//		Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); //1 
//		//Stream<Integer> strm2 = strm1.filter(i->{ return i>5 && i<15; });  //2
//		Stream<Integer> strm2 = strm1.parallel().filter(i->i>5).filter(i->i<15).sequential();
//		strm2.forEach(System.out::print); //3
//		List<Integer> ls = Arrays.asList(1, 2, 3);
//		Function<Integer, Integer> func = a->a*a;
//		ls.stream().map(func).peek(System.out::print);
		
//		double averagePrice = books.stream().filter(b->b.getPrice()>10)         
//				.mapToDouble(b->b.getPrice())         
//				.average().getAsDouble();
//		System.out.println(averagePrice);  
		
//
//		IntStream is1 = IntStream.range(0, 5); //1 - 0 1 2 3 4  
//		OptionalDouble x = is1.average(); //2 
//		System.out.println(x); //3
		
//		
//		List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
//		ls.stream().distinct().anyMatch(x->x==11);
		
//		List<Book> books = Arrays.asList(
//				new Book("Gone with the wind", 5.0),
//				new Book("Gone with the wind", 10.0),
//				new Book("Atlas Shrugged", 15.0) );
//		books.stream()
//		.collect(Collectors.toMap((b->b.getTitle()),b->b.getPrice()))                         
//		.forEach((a, b)->System.out.println(a+" "+b));
		
		   Stream<List<String>> s1 = Stream.of(
				   Arrays.asList("a", "b"),
				   Arrays.asList("a", "c")
				   );     
		   Stream<String> news = s1.filter(s->s.contains("c"))
				   .flatMap(olds -> olds.stream());
		   news.forEach(System.out::print); }
		
	}

	
	
	class Book{
		private String title;
		private double price;
		
		public Book(String title, double price) {
			super();
			this.title = title;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}


		public double getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", price=" + price + "]";
		}
		
		
	}


