package basebol;

import java.util.ArrayList;
import java.util.List;

public class Solution { 

    public static int calPoints(String[] ops) { 
        List<Integer> record = new ArrayList<>();

        for (String op : ops) {
            int size = record.size(); 
            if (op.equals("+")) {
                record.add(record.get(size - 1) + record.get(size - 2));
                
            } else if (op.equals("D")) {
                record.add(record.get(size - 1) * 2);
                
            } else if (op.equals("C")) {
                record.remove(size - 1);
                
            } else {
                record.add(Integer.parseInt(op));
            }
        }
        int totaldasoma = 0; 
        for (int score : record) {
            totaldasoma += score;
        }
        return totaldasoma;
    }
}