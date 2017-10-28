package com.good.team.iudocus.csv;

import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Controller
public class CSVReader {

    public void read() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(
                "dataEntry.csv"));
        List<CSVData> empList = readFiles(reader);

        reader.close();
        System.out.println(empList);
    }


//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(
//                "dataEntry.csv"));
//
//        List<CSVData> empList = readFiles(reader);
//
//        reader.close();
//
//        System.out.println(empList);
//
//    }

    static List<CSVData> readFiles(BufferedReader reader) throws IOException {
        int index = 0;
        String line;
        Scanner scanner;
        List<CSVData> empList = new ArrayList<>();
        String header = reader.readLine();
        while ((line = reader.readLine()) != null) {
            CSVData csvData = new CSVData();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();

                if (index == 0)
                    csvData.setIdAddres(data);
                else if (index == 1)
                    csvData.setStreetName(data);
                else if (index == 2)
                    csvData.setNrOfTheBuilding(data);
                else if (index == 3)
                    csvData.setDate(data);
                else if (index == 4)
                    csvData.setPlace(data);
                else if (index == 5)
                    csvData.setTypeOfPlace(data);
                else if (index == 6)
                    csvData.setSurfaceCondition(data);
                else if (index == 7)
                    csvData.setMarking(data);
                else if (index == 8)
                    csvData.setLighting(data);
                else if (index == 9)
                    csvData.setConditions(data);
                else if (index == 10)
                    csvData.setAccident(data);
                else if (index == 11)
                    csvData.setNumberOfParticipants(Integer.parseInt(data));
                else if (index == 12){
                    if (!data.equals("NULL")) {
                        csvData.setAgeOfPerperator(Integer.parseInt(data));
                    }
                }
                else if (index == 13)
                    csvData.setCarOfPerperator(data);
                else if (index == 14) {
                    if (!data.equals("NULL")) {
                        csvData.setAgeOfPedestriant(Integer.parseInt(data));
                    }
                }
                else if (index == 15)
                    csvData.setNumberOfSlightWounded(Integer.parseInt(data));
                else if (index == 16)
                    csvData.setNumberOfHeavilyInjured(Integer.parseInt(data));
                else if (index == 17)
                    csvData.setNumberOfKilled(Integer.parseInt(data));
                else
                    System.out.println("invalid csvData::" + data);
                index++;
            }
            index = 0;
            empList.add(csvData);
        }
        return empList;
    }

}

