package test;

/**
 * @program: ceshi
 * @description: ${description}
 * @author: RenChao
 * @create: 2018-10-16 15:28
 **/
public class TestJava {
    public String name;
    public Integer age;
    public char sex;

    public TestJava(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TestJava{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        System.out.println("测试成功！");
        System.out.println("测试IDEA进行推送！");
    }
}
