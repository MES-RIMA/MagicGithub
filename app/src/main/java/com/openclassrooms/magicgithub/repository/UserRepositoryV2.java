package com.openclassrooms.magicgithub.repository;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class UserRepositoryV2 {
    private final ApiService apiService; // TODO: A utiliser

    public UserRepositoryV2(ApiService apiService) {

        this.apiService = apiService;
    }

    static List<User> getUsers() { return new ArrayList<>(listUser); }

    public static List<User> listUser = Arrays.asList(
            new User("001", "Jake", "https://api.adorable.io/AVATARS/512/1.png"),
            new User("002", "Paul", "https://api.adorable.io/AVATARS/512/2.png"),
            new User("003", "Phil", "https://api.adorable.io/AVATARS/512/3.png"),
            new User("004", "Guillaume", "https://api.adorable.io/AVATARS/512/4.png"),
            new User("005", "Francis", "https://api.adorable.io/AVATARS/512/5.png")
            );
        // TODO: A modifier



    public void generateRandomUser() {
        // TODO: A modifier
    }

    public void deleteUser(User user) {
        // TODO: A modifier
    }
}
