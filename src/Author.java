public class Author {
    //name, email, gender

    private String name;
    private String email;
    private char gender;

    public Author(String a, String b, char c){
        name = a;
        email = b;
        gender = c;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String a){
        email = a;
    }

    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
