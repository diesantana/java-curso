package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime postDate = LocalDateTime.parse("21/06/2018 13:05:44", formatDate);
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		Integer likes = 12;
		
		Post post1 = new Post(postDate, title, content, likes);
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome"));
		
		postDate = LocalDateTime.parse("28/07/2018 23:14:19", formatDate);
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;

		Post post2 = new Post(postDate, title, content, likes);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the force be with you"));
		
		System.out.println(post1.getTitle());
		System.out.print(post1.getLikes() + " Likes - ");
		System.out.println(post1.getMoment().format(formatDate));
		System.out.println(post1.getContent());
		System.out.println("Comments:");
		for(Comment c : post1.getComments()) {
			System.out.println(c);
		}
		System.out.println();
		
		System.out.println(post2.getTitle());
		System.out.print(post2.getLikes() + " Likes - ");
		System.out.println(post2.getMoment().format(formatDate));
		System.out.println(post2.getContent());
		System.out.println("Comments:");
		for(Comment c : post2.getComments()) {
			System.out.println(c);
		}
		System.out.println();
		

	}

}
