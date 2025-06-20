package Mode;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private int id;
    public String name;
    public String branch;
    
    
    public int getId() {return id;}
	public void setId(int id) {
		 this.id=id;
	}
	
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getBranch() {return branch;}
	public void setEmail(String branch) {
		this.branch = branch;
	}

    
}
