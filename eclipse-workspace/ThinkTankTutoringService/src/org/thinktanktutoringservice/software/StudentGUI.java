package org.thinktanktutoringservice.software;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.thinktanktutoringservice.people.Student;

public class StudentGUI extends JFrame {
	
	   private JPanel panel;    // A panel container
	
	  
	   
	  // private JButton cancelButton;       // Performs calculation
	   private final int WINDOW_WIDTH = 400;  // Window width
	   private final int WINDOW_HEIGHT = 400; // Window height
	   private MasterSchedule masterSchedule; // should be public
	   private Student student;
	   //private String action; // true = add false = drop
	   
	
	public StudentGUI(Student student) {
		super("Hi, "+ student.getName());
		this.student = student;
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	      // Specify what happens when the close
	      // button is clicked.
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     JTabbedPane tabbedPane = new JTabbedPane();

	      // Build the panel and add it to the frame.
	      //buildPanel();

	      // Add the panel to the frame's content pane.
	      tabbedPane.addTab("Home", HomePanel());
	      tabbedPane.addTab("Drop-in Schedule", SchedulePanel());
	      tabbedPane.addTab("Apoinments", AppointmentPanel());
	      add(tabbedPane);
	      setVisible(true);
	      // Display the window.
	}
	
	 private JPanel HomePanel()
	   {
		 
		 JButton addCourseButton;       // Performs calculation
		 JButton dropCourseButton;
		   
	      // Buttons
		 addCourseButton = new JButton("Add Course");
		 dropCourseButton = new JButton("Drop Course");

	      // Add an action listener to the button.
		 addCourseButton.addActionListener(new addCourseListener());
		 dropCourseButton.addActionListener(new dropCourseListener());

	      // Create a panel to hold the components.
	      panel = new JPanel();	      
	      // Add the label, text field, and button to the panel.
	      /////// Need to align these!!!!!!
	      JPanel dummyPanel = new JPanel();
	      dummyPanel.add(addCourseButton);
	      dummyPanel.add(dropCourseButton);
	      dummyPanel.setVisible(true);

	      panel.setLayout(new BorderLayout());
	      //panel.add(addCourseButton,BorderLayout.SOUTH);
	      
	      panel.add(dummyPanel,BorderLayout.SOUTH);
	      panel.setVisible(true);
	      return panel;

	   }
	 
	 private JPanel SchedulePanel()
	 {
		 panel = new JPanel();
		 String data[][]={ {"101","Amit","670000"},    
                 {"102","Jai","780000"},    
                 {"101","Sachin","700000"}};    
		 String column[]={"ID","NAME","SALARY"};         
		 JTable jt=new JTable(data,column);    
		 jt.setBounds(30,40,200,300);          
		 JScrollPane sp=new JScrollPane(jt);
		 panel.add(jt);
		 panel.setVisible(true);
		
		return panel; 
	 }
	 
	private JPanel AppointmentPanel() {
		 panel = new JPanel();
		 
		 

		
		
		return panel;
	}
	 
	 
	 
	 private class addCourseListener implements ActionListener
	 {//
	      public void actionPerformed(ActionEvent e)
	      {
				StudentAddGUI stugui = new StudentAddGUI(student,masterSchedule,"Add");    

	      }
	  }
	 
	 private class dropCourseListener implements ActionListener
	 {//
	      public void actionPerformed(ActionEvent e)
	      {
				StudentAddGUI stugui = new StudentAddGUI(student,masterSchedule,"Drop");    

	      }
	  }
	
}


