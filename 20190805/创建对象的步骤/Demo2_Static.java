 class Demo2_Static {
 	public static void main(String[] args) {
		Demo d = new Demo();
		d.print1();
	}
}
/*
static��ע������
	* a:�ھ�̬��������û��this�ؼ��ֵ�
		* ��������?
			* ��̬��������ļ��ض����أ�this�����Ŷ���Ĵ��������ڡ�
			* ��̬�ȶ����ȴ��ڡ�
	* b:��̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
		* ��̬������
			* ��Ա������ֻ�ܷ��ʾ�̬����
			* ��Ա������ֻ�ܷ��ʾ�̬��Ա����
		* �Ǿ�̬������
			* ��Ա�����������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬��
			* ��Ա�����������Ǿ�̬�ĳ�Ա������Ҳ�����ǷǾ�̬�ĳ�Ա������
		* �򵥼ǣ�
			* ��ֻ̬�ܷ��ʾ�̬��
     */
	 class  Demo {
		 int num1 = 10;                        //�Ǿ�̬�ĳ�Ա����
		 static int num2 = 20;                 //��̬�ĳ�Ա����

		 public void print1() {               //�Ǿ�̬�ĳ�Ա����,�ȿ��Է��ʾ�̬�ĳ�ԱҲ���Է��ʷǾ�̬�ĳ�Ա
			 System.out.println(num1);
			 System.out.println(num2);         
			 }

		 /*publi void println() {
			 System.out.println(num);
			 System.out.println(num);
	 }   */

	 }
		