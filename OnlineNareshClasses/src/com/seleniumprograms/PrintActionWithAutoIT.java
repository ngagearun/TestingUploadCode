package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public abstract class PrintActionWithAutoIT extends Reusable {
	
	abstract void m2();

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	
		
		launchbrowser();
		appurl("https://www.naukri.com/", "Opened Naukari wesite");
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\UploadDocument.exe");
		Thread.sleep(3000);
		

	}

}
