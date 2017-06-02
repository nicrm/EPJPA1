/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa1.facade;

import com.mycompany.jpa1.entities.Project;
import com.mycompany.jpa1.entities.ProjectUser;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Nicolai
 */
public class Facade {
    EntityManagerFactory emf;
    
    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public void createUser() {
        EntityManager em = emf.createEntityManager();
        
        ProjectUser projectUser = new ProjectUser();
        projectUser.setName("Lucas");
        projectUser.setDescription("Cool guy");
        projectUser.setCreated(new Date().toString());
        projectUser.setLastModified(new Date().toString());
        
        em.getTransaction().begin();
        em.persist(projectUser);
        em.getTransaction().commit();
        em.close();
    }
    
    public ProjectUser findUser(Integer userId) {
        EntityManager em = emf.createEntityManager();
        ProjectUser projectUser = em.find(ProjectUser.class, userId);
        em.close();
        
        return projectUser;
    }
    
    public List<ProjectUser> getAllUsers() {
        EntityManager em = emf.createEntityManager();
        List<ProjectUser> projectUsers = em.createQuery("SELECT * FROM PROJECTUSER").getResultList();
        em.close();
        
        return projectUsers;
    }
    
    public void createProject() {
        EntityManager em = emf.createEntityManager();
        
        Project project = new Project();
        project.setUserName("Lucas");
        project.setEmail("lucas.m.fredmark@gmail.com");
        project.setCreated(new Date().toString());
        
        em.getTransaction().begin();
        em.persist(project);
        em.getTransaction().commit();
        em.close();
    }
}
