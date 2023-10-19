import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	@Id
	private int id;
	private int uid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public Aadhar(int id, int uid) {
		super();
		this.id = id;
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", uid=" + uid + "]";
	}
	public Aadhar() {
		
	}

}
