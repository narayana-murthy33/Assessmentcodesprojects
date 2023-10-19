import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Driver {
	public static void main(String[] args) {
		System.out.println("hello hibernate");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("done");
		cfg.addAnnotatedClass(User.class);
		cfg.addAnnotatedClass(Aadhar.class);
		
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Aadhar a=new Aadhar(4,9);
	    User u=new User(7,10,a);
	    
		session.beginTransaction();
	    
	    
		//session.save(u);
		User user=session.get(User.class, 1);
		System.out.println(user);
		session.getTransaction().commit();
	}
}
