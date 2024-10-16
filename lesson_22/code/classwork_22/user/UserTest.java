package classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

    class UserTest {

        User user;

        final String email = "peter@mail.de"; // ideal email
        final String password = "123456Az!"; // ideal password


        @BeforeEach
        void setUp() {
            user = new User(email, password); // create new 'fresh' object user
        }

        @Test
        void testValidEmail(){

            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail());

        }

        @Test
        void testValidPassword(){
            assertEquals("123456Az!",user.getPassword());
        }


        @Test
        void setEmailNoAt() {
            String email = "petermail.de"; // wrong email
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail()); // email didn't change

        }

        @Test
        void setEmailNoDot(){
            String email = "peter@mailde"; // wrong email
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail());

        }

        @Test
        void setEmailNoLetter(){
            String email = "444455@46657"; // wrong email
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail());

        }

        @Test
        void setEmailWithTwoSots(){
            String email = "peter@mail.de";
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail());

        }

        @Test
        void setValidPasswordLength(){
            user.setPassword("1234Az!"); //7 symbols
            assertEquals("123456Az!", user.getPassword());
            user.setPassword("123456123456123456Az!"); // 21 symbols
            assertEquals("123456Az!", user.getPassword()); // проверяем оба кейса
        }

        @Test
        void setValidPasswordMinOneDigit() {
            user.setPassword("Asdfghj!");
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setValidPasswordOneLetterUpperCase(){
            user.setPassword("asdfghj!");
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setValidPasswordOneLetterLowerCase(){
            user.setPassword("123456AZ!");
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setValidPasswordOneSpecialSymbol(){
            user.setPassword("123456Az");
            assertEquals("123456Az!", user.getPassword());
        }
    }


