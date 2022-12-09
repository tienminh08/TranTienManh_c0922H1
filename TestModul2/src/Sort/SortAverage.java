package Sort;

import Model.Studnet;

import java.util.Comparator;

public class SortAverage implements Comparator<Studnet> {


    @Override
    public int compare(Studnet o1, Studnet o2) {
       if (o1.getAverage()>o2.getAverage()){
           return 1;
       }else if (o1.getAverage()<o2.getAverage()){
           return -1;
       }else {
           return 0;
       }
    }
}
