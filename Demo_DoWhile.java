 class  Demo_DoWhile {	
	public static void main(String[] args) {

   /*
    A:ѭ���ṹdo...while���ĸ�ʽ��
* 
		do {
			ѭ�������;
		}while(�ж��������);
		
		������ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�ж��������);
* B:ִ�����̣�
	* a:ִ�г�ʼ�����
	* b:ִ��ѭ�������;
	* c:ִ�п����������
	* d:ִ���ж��������,���䷵��ֵ��true����false
		* �����true���ͼ���ִ��
		* �����false���ͽ���ѭ��
	* e:�ص�b������
* C:������ʾ ���1-10

   */

   int i = 1;
   do
   {System.out.println("i = " + i);
   i++;
   }
   while (i <= 10);

	}
}
