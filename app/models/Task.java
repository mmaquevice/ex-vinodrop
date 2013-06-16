package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class Task extends Model {

	private static final long serialVersionUID = 4781377571624040428L;

	@Id
	public Long id;
	public String title;
	public boolean done = false;
	public Date dueDate;
	@ManyToOne
	public User assignedTo;
	public String folder;
	@ManyToOne
	public Project project;

	public static Model.Finder<Long, Task> find = new Model.Finder<Long, Task>(Long.class, Task.class);

	public static List<Task> findTodoInvolving(String user) {
		return find.fetch("project").where().eq("done", false).eq("project.members.email", user).findList();
	}

	public static Task create(Task task, Long project, String folder) {
		task.project = Project.find.ref(project);
		task.folder = folder;
		task.save();
		return task;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public User getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
