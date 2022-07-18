package test08string.excption.lianxi;

public class UserService {
    public void register(String username,String password) throws ExceptionName {
        if (username==null||username.length()<6||username.length()>14){
            throw new ExceptionName("用户名不合法，长度必须在【6-14】之间");
        }
        System.out.println("注册成功，欢迎【"+username+"】");
    }
}
