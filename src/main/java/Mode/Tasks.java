package Mode;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Tasks")
public class Tasks {
	
	@Id
	private String  id;
	private String taskwork;
	private String status;
	private Date lastdate;
	private String report;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTaskwork() {
		return taskwork;
	}
	public void setTaskwork(String taskwork) {
		this.taskwork = taskwork;
	}
	public Date getLastdate() {
		return lastdate;
	}
	public void setLastdate(Date date) {
		this.lastdate=date;
	}
	
}
