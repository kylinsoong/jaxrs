package org.apache.cxf.rs.examples;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://ksoong.org", name = "Book")
public class Book {

	private String name;
    private long id;
    
    public Book() {
    }
    
    public Book(String name) {
        this.name = name;
    }
    
    public Book(String name, long id) {
        this.name = name;
        this.id = id;
    }
    
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    
    public void setId(long i) {
        id = i;
    }
    public long getId() {
        return id;
    }
}
