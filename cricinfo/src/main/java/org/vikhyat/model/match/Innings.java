package org.vikhyat.model.match;

import java.util.HashMap;
import java.util.Map;

public class Innings {
    private int inningsNo;
    private Map<Integer, Over> overMap;

    public Innings(int inningsNo){
        this.inningsNo = inningsNo;
        overMap = new HashMap<Integer, Over>();
    }
}
