import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		Properties prop=new Properties();
		prop.load(fi);
		
		System.out.println(prop.getProperty("browsername"));
		System.out.println(prop.getProperty("appurl"));
		fi.close();
		
		

	}

}
