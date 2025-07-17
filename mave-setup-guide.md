# Maven Project Setup Guide in Eclipse

This guide will walk you through creating a Maven-based Selenium project in Eclipse IDE.

---

## Step 1: Create a New Maven Project

- Go to File → New → Other... → Select Maven Project.
- In the New Project window:
  - Select Maven Project and click Next.
  - In the archetype section, type apache in the Filter box.
  - Choose org.apache.axis2.archetype → quickstart and click Next.
  - Enter your Group Id and Artifact Id (use any custom values).
  - Click Finish.

---

## Step 2: Add Dependencies in pom.xml

1. Go to [https://mvnrepository.com/](https://mvnrepository.com/)
2. Search for Selenium Java.
3. Select:
   - Selenium version: 3.141.59
   - TestNG version: 6.14.2
4. Copy the dependency XMLs.
5. Paste them inside the <dependencies> section of pom.xml.

xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>6.14.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>


### Install TestNG Plugin in Eclipse

- Go to Help → Eclipse Marketplace
- Search for TestNG
- Click Install

---

## Step 3: Create Java Class File

- Right-click on the src/main/java folder
- Create a new Package (e.g., com.example.selenium)
- Create a Java Class inside that package (e.g., SampleTest)

---

## Step 4: Set up ChromeDriver

Add this to your main method to set up the driver:

java
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();


> Make sure chromedriver.exe is downloaded and the path is correct.

---

## Step 5: Full Example Code

java
package com.example.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Application
        driver.get("https://www.example.org/");
    }
}


---

## Step 6: Run the Project

- Right-click the class file in Eclipse
- Click Run As → Java Application

✅ Output: Chrome browser opens and loads https://www.example.org/

---
