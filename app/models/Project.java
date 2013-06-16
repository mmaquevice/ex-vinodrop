package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.db.ebean.Model;

@Entity
public class Project extends Model {

	private static final long serialVersionUID = 4225515181992827769L;

	@Id
	public Long id;
	public String name;
	public String folder;

	@ManyToMany(cascade = CascadeType.REMOVE)
	public List<User> members = new ArrayList<User>();

	public Project(String name, String folder, User owner) {
		this.name = name;
		this.folder = folder;
		this.members.add(owner);
	}

	public static Model.Finder<Long, Project> find = new Model.Finder<Long, Project>(Long.class, Project.class);

	public static Project create(String name, String folder, String owner) {
		Project project = new Project(name, folder, User.find.ref(owner));
		project.save();
		project.saveManyToManyAssociations("members");
		return project;
	}

	public static List<Project> findInvolving(String user) {
		return find.where().eq("members.email", user).findList();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

}