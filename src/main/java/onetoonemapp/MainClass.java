package onetoonemapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/datainsert")
public class MainClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("apple");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        String pname=req.getParameter("pname");
        long phoneno=Long.parseLong(req.getParameter("pphono"));
        String email=req.getParameter("pemail");
        String houseno=req.getParameter("adhono");
        long pincode=Long.parseLong(req.getParameter("pin"));
        String city=req.getParameter("adcity");
        String area=req.getParameter("area");
        Address address=new Address();git
        address.setArea(area);
        address.setCity(city);
        address.setHousenumber(houseno);
        address.setPincode(pincode);
        em.persist(address);
        Person person=new Person();
        person.setPersonname(pname);
        person.setAddress(address);
        person.setEmail(email);
        person.setPhono(phoneno);
        em.persist(person);
        et.begin();
        et.commit();
    }
}
