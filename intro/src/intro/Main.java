package intro;



public class Main {
	public static void main(String[] args) {
		
		System.out.println("--------------");
		
	Name name1 = new Name("Engin","Demiro�") ;
	
		System.out.println("Name    : "+name1.getName());
		System.out.println("Surname : "+name1.getSurname());

		System.out.println("--------------");

		Course course1 =new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		
		System.out.println("id : " +course1.getId());
		System.out.println("Teacher Name : " +course1.getcTeacher());
		System.out.println("Course Name : " +course1.getcName());
		System.out.println("Course Details : " +course1.getDetail());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		Course course2 =new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");

		System.out.println("id : "+course2.getId());
		System.out.println("Teacher Name : "+course2.getcTeacher());
		System.out.println("Course Name : "+course2.getcName());
		System.out.println("Course Details : "+course2.getDetail());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		Course course3 =new Course(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin");
		
		System.out.println("id : "+course3.getId());
		System.out.println("Teacher Name : "+course3.getcTeacher());
		System.out.println("Course Name : "+course3.getcName());
		System.out.println("Course Details : "+course3.getDetail());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	
	
