import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int id;
	private int number;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", number=" + number + ", pid=" + pid + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public User(int id, int number, Aadhar pid) {
		
		this.id = id;
		this.number = number;
		this.pid = pid;
	}
	public User() {
		
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid")
	private Aadhar pid;
	public Aadhar getPid() {
		return pid;
	}
	public void setPid(Aadhar pid) {
		this.pid = pid;
	}
	

}
