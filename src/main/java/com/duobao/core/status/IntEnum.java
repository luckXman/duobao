package com.duobao.core.status;

public interface IntEnum<E extends Enum<E>> {  
    int getValue();  
    String getName();
}