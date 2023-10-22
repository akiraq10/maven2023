package com.sdetpro.ultis;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Url {
    private static final String SJON_FILE=System.getProperty("user.dir").concat("/src/test/resources/testing-urls.json");
    public static String currentTestUrL(String testPage){
        ObjectMapper objectMapper =new ObjectMapper();
        String finalTestingUrL;

        try {
            FileInputStream fileInputStream =new FileInputStream(SJON_FILE);
            InputStreamReader inputStreamReader =new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            Map<String, HashMap> testingUrlData =objectMapper.readValue(bufferedReader, HashMap.class);
            String sitePath= testingUrlData.get(testPage).get("url").toString();
            finalTestingUrL =System.getenv("testingUrl").concat(sitePath);





            // close after interacting with the file
            bufferedReader.close();
            inputStreamReader.close();
            bufferedReader.close();

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("ERR | Issue when reading the testing url data json file");
        }

        return finalTestingUrL;

    }

    public static void main(String[] args) {
        System.out.println(Url.currentTestUrL("LOGIN_PAGE"));
    }


}
