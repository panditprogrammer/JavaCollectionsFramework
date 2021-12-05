import java.util.Objects;

public class Student implements Comparable<Student>{
	
	@Override
	public String toString() {
		return "[name=" + name + ", roll=" + roll + "]";
	}

	private String name;
	private int roll;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return roll == other.roll;
	}
	
	
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public int compareTo(Student s) {
		
		return (this.roll - s.roll);
	}
	
	

}
