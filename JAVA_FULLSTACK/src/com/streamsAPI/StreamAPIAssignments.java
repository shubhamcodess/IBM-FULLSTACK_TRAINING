package com.streamsAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

 class Fruit {
	public String name; 
	public int calories; 
	public int price; 
	public String color;

	public Fruit() {
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
}

 
 class News {
		public int newsId,count; 
		public String postedByUser; 
		public String commentByUser; 
		public String comment;
		
		public News() {}
		
		public News(int newsId, String postedByUser, String commentByUser, String comment) {
			super();
			this.newsId = newsId;
			this.postedByUser = postedByUser;
			this.commentByUser = commentByUser;
			this.comment = comment;
			
		}

		public int getNewsId() {
			return newsId;
		}

		public void setNewsId(int newsId) {
			this.newsId = newsId;
		}

		public String getPostedByUser() {
			return postedByUser;
		}

		public void setPostedByUser(String postedByUser) {
			this.postedByUser = postedByUser;
		}

		public String getCommentByUser() {
			return commentByUser;
		}

		public void setCommentByUser(String commentByUser) {
			this.commentByUser = commentByUser;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	
		@Override
		public String toString() {
			return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
					+ ", comment=" + comment + "]";
		}
		
	}
 
 
 class Trader {
		public String name; 
		public String city;
		public Trader() {}
		public Trader(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Trader [name=" + name + ", city=" + city + "]";
		}
		
	}
 
 class Transaction {

		public Trader trader; 
		public int year; 
		public int value;
		
		public Transaction() { }

		public Transaction(Trader trader, int year, int value) {
			super();
			this.trader = trader;
			this.year = year;
			this.value = value;
		}

		public Trader getTrader() {
			return trader;
		}

		public void setTrader(Trader trader) {
			this.trader = trader;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
		}

	}


 class TestData {
	//static 
	//static List<News> newsList = new ArrayList<News>();
	//static 
	public static List<Fruit> getAllFruits() {
		 List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good budget article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
}

public class StreamAPIAssignments {

	public static void main(String[] args) {
		//System.out.println("In Main");
		
		TestData.getAllFruits().stream().filter((f)->f.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories)).forEach(System.out::println);  // 1
		
		System.out.println("--------------------------------------------------");
		
		Map<String, List<Fruit>> f=TestData.getAllFruits().stream().collect(Collectors.groupingBy(Fruit::getColor));  //2
		System.out.println(f);
		
		System.out.println("--------------------------------------------------");
		
		TestData.getAllFruits().stream().filter((f1)->f1.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);  //3
		
		System.out.println("--------------------------------------------------");
		
	
		Map<Integer,List<News>> news =TestData.getAllNews().stream().collect(Collectors.groupingBy(News::getNewsId));
		Integer maxV=news.entrySet().stream().max(Comparator.comparingInt(entry->entry.getValue().size())).map(Map.Entry::getKey).orElse(null);   //4
		System.out.println("News Id with Max Comment : "+maxV);
		
		System.out.println("--------------------------------------------------");
		
		Map<String, List<News>> n=TestData.getAllNews().stream().collect((Collectors.groupingBy(News::getComment)));
		
		long c=	n.entrySet().stream().filter( (entry) -> entry.getValue().toString().contains("budget")).count();  //5
		System.out.println("Tottal count of budget word : "+c);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println(TestData.getAllNews().stream().collect(groupingBy(News::getCommentByUser,counting()))    )  ;        //6
		
		System.out.println("--------------------------------------------------");
		
		TestData.getAllTransactions().stream().filter((t)->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);   //7
		
		System.out.println("--------------------------------------------------");
		
		//Transaction transactions;
		List<String> traderCities =
				TestData.getAllTransactions().stream().
				map((Transaction transaction)->transaction.getTrader().getCity()).
				distinct().
				collect(toList());
				System.out.println("\n\n\nTraders work in cities: " + traderCities);
		
		
		
			

	}

}
