package ch10_exception.sec01;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Dog dog = new Dog(); // �ڵ� Ÿ�� ��ȯ �߻�
		changeDog(dog);		// ClassCastException ���� ����
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		// instanceof ������ ����ؼ� Ÿ�� Ȯ��
		if(animal instanceof Cat) {
		Cat cat = (Cat) animal;
		}
		// ���� Ÿ�� ��ȯ : ������ �ڵ� Ÿ�� ��ȯ�� ���� �ƴϸ� ClassCastException ���� �߻�
	}
}



class Animal{}
class Dog extends Animal {  }
class Cat extends Animal {  }






