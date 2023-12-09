package com.zamannow.generic.boundedtypeparameter.constraint;

import com.zamannow.generic.boundedtypeparameter.constraint.inheritance.MultipleBoundedTypeParameter;
import com.zamannow.generic.boundedtypeparameter.constraint.inheritance.VicePresident;

public class App {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>();
        integerNumberData.setData(100);
        System.out.println(integerNumberData.getData());
        System.out.println("=========================================");

        // error
        //NumberData<String> numberNumberData = new NumberData<>();

        // error, karena Class Manager tidak implement interface CanSayHello
        //MultipleBoundedTypeParameter<Manager> dataManager = new MultipleBoundedTypeParameter<>();
        //dataManager.setData(new Manager());

        MultipleBoundedTypeParameter<VicePresident> dataVP1 = new MultipleBoundedTypeParameter<>(new VicePresident());
        dataVP1.getData().sayHello("DNL");
        System.out.println(dataVP1.getData());
        System.out.println("============================");

        MultipleBoundedTypeParameter<VicePresident> dataVP2 = new MultipleBoundedTypeParameter<>();
        VicePresident vp = new VicePresident();
        vp.sayHello("Naruto");
        dataVP2.setData(vp);
        dataVP2.getData().sayHello("Sasuke");
        System.out.println("============================");
    }
}
