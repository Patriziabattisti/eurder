package com.lonesome.eurder.security.authentication.external;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import static com.google.common.collect.Lists.newArrayList;

@Service
public class FakeAuthenticationService {
    private List<ExternalAuthentication> externalAuthentications = newArrayList(
            ExternalAuthentication.externalAuthentication().withUserName("admin").withPassword("admin").withRoles(newArrayList("Admin")),
            ExternalAuthentication.externalAuthentication().withUserName("member").withPassword("member").withRoles(newArrayList("Member"))


    );

    public Optional<ExternalAuthentication> getUser(String userName, String password) {
        return externalAuthentications.stream()
                .filter(externalAuthentication -> externalAuthentication.getUserName().equals(userName))
                .filter(externalAuthentication -> externalAuthentication.getPassword().equals(password))
                .findFirst();
    }
}
