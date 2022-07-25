package myothertest;

public enum SEX {
    MALE("male"),
    FEMALE("female");

    private final String sex;
    SEX(String sex) {
        this.sex = sex;
    }

    public String getValue() {
        return sex;
    }
}
