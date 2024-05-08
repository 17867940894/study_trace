package LinkedListText;

import java.util.LinkedList;

public class LinkedListText {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("1");//TODO 将指定元素插入此列表的开头。
        list.addLast("999");//TODO 将指定元素插入此列表的末尾。
        list.remove();//TODO 获取并移除此列表的头（第一个元素）。
        list.getFirst();//TODO 返回此列表的第一个元素
        list.getLast();//TODO 返回此列表的最后一个元素
        list.peek();//TODO 获取但不移除此列表的头（第一个元素）。
        list.peekFirst();//TODO 获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。
        list.peekLast();//TODO 获取但不移除此列表的最后元素；如果此列表为空，则返回 null。
        list.poll();//TODO 获取并移除此列表的第一个元素 first 和 last 同上
        list.get(0);//TODO 返回此列表的第I个元素  first 和 last就是你想的那样
        list.pop();//TODO 从此列表所表示的堆栈处弹出一个元素。
        list.push("4");//TODO 将元素推入此列表所表示的堆栈。
    }
}
