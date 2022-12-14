package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
     private static GetProperties getProperties= null;
     private String browser;
     private String host;
     private String user;
     private String sendto;
     private String asun;
     private String messa;

     private String mail;

     private String pwd;

     private String listN;

     private String editN;

     private GetProperties(){
         Properties properties = new Properties();
         String nameFile="todoly.properties";
         InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
         if(inputStream!= null){
             try {
                 properties.load(inputStream);
                 browser=properties.getProperty("browser");
                 host=properties.getProperty("host");
                 user=properties.getProperty("user");
                 sendto=properties.getProperty("sendto");
                 asun=properties.getProperty("asunto");
                 messa=properties.getProperty("message");
                 mail=properties.getProperty("mail");
                 pwd=properties.getProperty("pwd");
                 listN=properties.getProperty("listName");
                 editN=properties.getProperty("editName");


             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     public static GetProperties getInstance(){
         if (getProperties == null)
             getProperties=new GetProperties();
         return getProperties;
     }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getSendto() {
        return sendto;
    }

    public String getAsunto() {
        return asun;
    }

    public String getMessage() {
        return messa;
    }

    public String getMail() { return mail; }

    public String getPwd() { return pwd; }

    public String getListN() { return listN; }

    public String getEditN() { return editN; }
}
