package aaa.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
public class Userv {

    @Id
    @Column
    private Integer userid;
    @Column
    private String uname;
    @Column
    private String userv;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUserv() {
        return userv;
    }

    public void setUserv(String userv) {
        this.userv = userv;
    }


    @Override
    public String toString() {
        return "Userv{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", userv='" + userv + '\'' +
                '}';
    }


}
