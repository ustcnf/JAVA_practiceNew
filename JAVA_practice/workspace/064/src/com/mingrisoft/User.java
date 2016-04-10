package com.mingrisoft;
/**
 *  简单工厂模式：根据描述图片类型的字符串创建相应的图片保存类的对象
 *  策略模式：Identify the aspects of your application that vary and separate them from what stays the same.(找到系统中变化的部分，将变化的部分同其它稳定的部分隔开。)
换句话说就是：“找到变化并且把它封装起来，稍后你就可以在不影响其它部分的情况下修改或扩展被封装的变化部分。” 尽管这个概念很简单，但是它几乎是所有设计模式的基础，所有模式都提供了使系统里变化的部分独立于其它部分的方法。
 * */

public class User {
    public static void main(String[] args) {
        System.out.print("用户选择了GIF格式：");
        ImageSaver saver = TypeChooser.getSaver("GIF");//获得保存图片为GIF类型的对象
        saver.save();
        System.out.print("用户选择了JPEG格式：");//获得保存图片为JPEG类型的对象
        saver = TypeChooser.getSaver("JPEG");
        saver.save();
        System.out.print("用户选择了PNG格式：");//获得保存图片为PNG类型的对象
        saver = TypeChooser.getSaver("PNG");
        saver.save();
    }
}
