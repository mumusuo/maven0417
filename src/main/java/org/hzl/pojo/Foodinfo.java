package org.hzl.pojo;

import java.io.Serializable;

public class Foodinfo implements Serializable {

    private int foodId;
    private String foodName;
    private String remark;
    private int foodPrice;

    public Foodinfo(int foodId, String foodName, String remark, int foodPrice, String description, String foodImage) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.remark = remark;
        this.foodPrice = foodPrice;
        this.description = description;
        this.foodImage = foodImage;
    }

    public Foodinfo(String foodName, String remark, int foodPrice, String description, String foodImage) {
        this.foodName = foodName;
        this.remark = remark;
        this.foodPrice = foodPrice;
        this.description = description;
        this.foodImage = foodImage;
    }

    private String description;

    @Override
    public String toString() {
        return "FoodinfoDao{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", remark='" + remark + '\'' +
                ", foodPrice=" + foodPrice +
                ", description='" + description + '\'' +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }

    private String foodImage;

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public Foodinfo() {
    }
}
