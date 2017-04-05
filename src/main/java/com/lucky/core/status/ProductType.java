package com.lucky.core.status;

public enum ProductType implements IntEnum<ProductType> {
	CARD(1002, "充值卡"), NOT_AWARD(1, "未中奖"), AWARD(1, "已中奖");
	
	private int index;
	private String name;

	private ProductType(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String fromIndex(int index) {
		for (ProductType p : ProductType.values()) {
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
