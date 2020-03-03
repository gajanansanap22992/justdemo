package Programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Proper
{
public static void main(String[] arg) throws IOException
{
Properties p = new Properties();
FileOutputStream fos = new FileOutputStream("C:\\Users\\Mayur\\eclipse-workspace\\seleniumPractice\\src\\Programs\\abc.properties");

p.setProperty("username","Gajanan");
p.setProperty("age","27");
p.setProperty("browser","Chrome");
p.setProperty("url","http://www.google.com/");
p.store(fos,"My setting");

}
}
