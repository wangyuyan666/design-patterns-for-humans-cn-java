package facade;

public class FacadeMain {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade(new Computer());
        facade.turnOn();// Ouch! Beep beep! Loading.. Ready to be used!
        facade.turnOff();// Bup bup buzzz! Haah! Zzzzz
    }
}
