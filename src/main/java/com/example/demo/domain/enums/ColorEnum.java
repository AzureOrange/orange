package com.example.demo.domain.enums;

/**
 * descript
 *
 * @author orange
 * @Time 2017/9/20 0020
 */

public enum ColorEnum {

    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量
    private String name;
    private int index;
    // 构造方法
    private ColorEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法

    /**
     * 获取名称
     * @param index
     * @return
     */
    public static String getName(int index) {
        for (ColorEnum c : ColorEnum.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    /**
     * 获取序号
     * @param name
     * @return
     */
    public static int getColor(String name){
        for (ColorEnum c : ColorEnum.values ()){
            if (name.equals (c.getName ())){
                return c.ordinal ();
            }
        }
        return -1;
    }


    // get set 方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return this.index+"_"+this.name;
    }
}
