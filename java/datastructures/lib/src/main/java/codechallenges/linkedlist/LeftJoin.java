package codechallenges.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {
  public static List<String> leftJoin(HashMap hashtable1, HashMap hashtable2){

    List<String> list = new ArrayList<>();
    for(Object k : hashtable1.keySet()){
      if(hashtable1.containsKey(k)){
        list.add(k +  ": " + hashtable1.get(k)+ ", " + hashtable2.get(k));
      } else{
        list.add(k + ": " + hashtable1.get(k) + ", " + null);
      }
    }
    return list;
  }
}
