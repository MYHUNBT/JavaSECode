package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/6 17:17
 */

public abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private String illness;
    Poultry(){

    }
    Poultry(String name,int age,String symptom,String illness){
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.symptom = symptom;
    }

    public abstract void showSymptom();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void showMsg(){
        System.out.println("动物种类：" + name);
        System.out.println("年龄：" + age);
        System.out.println("入院原因：" + illness);
    }
}
