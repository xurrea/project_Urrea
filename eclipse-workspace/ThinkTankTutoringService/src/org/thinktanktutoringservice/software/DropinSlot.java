package org.thinktanktutoringservice.software;
import org.thinktanktutoringservice.hardware.*;
import org.thinktanktutoringservice.people.*;
import java.util.ArrayList;

import org.thinktanktutoringservice.people.Tutor;
import java.io.Serializable;
public class DropinSlot extends Slot implements Serializable{

	private ArrayList<Course>courses;
	private ArrayList<Tutor>tutors;
	public DropinSlot() {
		
		courses = new ArrayList<Course>();
		tutors = new ArrayList<Tutor>();
	}
	public DropinSlot(String time, Room room) {
		super(time, room);
		courses = new ArrayList<Course>();
		tutors = new ArrayList<Tutor>();
	}
	
	public void addCourse(Course newCourse) {
		if (!courses.contains(newCourse))
			courses.add(newCourse);
		else 
			System.out.println("Course already in exist.");
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void addTutor(Tutor newTutor) {
		if (!tutors.contains(newTutor))
			tutors.add(newTutor);
		else
			System.out.println("Tutor already exist.");
	}
	
	public ArrayList<Tutor> getTutors() {
		return tutors;
	}
}