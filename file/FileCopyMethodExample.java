package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileCopyMethodExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Path from = Paths.get("C:\\Users\\Administrator\\eclipse-workspace\\0602\\src\\file\\shot.JPG");
		Path to = Paths.get("C:\\Users\\Administrator\\eclipse-workspace\\0602\\src\\file\\shot2.JPG");
		
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("복사 완료 삥");
	}

}
