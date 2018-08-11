package org.rpinzon.snapper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Renan T. Pinzon on 09/08/18.
 */
@Entity
@Table(name = "MODEL_DATA")
public class Data {

    @Id
    private Integer pk;

    @Column(nullable = false)
    private Integer score;

    public Data() {
        super();
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{ \"pk\":" + getPk() + ", \"score\": \"" + getScore() + "\" }";
    }

}
