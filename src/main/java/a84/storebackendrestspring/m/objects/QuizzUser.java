package a84.storebackendrestspring.m.objects;

import javax.persistence.*;

@Entity
public class QuizzUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private int accessLevel;
    @Column(unique = true)
    private String userName;
    private String email;
    private String hashedPassword;
    private boolean active;
    private String roles;



    public QuizzUser() {
    }

    public QuizzUser(int userId, int accessLevel, String userName, String email, String hashedPassword, String salt) {
        this.userId = userId;
        this.accessLevel = accessLevel;
        this.userName = userName;
        this.email = email;
        this.hashedPassword = hashedPassword;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "QuizzUser{" +
                "userId=" + userId +
                ", accessLevel=" + accessLevel +
                ", name='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                '}';
    }
}
