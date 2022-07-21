package com.frank.generate;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiong.canwei
 * @date 2022年07月21日 16:02
 */
public class MyBatisCodeGenerator {
    public static void main(String[] args){
        try {
            System.out.println("+++++++++generate begin++++++++++");
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            String url = MyBatisCodeGenerator.class.getResource("/MBG_configuration.xml").getFile();
            File configFile = new File(url);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("+++++++++generate writer end+++++++++++");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}