package com.mingrisoft;
/**
 *  �򵥹���ģʽ����������ͼƬ���͵��ַ���������Ӧ��ͼƬ������Ķ���
 *  ����ģʽ��Identify the aspects of your application that vary and separate them from what stays the same.(�ҵ�ϵͳ�б仯�Ĳ��֣����仯�Ĳ���ͬ�����ȶ��Ĳ��ָ�����)
���仰˵���ǣ����ҵ��仯���Ұ�����װ�������Ժ���Ϳ����ڲ�Ӱ���������ֵ�������޸Ļ���չ����װ�ı仯���֡��� �����������ܼ򵥣��������������������ģʽ�Ļ���������ģʽ���ṩ��ʹϵͳ��仯�Ĳ��ֶ������������ֵķ�����
 * */

public class User {
    public static void main(String[] args) {
        System.out.print("�û�ѡ����GIF��ʽ��");
        ImageSaver saver = TypeChooser.getSaver("GIF");//��ñ���ͼƬΪGIF���͵Ķ���
        saver.save();
        System.out.print("�û�ѡ����JPEG��ʽ��");//��ñ���ͼƬΪJPEG���͵Ķ���
        saver = TypeChooser.getSaver("JPEG");
        saver.save();
        System.out.print("�û�ѡ����PNG��ʽ��");//��ñ���ͼƬΪPNG���͵Ķ���
        saver = TypeChooser.getSaver("PNG");
        saver.save();
    }
}
