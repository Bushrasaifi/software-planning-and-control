package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	}
	public static SessionFactory getSessionFac()
	{
		return new Configuration().configure().buildSessionFactory();
	}

}
