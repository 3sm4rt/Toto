package data;

import com.epam.training.toto.domain.Outcome;
import com.epam.training.toto.domain.Round;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class FileBasedDataStore {
    public List<Round> rounds;


    public void loadCsv(){
        String file = "C:\\Users\\3sm4r\\IdeaProjects\\toto-application\\Toto.txt";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(";");
                for(String index : row) {
                    Round round = new Round(index[0],index[1],index[2],index[3],index[4],index[5]);
                    rounds.add(round);
                    System.out.println(index);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }



    }
    /*
    private static Round fillTheRound (String[] metadata){
        int year = Integer.parseInt(metadata[0]);
        int week = Integer.parseInt(metadata[1]);
        int roundOfWeek = Integer.parseInt(metadata[2]);
        LocalDate localDate = java.time.LocalDate.parse(metadata[3]);
        List<Outcome> outcomes = metadata[4];

        return new Round(year,week,roundOfWeek,localDate,outcomes);
    }
    */

}
