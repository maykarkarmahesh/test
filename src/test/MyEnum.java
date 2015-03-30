package test;

public enum MyEnum {

	WINTER(3),
	SUMMER(10),
	FALL(11),
	SPRING(13);
	
	private int value;
	
	private MyEnum(int value)
	{
		this.value = value;
	}
	
	public static void main(String[] args) {
		MyEnum[] values = MyEnum.values();
		for (MyEnum myEnum : values) {
			System.out.println(myEnum.value);
			//test revert
		}
		
	}
	
}
