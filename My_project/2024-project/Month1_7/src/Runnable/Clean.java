package Runnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Clean {
    public static void main(String[] args) {
        String[] name = {"王定文" , "宋子昊" , "姚军政" , "冉光柱" , "唐浩峰" , "郭裕"};
        ArrayList<String> job = new ArrayList<>();
        Collections.addAll(job,"洗手台" , "厕所" , "厕所和洗手台中间区域扫和拖" , "倒垃圾" , "活动区域扫" , "活动区域拖");
        Collections.shuffle(job);
        for (int i = 0; i < 6; i++) {
            System.out.println(name[i] + ":  " + job.get(i));
        }
    }
}
