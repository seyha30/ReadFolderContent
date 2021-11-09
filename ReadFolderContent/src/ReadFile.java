import java.io.File;

public class ReadFile {
	public static void main(String[] args) {
		
		String filePath = "/Users/sseyha/uploads/";
		File listFile = new File(filePath);
		for (File file : listFile.listFiles()) {
			String fileName = file.getName();
			int index = fileName.lastIndexOf(".");
			String extention = fileName.substring(index + 1);

			File newName = new File(filePath, fileName.trim().replaceAll(" ", "_"));

			boolean success = file.renameTo(newName);
			if (success) {

				System.out.println(newName.getName() );
			}

		}
		
//		String str = " A B C ";
//		System.out.println(str.trim().replaceAll(" ", "_"));
		
	}

}
