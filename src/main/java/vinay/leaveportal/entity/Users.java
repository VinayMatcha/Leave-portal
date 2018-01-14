package vinay.leaveportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
/**
 *
 * @author kaushik *
 * This is a pojo class for Users Table
 */
public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="login_id")
    private int loginId;

    @Column(name="name")
    private String name;

    @Column(name="mail_id")
    private String mailId;

    @Column(name="password")
    private String password;

    @Column(name="access_type")
    private String accessType;




    public Users(String name, String mailId, String password) {
        super();
        this.name = name;
        this.mailId = mailId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users [loginId=" + loginId + ", name=" + name + ", mailId=" + mailId + ", password=" + password
                + ", accessType=" + accessType + "]";
    }

}
