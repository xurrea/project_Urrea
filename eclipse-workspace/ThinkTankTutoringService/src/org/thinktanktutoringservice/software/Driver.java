package org.thinktanktutoringservice.software;

import javax.swing.JFrame;

import org.thinktanktutoringservice.hardware.Course;
import org.thinktanktutoringservice.hardware.Department;
import org.thinktanktutoringservice.hardware.Room;
import org.thinktanktutoringservice.people.Admin;
import org.thinktanktutoringservice.people.Student;
import org.thinktanktutoringservice.people.Tutor;

public class Driver {


	// Created by Lahiru Ariyananda and Peter Hall
	
	public static void main(String[] args) {
	
		
		Admin database = new Admin();

		MasterSchedule master = database.getMasterschedule();
		Department d1 = new Department("ECE");
		Department d2 = new Department("MATH");
		Department d3 = new Department("CS");
		Student s1 = new Student(1, "Senior",d1 , "Abdalrahman Albthali", "albthali@email.arizona.edu", "1995-3-9" , "albthali" , "password");
		Student s2 = new Student(2, "Senior",d1 , "Mohammed Alkhars", "Alkhars@email.arizona.edu", "1993-4-12" , "alkhars" , "password");
		
		Student s3 = new Student(3, "Junior",d2 , "Suzanne McCalla", "McCalla@email.arizona.edu", "1994-6-2" , "McCalla" , "password");
		Student s4 = new Student(4, "Junior",d2 , "Thomas Sewell", "Sewell@email.arizona.edu", "1995-7-13" , "Sewell" , "password");
		master.getStudents().add(s4);

		Student s5 = new Student(5, "Sophomore",d3 , "Dennis Paradiso", "Dennis@email.arizona.edu", "1996-1-10" , "Dennis" , "password");
		Student s6 = new Student(5, "Sophomore",d3 , "Karen Ponce", "Karen@email.arizona.edu", "1993-10-15" , "Karen" , "password");
		Course c1 = new Course("Introduction to Programming",  175, d1);
		Course c2 = new Course("Introduction to circuits",  220, d1);
		Course c3 = new Course("Object Oriented Programming",  275, d1);
		Course c4 = new Course("Vector Calculus",  223, d2);
		Course c5 = new Course("Calculus 2",  129, d2);
		Course c6 = new Course("Differential Equations",  254, d2);
		Course c7 = new Course("Computer Programming I",  110, d3);
		Course c8 = new Course("Software Development",  210, d3);
		Course c9 = new Course("Web Programming",  337, d3);
		Tutor t1 = new Tutor(101, 15 ,"Mary Coleman", "Mary@email.arizona.edu", "1989-8-23" , "Mary" , "password");
		Tutor t2 = new Tutor(102, 15 ,"Thomas Perez", "Perez@email.arizona.edu", "1988-12-25" , "Perez" , "password");
		Tutor t3 = new Tutor(103, 15 ,"Alan Brannon", "Brannon@email.arizona.edu", "1990-9-30" , "Brannon" , "password");
		Tutor t4 = new Tutor(104, 15 ,"Anthony Crawford", "Crawford@email.arizona.edu", "1991-5-29" , "Crawford" , "password");
		Tutor t5 = new Tutor(105, 15 ,"Pamela Chee", "Chee@email.arizona.edu", "1992-6-29" , "Chee" , "password");
		Tutor t6 = new Tutor(106, 15 ,"Tiffany Chavez", "Tiffany@email.arizona.edu", "1991-10-2" , "Tiffany" , "password");
		s1.addCourse(c1);
		s1.addCourse(c2);
		s1.addCourse(c3);
		s1.addCourse(c9);
		s2.addCourse(c1);
		s2.addCourse(c2);
		s2.addCourse(c3);
		s2.addCourse(c4);
		s3.addCourse(c6);
		s3.addCourse(c5);
		s3.addCourse(c7);
		s4.addCourse(c5);
		s4.addCourse(c6);
		s5.addCourse(c4);
		s5.addCourse(c8);
		s5.addCourse(c9);
		s6.addCourse(c9);
		s6.addCourse(c8);
		s6.addCourse(c5);
		s6.addCourse(c6);
		
       // Instantiate GUI
		LoginGUI newGUI;
		StudentGUI newSTU;
		 JFrame frame = new JFrame("TabDemo");
	      
	        //Display the window.
	       frame.setSize(600, 300);
	       frame.pack();
	        frame.setVisible(true);
		newSTU = new StudentGUI(s4);
		//InitializeDatabase();
       // newGUI = new LoginGUI(master);	
         
         
	}

	

}
