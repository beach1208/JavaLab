package Lab4;


public enum  DressCode {
    JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"),UNIFORM("uniform");

    private String value;

    /**
     *
     * @param value constructor of String value
     */
    DressCode(String value) {
        this.value = value;
    }
}
