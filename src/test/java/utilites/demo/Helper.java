package utilites.demo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

		 public static void captureScreenShot(WebDriver driver , String screenshot) throws IOException {
		        Path dest = Paths.get("C:\\Users\\Excellent Store\\eclipse-workspace\\demo\\ScreenShots",screenshot+".png");
		        FileOutputStream out = new FileOutputStream(dest.toString());
		        out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
		        out.close();
		        Files.createDirectories(dest.getParent());
		 }
		    
	}


