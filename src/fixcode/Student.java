package fixcode;

/**
 * A student model with id and name. (name is managed by Person class) 
 * @author Vittunyuta Maeprasart
 *
 */
public class Student extends Person {
	/** This student's id */
	private long id;
	
	/**
	 * Initialize a new Student object
	 * @param name of student
	 * @param id of student
	 */
	public Student(String name, long id) {
		super(name);
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student.
	 *@return a string consist Student, its name and its id.
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare students by name and id
	 * They are equal if both of the name and id match.
	 * @param obj is other student
	 * @return true if name and id are same, false otherwise.
	 * 
	 */
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		Student other = (Student) obj;
		if (this.name.equalsIgnoreCase(other.name) && (this.id == other.id)) return true;
		return false;
	}

	/**
	 * Get student's id
	 * @return student's id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Set student's id
	 * @param id of the student
	 */
	public void setId(long id) {
		this.id = id;
	}

	
}
