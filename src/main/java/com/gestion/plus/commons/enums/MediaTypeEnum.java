package com.gestion.plus.commons.enums;

public enum MediaTypeEnum {
    IMAGE("image"),
    VIDEO("video"),
	DOCUMENT("document");

    private final String type;

    MediaTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}