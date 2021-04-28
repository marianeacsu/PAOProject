package Audit;

import Order.*;
import Others.Location;
import Others.Payment;
import People.Client;
import People.Driver;
import Restaurant.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Audit {


    public void WriteToAuditCSV(String action) {


        String filepath = "src\\Audit\\audit.csv";
        File file = new File(filepath);

        try{
            FileWriter fileAudit = new FileWriter(file,true);
            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String timestamp = now.format(data);
            fileAudit.append(action);
            fileAudit.append(",");
            fileAudit.append(timestamp);
            fileAudit.append("\n");
            fileAudit.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


