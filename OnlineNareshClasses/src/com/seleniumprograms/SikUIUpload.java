package com.seleniumprograms;

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikUIUpload extends Reusable{

	public static void main(String[] args) throws InterruptedException, FindFailed {
	
		
		launchbrowser("chrome");
		appurl("https://www.naukri.com/", "Opened Naukari wesite");
		Thread.sleep(3000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		
		Screen s=new Screen();
		
		Pattern filepath=new Pattern("C:\\Users\\Lenovo\\Desktop\\filepath.PNG");
		Pattern openbutton=new Pattern("C:\\Users\\Lenovo\\Desktop\\openbutton.PNG");
		s.wait(filepath, 20);
		s.type(filepath, "C:\\Users\\Lenovo\\Desktop\\arun.txt");
		s.click(openbutton);
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
