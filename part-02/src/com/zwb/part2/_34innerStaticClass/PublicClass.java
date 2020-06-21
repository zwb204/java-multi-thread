package com.zwb.part2._34innerStaticClass;

/**
 * @Desc:
 * @Author: zwb
 * @CreateTime: 2020/6/21 16:00
 **/
public class PublicClass {
    private static String username;
    private static String password;

    static class PrivateClass {
        private String age;
        private String address;

        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }
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
