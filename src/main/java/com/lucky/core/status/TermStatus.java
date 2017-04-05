package com.lucky.core.status;

public enum TermStatus implements IntEnum<TermStatus>{
	
	NOT_OPEN_SALE(0, "未开启"), SALE(1, "未中奖"), CLOSE(2, "已中奖"), OPEN_PRIZE(3, "已中奖"),
	RETURN_PRIZE(4, "已中奖"), FINISH(5, "已完结"), CANCLED(6, "已取消");
	
	private int index;
	private String name;

	private TermStatus(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String fromIndex(int index) {
		for (TermStatus p : TermStatus.values()) {
			if (index == p.getValue())
				return p.name;
		}
		return null;
	}

	public int getValue() {		
		return this.index;
	}

	public String getName(){
		return this.name();
	}
}
