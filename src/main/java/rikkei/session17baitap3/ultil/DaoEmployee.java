package rikkei.session17baitap3.ultil;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rikkei.session17baitap3.entity.Employee;

import java.util.List;


@Repository
public class DaoEmployee
{
    @Autowired
    private SessionFactory sessionFactory;
    public List<Employee> findAll(){

        Session session = sessionFactory.openSession();
        try
        {
            return session.createQuery("from Employee", Employee.class).getResultList();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
        return null;
    }

    public Employee findById(int id)
    {
        Session session = sessionFactory.openSession();
        try
        {
            return session.get(Employee.class, id);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
        return null;
    }
    public void create(Employee employee){
        Session session = sessionFactory.openSession();


        try
        {
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }


    }

    public void update(Employee employee)
{
    Session session = sessionFactory.openSession();

    try
    {
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
    }catch (Exception e){
        session.getTransaction().rollback();
        e.printStackTrace();
    }
    finally
    {
        session.close();
    }

}
    public void delete(Employee employee)
    {
        Session session = sessionFactory.openSession();

        try
        {
            session.beginTransaction();
            session.delete(employee);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }

    }

}
