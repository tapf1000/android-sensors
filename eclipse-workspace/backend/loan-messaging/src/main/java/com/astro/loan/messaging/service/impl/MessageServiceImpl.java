package com.astro.loan.messaging.service.impl;

import com.astro.loan.messaging.service.MessageService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

@Service
public class MessageServiceImpl implements MessageService {

    URL url;
    String username="eshagi",token ="b809328811883b72f880189422fea991",bulksms_ws,strJson;
    String ws_str;

    public String sendMessage(String message,String phonenumber){
        bulksms_ws = "http://portal.bulksmsweb.com/index.php?app=ws";

        try {
            ws_str = bulksms_ws + "&u=" + username + "&h=" + token + "&op=pv";
            ws_str = ws_str + "&to=" + URLEncoder.encode(phonenumber, "UTF-8") + "&msg=" + URLEncoder.encode(message,"UTF-8");

            url = new URL(ws_str);

            //----------------------------------------------//
            // Sttep 3: Open a URLConnection to the url.  //
            //----------------------------------------------//

            URLConnection conn = url.openConnection();         // throws an IOException

            //-------------------------------------------------------------//
            // Step 4:                                                     //
            //-------------------------------------------------------------//
            // Convert the InputStreamReader to a Buffered Reader.      //
            // Buffering the stream makes the reading faster; the          //
            // readLine() method of the BufferedReader makes the reading  //
            // easier.                                                     //
            //-------------------------------------------------------------//

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            //------------------------------------------------------------//
            // Step 5:                                                    //
            //------------------------------------------------------------//
            // Store the whole output in a variable. The output will be    //
            // JSON string variable.                                      //
            //------------------------------------------------------------//


            String inputLine;
            strJson = "";
            while ((inputLine = br.readLine()) != null) {
                strJson += inputLine;
            }

            br.close();

            //Variable strJson holds the reponse from the Webservice
            System.out.println(strJson);

        } catch (MalformedURLException mue) {

            System.out.println("Ouch - a MalformedURLException happened.");
            mue.printStackTrace();
            System.exit(1);

        } catch (IOException ioe) {

            System.out.println("Oops- an IOException happened.");
            ioe.printStackTrace();
            System.exit(1);

        }
        return null;
    }
}
