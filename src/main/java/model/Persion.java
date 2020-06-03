package model;

public class Persion {
    private String userName;
    private String password;
    public void say(){
        System.out.println(userName+"你好");
    }
    public void sayHello(){
        System.out.println(userName+"你好");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
