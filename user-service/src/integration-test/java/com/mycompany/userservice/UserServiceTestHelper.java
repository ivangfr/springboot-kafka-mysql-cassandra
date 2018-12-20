package com.mycompany.userservice;

import com.mycompany.userservice.dto.CreateUserDto;
import com.mycompany.userservice.model.User;

public class UserServiceTestHelper {

    /* Default User Values */

    private static final Long ID = 1L;
    private static final String EMAIL = "ivan@test";
    private static final String FULLNAME = "ivan franchin";
    private static final Boolean ACTIVE = true;

    /* User */

    public static User getDefaultUser() {
        return getAnUser(ID, EMAIL, FULLNAME, ACTIVE);
    }

    public static User getAnUser(Long id, String email, String fullName, Boolean active) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setFullName(fullName);
        user.setActive(active);
        return user;
    }

    /* UserDto */

    /* UpdateUserDto */

    /* CreateUserDto */

    public static CreateUserDto getDefaultCreateUserDto() {
        return getACreateUserDto(EMAIL, FULLNAME, ACTIVE);
    }

    public static CreateUserDto getACreateUserDto(String email, String fullName, Boolean active) {
        return new CreateUserDto(email, fullName, active);
    }

}
