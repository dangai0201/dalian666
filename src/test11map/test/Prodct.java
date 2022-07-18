package test11map.test;

import java.util.Objects;

public class Prodct {
    private int no;
    private String name;

    public Prodct() {
    }

    public Prodct(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //业务要求：商品编号相同，并且商品名字相同，表示同一个商品
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodct prodct = (Prodct) o;
        return no == prodct.no && Objects.equals(name, prodct.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
