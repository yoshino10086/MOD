public class Demo05ArrayMax{
	public static void main(String[] args){
		int[] array = new int[]{5,15,30,20,10000};
		
		int max = array[0];//������̨
		for(int i = 1;i < array.length;i++){
			//�����ǰԪ�أ���max��������
			if(array[i] > max){
				max = array[i];
			}
		}
		//˭�����������������max������˭��ս����
		System.out.println("���ֵ��" + max);
	}
}