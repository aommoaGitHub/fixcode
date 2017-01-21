package fixcode;

/**
 * A simple model for a person with a name.
 * 
 * @author Vittunyuta Maeprasart
 */
public class Person {
	/** The person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 * @param name of that person
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Get the person's name.
	 * @return name of person
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * Set or change the person's name.
	 * @param name for setting or changing
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		Person other = (Person) obj;
		if( name.equalsIgnoreCase(other.getName())) return true;
		return false;
	}
	
	/**
	 * Get a string representation of this Person.
	 * @return a string consist "Person " and its name.
	 */
	public String toString() {
		return "Person " + name;
	}
}
