package home.thend.springfeature.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
	
	private long id;
    private String content;
    private String name;
    
    public Greeting() {
	}

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
    	return "Greeting : " + id + " " + content + " " + name;
    }
    
}
