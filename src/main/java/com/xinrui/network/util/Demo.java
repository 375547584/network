package com.xinrui.network.util;

import com.xinrui.network.mapper.ThirdPartyMapper;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class Demo {

    @Autowired
    private ThirdPartyMapper thirdPartyMapper;
    @Autowired
    private Environment evn;

    @Scheduled(cron = "0 10 14 * * ?")
    public void get() {
//        List<Enterprise> enterprises = thirdPartyMapper.get("", "");
//        System.out.println(JSONObject.toJSONString(enterprises));
        String url = evn.getProperty("spring.datasource.url");
        String driverClassName = evn.getProperty("spring.datasource.driverClassName");
        String username = evn.getProperty("spring.datasource.username");
        String password = evn.getProperty("spring.datasource.password");
        String sqlPath = evn.getProperty("data.sqlPath");

        try {
            Class.forName(driverClassName);// mysql
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File(sqlPath);
        File[] files = file.listFiles();


        for (File file1 : files) {
            try {
                Connection conn = DriverManager.getConnection(url, username, password);
                ScriptRunner runner = new ScriptRunner(conn);
                runner.setEscapeProcessing(false);
                runner.setSendFullScript(true);
                runner.runScript(new InputStreamReader(new FileInputStream(file1), "UTF-8"));
                conn.commit();
                conn.close();
            } catch (Exception e) {
                FileOperateUtil.appendContent("C:\\Users\\Administrator\\Desktop\\result.txt", file1.getAbsolutePath() + "\n");
            } finally {
                continue;
            }
        }

    }
}
