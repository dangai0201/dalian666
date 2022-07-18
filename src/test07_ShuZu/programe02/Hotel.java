package test07_ShuZu.programe02;

public class Hotel {
    //二维数组，模拟大厦所有的房间
    private Room[][] rooms;

    public Hotel() {
        //动态初始化
        rooms=new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i==0){
                    rooms[i][j]=new Room((i+1)*100+j+1,"标准间",true);
                }else if (i==1){
                    rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                }else if (i==2){
                    rooms[i][j]=new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length ; j++) {
                Room room=rooms[i][j];
                System.out.print(room);
            }
            //换行
            System.out.println();
        }
    }
    //订房方法
    public void order(int roomNo){
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(false);
        System.out.println(roomNo+"已订房！");
    }
    //退房方法
    public void exit(int roomNo){
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(true);
        System.out.println(roomNo+"已退房！");
    }


}
