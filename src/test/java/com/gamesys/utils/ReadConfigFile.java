package com.gamesys.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
    public static Properties properties;
    public static FileInputStream configfile;

      public ReadConfigFile() {
          try {
              properties = new Properties();
              configfile = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/gamesys/utils/Config.properties");
              properties.load(configfile);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }

      public String getBrowser(){
          if(properties.getProperty("browserName") == null)
          return " ";
          return  properties.getProperty("browserName");
      }
}
