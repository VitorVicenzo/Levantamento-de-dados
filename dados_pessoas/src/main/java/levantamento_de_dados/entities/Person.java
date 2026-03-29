package levantamento_de_dados.entities;

public class Person {
    private double height;
    private String sex;

    public Person(double height, String sex) {
        this.height = height;
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
