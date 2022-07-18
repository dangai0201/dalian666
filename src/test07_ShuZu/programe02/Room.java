package test07_ShuZu.programe02;

public class Room {
    private int no;
    private String type;
    //true 标识空闲，房间可以被预定
    //false标识占用，房间不能呗预定
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String toString(){
        return "["+no+","+type+","+(status?"空闲":"占用")+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof  Room)) return  false;
        if (this==obj) return true;
        Room room=(Room)obj;
        //当前房间编号等于传过来的房间对象的房间编号。认为是同一个房间
        return this.getNo() == room.getNo();
    }

    @Override
    public int hashCode() {
        return no;
    }
    /* public static void main(String[] args) {
        Room room=new Room(101,"单人间",true);
        //println(引用)，会自动调用引用的toString方法。
//        System.out.println(room.toString());
        System.out.println(room);
         Room room1=new Room(101,"单人间",true);
         System.out.println(room.equals(room1));




    }*/



}
