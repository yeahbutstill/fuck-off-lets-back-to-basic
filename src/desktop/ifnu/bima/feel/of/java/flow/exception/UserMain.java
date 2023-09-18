package desktop.ifnu.bima.feel.of.java.flow.exception;

public class UserMain {
    public static void main(String[] args){
        try{
            System.out.println("cari user");
            throw new UserNotFoundException("user tidak ada");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

