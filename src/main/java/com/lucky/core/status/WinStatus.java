package com.lucky.core.status;

public enum WinStatus implements IntEnum<WinStatus> {
	FAILURE(0, "failure"), SUCCESS(1, "success");
	private int index;
	private String name;

	private WinStatus(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String fromIndex(int index) {
		for (WinStatus p : WinStatus.values()) {
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
