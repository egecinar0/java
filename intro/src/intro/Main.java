package intro;



public class Main {
	public static void main(String[] args) {
		
		System.out.println("--------------");
		
	Name name1 = new Name("Engin","Demiroð") ;
	
		System.out.println("Name    : "+name1.getName());
		System.out.println("Surname : "+name1.getSurname());

		System.out.println("--------------");

		Course course1 =new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		
		System.out.println("id : " +course1.getId());
		System.out.println("Teacher Name : " +course1.getcTeacher());
		System.out.println("Course Name : " +course1.getcName());
		System.out.println("Course Details : " +course1.getDetail());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		Course course2 =new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");

		System.out.println("id : "+course2.getId());
		System.out.println("Teacher Name : "+course2.getcTeacher());
		System.out.println("Course Name : "+course2.getcName());
		System.out.println("Course Details : "+course2.getDetail());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		Course course3 =new Course(3,"Programlamaya Giriþ için Temel Kurs","Engin Demiroð","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin");
		
		System.out.println("id : "+course3.getId());
		System.out.println("Teacher Name : "+course3.getcTeacher());
		System.out.println("Course Name : "+course3.getcName());
		System.out.println("Course Details : "+course3.getDetail());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	
	
