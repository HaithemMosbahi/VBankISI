/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.isi.managedbeans;

import com.bank.isi.domain.Person;
import com.bank.isi.sessionbeans.PersonFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Toshiba
 */
@Named(value = "testManagedBean")
@SessionScoped
public class TestManagedBean implements Serializable {
    @EJB
    private PersonFacade personFacade;
    
    private String msg;
    private List<Person> allPerson;
    
    

    /**
     * Creates a new instance of TestManagedBean
     */
    public TestManagedBean() {
        msg="hello from the server";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void doAction()
    {
        msg="hello from the server";
       
    }

    public List<Person> getAllPerson() {
        return personFacade.findAll();
    }

    public void setAllPerson(List<Person> allPerson) {
        this.allPerson = allPerson;
    }
    
    
}
