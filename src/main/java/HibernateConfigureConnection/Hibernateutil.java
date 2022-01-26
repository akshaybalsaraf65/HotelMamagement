package HibernateConfigureConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
private static SessionFactory sessionfactory = null;




public static void loadsessionfactory(){
	Configuration cfg = new Configuration();
	cfg.configure("/WEB-INF/hibernate.cfg.xml");
	sessionfactory = cfg.buildSessionFactory();
}


}
