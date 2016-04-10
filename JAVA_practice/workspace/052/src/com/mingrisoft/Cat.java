package com.mingrisoft;
/**
 * Ϊʲô��Ҫ��дhashcode();
 * hashcode������ɢ�����ݵĿ��ٴ�ȡ��������HashSet/HashMap/Hashtable�����洢����ʱ�����Ǹ��ݴ洢�����hashcodeֵ�������ж��Ƿ���ͬ�ġ�
����������Ƕ�һ��������д��euqals����˼��ֻҪ����ĳ�Ա����ֵ�������ôeuqals�͵���true��������дhashcode����ô������newһ���µĶ���
��ԭ����.equals���¶��󣩵���trueʱ�����ߵ�hashcodeȴ�ǲ�һ���ģ��ɴ˽����������Ĳ�һ�£����ڴ洢ɢ�м���ʱ����Set�ࣩ������洢������ֵһ���Ķ���
���»�������ˣ���Ҳ��Ҫ��дhashcode()
 * 
 * */
import java.awt.Color;

public class Cat {
    private String name; // ��ʾè�������
    private int age; // ��ʾè�������
    private double weight; // ��ʾè�������
    private Color color; // ��ʾè�����ɫ

    public Cat(String name, int age, double weight, Color color) {// ��ʼ��è�������
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {// �����������ж�è���Ƿ���ͬ
        if (this == obj) {// �������è����ͬһ����������ͬ
            return true;
        }
        if (obj == null) {// �������è����һ��Ϊnull��ͬ
            return false;
        }
        if (getClass() != obj.getClass()) {// �������è������Ͳ�ͬ��ͬ
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && (age == cat.age)
                && (weight == cat.weight) && (color.equals(cat.color));// �Ƚ�è�������
    }
    public int hashCode(){
    	return 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 13
                * new Double(weight).hashCode() + 5 * color.hashCode();

   /* @Override
    public int hashCode() {// ��дhashCode()����
        return 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 13
                * new Double(weight).hashCode() + 17 * color.hashCode();*/
    }
}
