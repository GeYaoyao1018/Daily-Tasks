package com.heima.Map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo6_HashMapHashMap {

	/**
	 * ����Ƕ�׼���
	 */
	public static void main(String[] args) {
      //����88�ڻ�����
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("����",23), "����");
		hm88.put(new Student("����",24), "����");
		hm88.put(new Student("����",25), "�Ϻ�");
		hm88.put(new Student("����",26), "����");
		
		   //����99�ڻ�����
				HashMap<Student, String> hm99 = new HashMap<>();
				hm99.put(new Student("��ɮ",1023), "����");
				hm99.put(new Student("�����",1024), "����");
				hm99.put(new Student("��˽�",1025), "�Ϻ�");
				hm99.put(new Student("ɳ����",1026), "����");
				
				//����˫Ԫ����
				
				HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
				hm.put(hm88, "��88�ڻ�����");
				hm.put(hm99, "��99�ڻ�����");
				
				//����˫�м���
				for(HashMap<Student,String> h: hm.keySet())   {
					String value = hm.get(h);
					for(Student key : h.keySet())  {
						String value2 = h.get(key);
						System.out.println(key + "=" + value2 + "=" + value);
										}
				}
		
	}

}
