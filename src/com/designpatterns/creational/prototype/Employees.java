package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shreekanth
 * 
 * 
 * 
 *         Prototype pattern is used when the Object creation is a costly affair
 *         and requires a lot of time and resources and you have a similar
 *         object already existing. So this pattern provides a mechanism to copy
 *         the original object to a new object and then modify it according to
 *         our needs. This pattern uses java cloning to copy the object.
 *         
 *         If you use same collection object to iterate over and modify the list
 *         then it will throw an "java.util.ConcurrentModificationException"
 * 
 * 
 */
public class Employees implements Cloneable {
	
	private List<String> empList;
    
    public Employees(){
        empList = new ArrayList<String>();
    }
     
    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }
     
    public List<String> getEmpList() {
        return empList;
    }
 
    @Override
    public Object clone() throws CloneNotSupportedException{
            List<String> temp = new ArrayList<String>();
            for(String s : this.getEmpList()){
            	temp.add(s);
            }
            return new Employees(temp);
    }

}
