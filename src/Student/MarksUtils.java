package Student;

import java.util.ArrayList;
import java.util.HashMap;

public class MarksUtils {
    HashMap<String, ArrayList<Integer>> marksList;

    public MarksUtils(){
        marksList = new HashMap<>();
    }

    public void addMarks(String subject, String marksLine){
        String[] marks = marksLine.split(" ");
        ArrayList<Integer> temp = new ArrayList<>();
        for (String mark : marks){
            temp.add(Integer.parseInt(mark));
        }
        marksList.put(subject, temp);
    }

    public HashMap<String, ArrayList<Integer>> getMarksList(){
        return marksList;
    }
}
