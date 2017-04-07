package com.duobao.core.status;

public enum Platform implements IntEnum<Platform> {
	ALL(0, "全部") ,H5(0, "H5"), WX(1, "微信"), PC(1, "PC");
	private int index;
	private String name;

	private Platform(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String fromIndex(int index) {
		for (Platform p : Platform.values()) {
			if (index == p.getValue())
				return p.name;
		}
		return null;
	}
	
	public String getName(){
		return this.name();
	}

	public int getValue() {
		return this.index;
	}

}
