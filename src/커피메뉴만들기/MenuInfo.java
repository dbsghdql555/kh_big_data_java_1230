package 커피메뉴만들기;

import org.jetbrains.annotations.NotNull;

public class MenuInfo implements Comparable<MenuInfo>{
    String name;
    int price;
    String group;
    String desc;

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    @Override
    public int compareTo(@NotNull MenuInfo o) {
        return this.price - o.price;
    }
}
