package Library;

public abstract class Document {
 private static String id;  
 String title; 
 String author; 
 String publisher; 
 String publicationDate; 
 
 public Document(String id, String title,String author, String publisher, String publicationDate)
 {
	 Document.setId(id); 
	 this.title = title; 
	 this.author = author; 
	 this.publisher = publisher; 
	 this.publicationDate = publicationDate; 
	 
 }

public static String getId() {
	return id;
}

public static void setId(String id) {
	Document.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public String getPublicationDate() {
	return publicationDate;
}

public void setPublicationDate(String publicationDate) {
	this.publicationDate = publicationDate;
}
 

}
