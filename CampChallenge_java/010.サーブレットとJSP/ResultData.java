package org.camp.servlet;
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author uenotakuro
 */
public class ResultData implements Serializable {

    private Date d;
    private String luck;

    public ResultData() {
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public String getLuck() {
        return luck;
    }

    public void setLuck(String luck) {
         this.luck = luck;
    }
    
}
