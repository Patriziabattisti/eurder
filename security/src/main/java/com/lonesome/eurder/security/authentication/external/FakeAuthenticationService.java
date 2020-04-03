package com.lonesome.eurder.security.authentication.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import static com.google.common.collect.Lists.newArrayList;

@Service
public class FakeAuthenticationService {

    private List<ExternalAuthentication> externalAuthentications;

    @Autowired
    public FakeAuthenticationService(List<ExternalAuthentication> externalAuthentications){
        this.externalAuthentications=newArrayList();
        this.externalAuthentications.add(ExternalAuthentication.externalAuthentication().withUserName("admin").withPassword("admin").withRoles(newArrayList("Admin")));
        this.externalAuthentications.add(ExternalAuthentication.externalAuthentication().withUserName("member").withPassword("member").withRoles(newArrayList("Member")));
    }



    public ExternalAuthentication getUser(String userName, String password) {
        return externalAuthentications.stream()
                .filter(externalAuthentication -> externalAuthentication.getUserName().equals(userName))
                .filter(externalAuthentication -> externalAuthentication.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    public void addCustomer(String username, String password){
        externalAuthentications.add(ExternalAuthentication.externalAuthentication().withUserName(username).withPassword(password));
    }
}
