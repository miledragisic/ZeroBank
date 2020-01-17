package com.zerobank.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

private static Properties configFile;

static {

    try {
        FileInputStream fileInputStream = new FileInputStream("Configuration.properties");
        configFile = new Properties();
        configFile.load(fileInputStream);
        fileInputStream.close();
    }catch (java.io.IOException e) {
        System.out.println("Failed to open properties file");
    }
}

    public static String getProperty(String key){
    return  configFile.getProperty(key);
    }

}
