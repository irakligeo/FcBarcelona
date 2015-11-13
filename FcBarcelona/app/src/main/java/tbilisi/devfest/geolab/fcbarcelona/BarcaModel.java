package tbilisi.devfest.geolab.fcbarcelona;

import java.io.Serializable;

/**
 * Created by GeoLab on 11/12/15.
 */
public class BarcaModel implements Serializable{
    private String image,name,birthPlace,position,description;
    private double height;
    private int age,number;

    public BarcaModel(String image, int number, int age, double height, String description, String position, String birthPlace, String name) {
        this.image = image;
        this.number = number;
        this.age = age;
        this.height = height;
        this.description = description;
        this.position = position;
        this.birthPlace = birthPlace;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
