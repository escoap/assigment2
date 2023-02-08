package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
    
    private double gpa;
    
    
    public Student(String name, short age) {
		this.name = name;
		this.age = age;
	}

    @Override
    public String getAddress() {
        return super.address; 
    }

    /**
     *
     * @param address
     */
    @Override
    public void setAddress(String address) {
        super.address = address;
    }
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
    String pr = "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address + "\n" + "GPA: " + gpa;
    return pr;
    }

}