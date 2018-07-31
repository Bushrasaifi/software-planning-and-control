package DAOimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.DAOdemo;
import Pojo.assign;
import Pojo.contact;
import Pojo.employee;
import Pojo.manager;
import Pojo.projects;
import Pojo.reports;
import Pojo.review;
import Pojo.user;
import Util.HibernateUtil;


public class daoImple implements DAOdemo {

	@Override
	public <K> boolean saveData(K obj) {
		// TODO Auto-generated method stub
		boolean status=false;
		Session session=HibernateUtil.getSessionFac().openSession();
		try{
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		status=true;
		}catch (Exception e) {
			// TODO: handle exception
			session.getTransaction().rollback();
			status=false;
		}
		finally {
			session.close();
		}
		return status;
		
	}

	@Override
	public boolean verify(manager ma) {
		// TODO Auto-generated method stub
		
		String a=ma.getMpass();
		if(a.matches("123"))
		{    
			//System.out.println("inside");
			return true;
		}
	
		return false;
	}

	
	@Override
	public boolean getById(employee ob) {
		// TODO Auto-generated method stub
		
		boolean status=false;
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From employee where Empid=?";
		Query query = session.createQuery(hql);
		query.setParameter(1, ob.getEmpid());
		List results = query.list();
		
		
		return status;
		
	}
	
	
	@Override
	public int deleteById(employee ob) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = " Delete From employee where Empid=?";
		Query query = session.createQuery(hql);
		
		query.setParameter(0, ob.getEmpid());
		int result=query.executeUpdate();

		if(result==1)
		return 1;
		else
			return 0;
	}

	@Override
	public List getAll(employee ob) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From employee";
		Query query = session.createQuery(hql);
		List<employee> results = query.list();
		return results;
		
	}
	
	
	
	@Override
	public int updateData(employee ob) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "UPDATE employee SET Ename=?,Eemail=?,Epassword=?,Eaddress=?,Egender=?,Eage=?,Equalification=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, ob.getEname());
		query.setParameter(1, ob.getEemail());
		query.setParameter(2, ob.getEpassword());
		query.setParameter(3, ob.getEaddress());
		
		query.setParameter(4, ob.getEage());
		query.setParameter(5, ob.getEQualification());
		int result=query.executeUpdate();
		if(result==1)
			return 1;
		else
		    return 0;
		
	}

	@Override
	public int CheckId(user ob) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "FROM user as u where u.uUsername=?";		
		Query query = session.createQuery(hql);
		query.setParameter(0, ob.getuUsername());
	List<user> result=query.list();
	if(result!=null && result.size()>0)
		return 1;
	else
	    return 0;
		
	}

	@Override
	public List getimg(assign as) {
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "FROM assign";
		Query query = session.createQuery(hql);
		List results = query.list();
		return results;
	}

	@Override
	public List getAllReview(review re) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "FROM review";
		Query query = session.createQuery(hql);
		List results = query.list();
		return results;
		
		
	}

	@Override
	public List<projects> getProjectsDetails(projects p) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "FROM projects";
		Query query = session.createQuery(hql);
		List<projects> results = query.list();
		return results;
		
	}

	@Override
	public int CheckIdEmp(employee ob) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "FROM employee as u where u.Ename=? and u.Epassword=?";		
		Query query = session.createQuery(hql);
		query.setParameter(0, ob.getEname());
		query.setParameter(1, ob.getEpassword());
		
	List<employee> result=query.list();
	if(result!=null && result.size()>0)
		return 1;
	else
	    return 0;
		
		
		
		
	}

	@Override
	public List<contact> getAllContact(contact ob) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From contact";
		Query query = session.createQuery(hql);
		List<contact> results = query.list();
		return results;
		
	}

	@Override
	public int deleteFrmAssign(assign as) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		session.beginTransaction();
		String hql = " Delete From assign where aid=?";
		Query query = session.createQuery(hql);
		
		query.setParameter(0, as.getAid());
		int result=query.executeUpdate();
		 session.getTransaction().commit();
		if(result==1)
		return 1;
		else
			return 0;
	}

	@Override
	public List<assign> getAllAssign() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From assign";
		Query query = session.createQuery(hql);
		List<assign> results = query.list();
		return results;
		
		
	}

	
	@Override
	public List<assign> getAllAssignById(employee id) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From assign as a where a.eid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, id);
		List<assign> results = query.list();
		
		return results;
	}

	@Override
	public int getAllAssignUpdate(int aid, int eid) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		session.beginTransaction();
		
		String hql = "UPDATE assign set eid = :id1 "  + 
	             "WHERE aid = :id2";
		Query query = session.createQuery(hql);
		query.setParameter("id1",eid);
		query.setParameter("id2", aid);
		
	     int result = query.executeUpdate();
	     session.getTransaction().commit();
		if(result!=0)
			return 1;
			else
				return 0;
		
		
		
		
		
	}

	@Override
	public List<projects> getProjectsDetailsById(int pid) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From projects as a where a.pid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, pid);
		List<projects> results = query.list();
		
		return results;
		
		
		
	}

	@Override
	public List<reports> getReportsById(int pid) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFac().openSession();
		String hql = "From reports as a where a.pid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, pid);
		List<reports> results = query.list();
		
		return results;
		
	}

	
	

}

	
	

	
	
 


	

	
	


