class Person
{
   public void person()
   {
	   System.out.println("Person");
   }
}
class Student extends Person
{
	public void student()
	{
		 System.out.println("Student");
    }
}
class Employee extends Person
{
	public void employee()
	{
		 System.out.println("Employee");
    }
}
class Undergraduate extends Student
{
	public void undergraduate()
	{
	    System.out.println("Undergraduate");
    }
}  
class Graduate extends Student 
{
	public void graduate()
	{
	 System.out.println("Graduate");
	}
}
class Faculty extends Employee
{
	public void faculty()
	{
		 System.out.println("Faculty");
    }
}
class Staff extends Employee
{
	public void staff()
	{
		 System.out.println("Staff");
	}
}
class Masters extends Graduate
{
	public void masters()
	{
		System.out.println("Master");
	}
}
class Doctoral extends Graduate
{
	public void doctoral()
	{
		System.out.println("Doctoral");
	}
}
class Nondegree extends Graduate
{
	public void nondegree()
	{
		System.out.println("Nondegree");
	}
}

class Personmain
{
	public static void main(String args[])
	{
		Graduate g1=new Graduate();
	    	g1.person();
		g1.student();
		Undergraduate u1=new Undergraduate();
		u1.person();
		u1.student();
		Doctoral d1=new Doctoral();
		d1.graduate();
		d1.student();
		d1.person();
		Masters m1=new Masters();
		m1.graduate();
		m1.student();
		m1.person();
		Nondegree n1=new Nondegree();
		n1.graduate();
		n1.student();
		n1.person();
		Faculty f1=new Faculty();
		f1.employee();
		f1.person();
		Staff s1=new Staff();
		s1.employee();
		s1.person();
	}
}