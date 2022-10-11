package com.ruby.java.mission;
class Person{
	private String pno;
	private String pname;
	private int age;
	public Person() {
		System.out.println("default 생성자");
		pno = null;
		pname = null;
		age = 0;
	}
	public Person(String pn) {
		this();
		pno = pn; 
	}
	public Person(String pn, String name) {
		this(pn);
		pname = name; 
	}
	public Person(String pn, String name, int a) {
		this(pn, name);
		age = a;
//		pno = pn; pname = name; age = a;
	}
	public String toString() {
		return super.toString()+"pno : " + pno + " pname : "+pname+" age : " + age;
	}
	public void show() {
		System.out.println("pno : " + pno + " pname : "+pname+" age : " + age);
	}
}
class Student extends Person{
	private String schoolName;
	private int schoolYear;
	public Student(String pn, String name, int a, String sn, int sy) {
		super(pn, name, a);
		schoolName = sn;
		schoolYear = sy;
	}
	public String toString() {
		return super.toString()+" schoolName : " + schoolName + " schoolYear : "+schoolYear;
	}
	public void show() {
		super.show();
		System.out.println(toString());
	}
}
class WorkStudent extends Student{
	private String job;
	private int salary;
//	public WorkStudent() {job = null; salary = 0;}
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		salary = pay;
		job = j;
		
	}
	public String toString() {
		return super.toString()+"salary : " + salary + " job : "+job;
	}
	public void show() {
		super.show();
		System.out.println(toString());
	}
}

public class ProcessPerson {
		static void display(Person[]p) {
			for(int i = 0; i < 6; i++)
				p[i].show();
		}
		public static void main(String[] args) {
//			WorkStudent ws = new WorkStudent();
			Person list[] = new Person[10];
			Person p = new Person();
			Person p1 = new Person("p01");
			Person p2 = new Person("p02", "Hong");
			Person p3 = new Person("p03", "Kim", 20);
			Student s1 = new Student("p04", "Lee", 40,"신라대", 5);
			WorkStudent ws = new WorkStudent("p01", "Hong", 30, "부산대", 3, "code", 1000);
			list[0] = p;
			list[1] = p1;
			list[2] = p2;
			list[3] = p3;
			list[4] = s1;
			list[5] = ws;
//			ProcessPerson.display(list);
			display(list);  
//			show();			실행오류
			ws.show();
//			p3.show();
//			s1.show();
//			ws.show();
			}
	}
