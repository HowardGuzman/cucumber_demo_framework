package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Mohammad Mutakim on 11/11/17.
 */
public class ConfigReader {

    private String url;
    private String chromeDriverPath;
    private String browser;

    public ConfigReader() {

        Properties prop = new Properties();
        InputStream input = null;

        try {

//            input = new FileInputStream("config.properties");
            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.url = prop.getProperty("url");

//            This chromeDriverPath assignment is now handled by the following switch statement
//            this.chromeDriverPath = prop.getProperty("chrome_driver_path");

            this.browser = prop.getProperty("browser");


            switch(browser) {

                case "chrome":
                    this.browser = prop.getProperty("chrome_driver_path");
                    break;

                case "firefox":
                    this.browser = prop.getProperty("");
                    break;

                default:

                    System.out.println("No valid browser selected");



            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {

        return url;
    }

    public String getChromeDriverPath() {

        return chromeDriverPath;
    }
}
