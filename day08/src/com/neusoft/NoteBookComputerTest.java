package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/11 16:29
 */

public class NoteBookComputerTest {
    public static void main(String[] args) {
        NoteBookComputer noteBookComputer = new NoteBookComputer();
        //开启
        noteBookComputer.open();
        //使用鼠标
        USB mouse = new Mouse();
        noteBookComputer.useUSB(mouse);
        //使用键盘
        USB keyBoard = new KeyBoard();
        noteBookComputer.useUSB(keyBoard);
        // 笔记本关闭
        noteBookComputer.close();
    }
}
