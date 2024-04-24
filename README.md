#Form

##Description

This is the web application created for the screening exercise portion of the Software Engineer 
with Legislative Information Systems position application. 

Form prompts the user to enter their name, age, title, and hometown. If the user fails to enter 
either a name or title, Form displays an error message and prompts the user to provide the missing 
information. Once the user enters at least their name and title, they can submit the form using a 
submit button. Upon submission, the user is directed to a confirmation page where they receive a 
confirmation message indicating that their information was entered correctly. Additionally, the
confirmation page displays a table of previous entries.


##Prerequisites

- Java Development Kit (JDK) installed on your machine
- Apache Maven installed on your machine 



##Setup Instructions

Follow these steps to clone, build, and run the project locally:

1. Open terminal:
On macOS, they can use Spotlight Search and type "Terminal"; on Windows, they can use the search
bar and type "Command Prompt" or "PowerShell"

3. Clone the repository to your local machine using Git with commands:
     git clone https://github.com/briellebt/Form
     cd Form
   
5.  Run the following command to build the project:
  	  mvn clean package
This command compiles the source code, runs tests, and packages the application into a JAR file.

6. After building the project, you can run the application using the following command:
     java -jar target/Form-1.0-SNAPSHOT.jar

This command assumes that the JAR file generated follows the default naming convention for Maven 
projects, and the terminal is in the root directory of your project where the JAR file is located. 
If the actual name of the generated JAR file or its location on your device is different, you would 
need to adjust the command accordingly.

   
5. Once the application is running, you can access the form page in your web browser at:
   	http://localhost:8080/form



   
