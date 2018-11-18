package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018/11/18
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }


    /**
     * 重写了父类的方法，实现了扩展
     * @return 打折的价格
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }


    @Override
    public String toString() {
        return this.getId()+this.getName()+this.getPrice();
    }
}
