package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Task {

//	private Integer id; // Id of the task
	private String name; // Name of the task
	private boolean state; // If it's true, the task is completed, otherwise it's false
	private String description; // Description of the task
	private Date dueDate; // Due date of the task

	// Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public Integer getId() {
//		return id;
//	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	// Actions
	public void addTask() {
		Scanner sc = new Scanner(System.in);
		String name, descr;
		Date dueDateTask = null;
		System.out.println("Enter the name of the task:");
		name = sc.nextLine();
		System.out.println("Enter the task description:");
		descr = sc.nextLine();

		System.out.println("Enter the due date of the task: (dd-MM-yyyy)");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

		String dateInString = sc.nextLine();

		try {
			dueDateTask = formatter.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		this.setName(name);
		this.setDescription(descr);
			this.setDueDate(dueDateTask);
	}

	@Override
	public String toString() {
		return "Task "+"\n" +"[name=" + name + "\n" + "description=" + description + "\n" +"dueDate=" + dueDate + "]";
	}
	
}
