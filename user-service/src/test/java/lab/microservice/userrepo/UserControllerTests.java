package lab.microservice.userrepo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;



@SpringBootTest
public class UserControllerTests {

    @Autowired
    private UserController controller;

    @Test
    public void testGetUserById() {
        ResponseEntity<User> response =  controller.getUserById(1L);

        assert(response.getStatusCodeValue() == 200);
        assert(response.getBody().getId() == 1L);


        assertEquals(200, response.getStatusCodeValue() );
     
    }
}
