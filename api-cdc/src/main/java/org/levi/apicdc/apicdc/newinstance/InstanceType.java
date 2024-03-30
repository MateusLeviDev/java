package org.levi.apicdc.apicdc.newinstance;

public enum InstanceType {
    PUBLIC("PUBLIC"),
    RESTRICTED("RESTRICTED");

    private final String value;

    InstanceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
