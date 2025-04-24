package com.xworkz.internal;
import com.xworkz.external.MysqlJDBC;
import com.xworkz.external.OrcaleJDBC;

public class MainRunner {
    public static void main(String[] args) {

        JDBC jdbc = new OrcaleJDBC();
        IplApp iplapp = new IplApp(jdbc);
        iplapp.teamInfo();
    }
}
