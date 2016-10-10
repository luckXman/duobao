package com.lucky.core.status;

public enum CommonStatus implements IntEnum<CommonStatus> {
	NO(0, "no"), YES(1, "yes");
	private int index;
	private String name;

	private CommonStatus(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String fromIndex(int index) {
		for (CommonStatus p : CommonStatus.values()) {
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
