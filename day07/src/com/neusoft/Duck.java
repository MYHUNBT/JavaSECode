package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/6 17:26
 */

public class Duck extends Poultry{
    Duck(){

    }

    public Duck(String name, int age, String symptom, String illness) {
        super(name, age, symptom, illness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为" + super.getSymptom());
    }
}
