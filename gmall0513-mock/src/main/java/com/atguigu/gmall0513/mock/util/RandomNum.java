package com.atguigu.gmall0513.mock.util; /**
 * @Author:xudechang
 * @Date:Created in 2020/11/27 17:46
 * @Description:
 */
import java.util.Random;

public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
