package ch11.quiz07;

public class WrongPasswordExeption extends Exception{
    public WrongPasswordExeption() {}

    public WrongPasswordExeption(String message) {
        super(message);
    }


}
