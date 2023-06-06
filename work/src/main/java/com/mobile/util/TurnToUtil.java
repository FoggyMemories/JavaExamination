package com.mobile.util;

import com.mobile.errors.NoneFoundNumberException;
import com.mobile.mobileshop.AllServicePackage;
import com.mobile.mobileshop.NetPackage;
import com.mobile.mobileshop.SuperPackage;
import com.mobile.mobileshop.TalkPackage;

//将套餐数字转化为具体的套餐种类

public class TurnToUtil {

    public static AllServicePackage turn(int num) {
        switch (num) {
            case 1 -> {
                return new TalkPackage();
            }
            case 2 -> {
                return new NetPackage();
            }
            case 3 -> {
                return new SuperPackage();
            }
            default -> throw new NoneFoundNumberException();
        }
    }
}
