package user;

public class User {

    private String email;
    private String password;

    //constructor
    public User(String email, String password) {
        setEmail(email); //переписали на set!!!
        setPassword(password); //переписали на set!!!
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){ //переписали тоже!!! проходим валидацию
            this.email = email;
        } else {
            System.out.println(email + "Email is not valid.");
        }
    }
    private boolean isEmailValid(String email) {

        int indexAt = email.indexOf('@'); // index where @ placed

        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
