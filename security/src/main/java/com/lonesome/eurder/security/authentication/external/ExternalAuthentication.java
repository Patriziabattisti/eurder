package com.lonesome.eurder.security.authentication.external;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class ExternalAuthentication {
    private String userName;
    private String password;
    private List<String> roles;

    public static ExternalAuthentication externalAuthentication(){
        return new ExternalAuthentication();
    }

    public ExternalAuthentication withUserName(String userName) {
        this.userName = userName;
        return this;
    }


    public String getPassword() {
        return password;
    }

    public ExternalAuthentication withPassword(String password) {
        this.password = password;
        return this;
    }

    public ExternalAuthentication withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public String getUserName() {
        return userName;
    }


    public List<String> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternalAuthentication that = (ExternalAuthentication) o;
        return Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, roles);
    }

    @Override
    public String toString() {
        return "ExternalAuthentication{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
