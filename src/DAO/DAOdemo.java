package DAO;

import java.util.List;

import Pojo.assign;
import Pojo.contact;
import Pojo.employee;
import Pojo.manager;
import Pojo.projects;
import Pojo.reports;
import Pojo.review;
import Pojo.user;

public interface DAOdemo {
	
	public <K> boolean saveData(K obj);
	public boolean verify(manager ma);
    public  int CheckId(user ob);
    public  boolean getById(employee ob);
    public int deleteById(employee ob);
    public List<employee> getAll(employee ob);
    public int updateData(employee ob);
    public List<assign> getimg(assign as);
    public List<review> getAllReview(review re);
    public List<projects> getProjectsDetails(projects p);
    public  int CheckIdEmp(employee ob);
    public List<contact> getAllContact(contact ob);
    public int deleteFrmAssign(assign as);
    public List<assign> getAllAssign();
    public int getAllAssignUpdate(int aid,int eid);
    public List<assign> getAllAssignById(employee id);
    public List<projects> getProjectsDetailsById(int pid);
    public List<reports> getReportsById(int pid);
}
