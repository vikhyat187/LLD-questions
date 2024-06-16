package org.vikhyat.model.match;

import lombok.Data;

@Data
public class Ball {
    private int overNo;
    private BallType ballType;
    private String bowledBy;
    private String facedBy;
    private RunType runType;
    private Wicket wicket;
    private Commentory commentory;

    public Ball(int overNo, BallType ballType, String bowledBy, String facedBy){
        this.ballType = ballType;
        this.overNo = overNo;
        this.bowledBy = bowledBy;
        this.facedBy = facedBy;
    }

}
