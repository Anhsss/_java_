package Test;

abstract class Person{
	
	private String pnum;
	private String name;
	private int age;
    
	public Person(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "pnum = " + pnum + " name = " + name + " age = " + age;
	}
	abstract void show(); //toString()를 호출하여 sysout으로 처리
	
    abstract void increase();//salary, scholarship, or dayPay를 10% 증가
}
 class Employee extends Person{
	private String job;
	private String dept;
	private int salary;      //10%증가
	
	public void show() {
		System.out.println(toString());
	}
	public void increase() {
		this.salary += (0.1 * salary);  
	}
	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}
	public String toString() {
		return super.toString() + " job = " + job + " dept = " + dept + " salary = " + salary;
	}
	
}
 class Designer extends Employee{
	private String language;
	private int workYear;
	private int salary2; //월급인상

	public void show() {
		System.out.println(toString());
	}
	public void increase() {
		this.salary2 += (salary2 * 0.1);
	}
	
	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language, int workYear, int n) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
		this.salary2 = n;
	}
	public String toString() {
		return super.toString() + " language = " + language + " workYear = " + workYear + " salary2 = " + salary2;
	}
 }
class Student extends Person{
	private String schoolName;
	private int schoolyear;
	private int scholarship;

	public void show() {
		System.out.println(toString() );
	}
	
	public void increase() {
		this.scholarship += (scholarship * 0.1);
	}
	
	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship ) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}
	public String toString() {
		return super.toString() + " schoolName = " + schoolName + " schoolyear = " + schoolyear + " scholarship = " + scholarship;
	}
}
class WorkStudent extends Student{
	private String job;
	private int daypay;
	private int scholarship2;   //장학금 인상

	public void show() {
		System.out.println(toString());
	}
	public void increase() {
		this.daypay += (daypay * 0.1);
		this.scholarship2 += (scholarship2 * 0.1);
	}
	
	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship, String job, int daypay, int n) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
		this.job = job;
		this.daypay = daypay;
		this.scholarship2 = n;
	}
	public String toString() {
		return super.toString() + " job = " + job + " daypay = " + daypay + " scholarship2 = " + scholarship2;
	}
}

public class TestPersons {
	static void showAll(Person[] p) {
		for(int i =0; i < p.length; i++) {
			p[i].show();
		}
	}
	static void increaseAll(Person[] p) {
		for(int i=0; i < p.length; i++) {
			p[i].increase();
		}
	}

	static void getData(Person[] p) {

		Employee e = new Employee("p01","Goo", 28, "DBMS", "Design", 2000);
		
		Designer d = new Designer("p02","Ahn", 40, "Java", "Singleton", 3000, "jsp", 20, 200);
		
       	Student s = new Student("p03","Kim", 25, "snu", 4, 300);
        
      	WorkStudent w = new WorkStudent("p04","Lee", 30, "pnu", 5, 500, "com", 1500, 640);

		p[0]= e;
		p[1]= d;
		p[2]= s;
		p[3]= w;
	}
	public static void main(String[] args) {
		
		Person [] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		System.out.println("10% increase result :");
		increaseAll(setPerson);
		showAll(setPerson);
	
	}
}
