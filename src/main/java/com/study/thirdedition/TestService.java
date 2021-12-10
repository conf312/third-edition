package com.study.thirdedition;

import com.study.thirdedition.singleton.SingletonEnum;
import com.study.thirdedition.singleton.SingletonPublicStaticFinal;
import com.study.thirdedition.singleton.SingletonStaticFactoryPattern;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void debugService() {
        SingletonPublicStaticFinal.INSTANCE.leaveTheBuilding();
        SingletonStaticFactoryPattern.getInstance().leaveTheBuilding();
        SingletonEnum.INSTANCE.leaveTheBuilding();

        String a = new String("testA");
        String b = new String("testA");

        System.out.println("String Ref Eqauls" + equalString(a,b));

        study.stack.StackMemoryLeak stackMemoryLeak = new study.stack.StackMemoryLeak();
            System.out.println(stackMemoryLeak);
        String testVal = "testA";
        String testValB = "testB";
        String testValC = "testC";

        stackMemoryLeak.push(testVal);
        stackMemoryLeak.push(testValB);
        stackMemoryLeak.showElements();
        stackMemoryLeak.pop();
        stackMemoryLeak.showElements();
        stackMemoryLeak.push(testValC);
        stackMemoryLeak.showElements();
    }


    public static String equalString(String a, String b) {
        if(a == b) {
            return "true";
        } else {
            return "false";
        }
    }
}
