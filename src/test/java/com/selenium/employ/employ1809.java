package com.selenium.employ;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class employ1809
{
 public static void main(String[] args) throws InterruptedException { 
				
				System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
				WebDriver driver = new ChromeDriver();
				String baseUrl = "http://localhost:8080/employee-payslips/#!/login#employee";
				driver.get(baseUrl); 
				String login = driver.getTitle(); 
				System.out.println(login);
				String expectedTitle = "Employee Payslips"; 
				assertEquals(expectedTitle,login);
			  
				WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[1]/input"));
				username.sendKeys("admin");
				username.submit(); 
				WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[2]/input"));
				password.sendKeys("admin");
				password.submit();
				          // click on the Sign in button 
				
				WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[4]/button")); 
				loginbutton.click();
				
				WebElement Employee = driver.findElement(By.xpath("//*[@id=\"MainMenu\"]/div[1]/a[1]"));
				Employee.click();
				Thread.sleep(2000);
				WebElement Add = driver.findElement(By.xpath("//*[@id=\"employee\"]/a[1]"));
				Add.click();
				Thread.sleep(2000);
				WebElement Empid = driver.findElement(By.xpath("//*[@id=\"empid\"]"));
				Empid.sendKeys("12211");
				Thread.sleep(1000);
				WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
				FirstName.sendKeys("Naveen1");
				Thread.sleep(1000);
				WebElement SurName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
				SurName.sendKeys("Jnr");
				Thread.sleep(1000);
				WebElement username1 = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
				username1.sendKeys("naveen2");
				Thread.sleep(1000);
				WebElement password1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
				password1.sendKeys("passwordhere");
				Thread.sleep(1000);
				WebElement DOB = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
				DOB.sendKeys("02031992");
				Thread.sleep(1000);
				WebElement Address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
				Address.sendKeys("khairatabad");
				Thread.sleep(1000);
				WebElement PhoneNo = driver.findElement(By.xpath("//*[@id=\"phoneNo\"]"));
				PhoneNo.sendKeys("1234561234");
				Thread.sleep(1000);
				WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
				Email.sendKeys("navenen@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"departmentName\"]")).sendKeys("QADepartment ");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"designationName\"]")).sendKeys("Quality Analyst");
				Thread.sleep(1000);
				WebElement PanNo = driver.findElement(By.xpath("//*[@id=\"panNo\"]"));
				PanNo.sendKeys("JE1234AS5");
				Thread.sleep(1000);
				WebElement UAN = driver.findElement(By.xpath("//*[@id=\"pfNo\"]"));
				UAN.sendKeys("152240030759");
				Thread.sleep(1000);
				WebElement HireDate = driver.findElement(By.xpath("//*[@id=\"hireDate\"]"));
				HireDate.sendKeys("03022018");
				Thread.sleep(1000);
				WebElement Skype = driver.findElement(By.xpath("//*[@id=\"skypeId\"]"));
				Skype.sendKeys("naveeneasyway@gmail.com");
				Thread.sleep(1000);
				WebElement Submit = driver.findElement(By.xpath("//*[@id=\"addUserForm\"]/div[16]/div/button"));
				Submit.click();
                 
				Thread.sleep(5000);
			    //driver.quit();
				
			try
 {
	String listOfEmployees = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div/div/div[1]/h2/span/b")).getText()
						.toString();
			System.out.println("***************" + listOfEmployees);
			assertEquals(listOfEmployees, "List of Employees");
			System.out.println("Employee Details added Successfully");
			Thread.sleep(5000);
			} 
           catch (Exception ex)
			{
			  
        	   System.out.println("Exception occured,Duplicate entries");
						
            }
}
}
