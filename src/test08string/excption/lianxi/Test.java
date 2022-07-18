package test08string.excption.lianxi;

public class Test {
    public static void main(String[] args) {
        UserService user=new UserService();
        try {
            user.register("dalian","123455");
        } catch (ExceptionName e) {
            System.out.println(e.getMessage());
        }
    }
}
