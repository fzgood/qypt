package com.qypt.backstage.entity.score;

public class Score {
    private Integer scoreId;

    private String scoreName;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName == null ? null : scoreName.trim();
    }
}