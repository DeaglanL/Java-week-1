package Library;

import java.util.ArrayList;

public class Person {
     private String name; 
     private String address; 
     
     ArrayList<Document> collection = new ArrayList<Document>(); 

     
     public Person(String name, String address)
     {
    	 this.name = name; 
    	 this.address = address; 
     }

     
     
     

     public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void add(Document d)
     {
    	 collection.add(d);
     }
     
     public void remove(Document d)
     {
    	collection.remove(d); 
     }
     
     public Document search(String id)
     {
    	 for(Document d: collection)
    	 {
    		 if(d.getId().equals(id))
    		 {
    			 return d; 
    		 }
    	 }
    	 
		return null;
     }
}
