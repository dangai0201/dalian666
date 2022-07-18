package test07_ShuZu.programe02;

import java.util.Scanner;

public class HotelMsgSystem {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
//        hotel.print();

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("功能编号对应功能：【1】表示查看房间列表。【2】表示订房。【3】表示退房。【0】表示退出系统");
        Scanner s=new Scanner(System.in);

        while(true){
            System.out.println("请输入功能编号：");
            int i=s.nextInt();
            if (i==1){
                //房间列表
                hotel.print();
            }else  if (i==2){
                //订房
                System.out.println("请输入订房编号：");
                int roomNo=s.nextInt();
                hotel.order(roomNo);

            }else  if (i==3){
                //退房
                System.out.println("请输入退房编号：");
                int roomNo=s.nextInt();
                hotel.exit(roomNo);

            }else if (i==0){
                //退出系统
                System.out.println("再见，欢迎下次再来");
                return;

            }else {
                //出错了
                System.out.println("输入编号有误，请重新输入");
            }

        }
    }
}
