package com.zwb.part2._38setNewPropertiesLockOne;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 20:55
 **/
public class UserInfo {
    private String username;
    private String password;

    public UserInfo() {

    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
