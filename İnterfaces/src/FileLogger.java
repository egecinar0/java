
public class FileLogger implements Logger {

	@Override
	public void log(String massage) {
		
		System.out.println("Dosyaya loglandý : "+massage);
		
	}

}
