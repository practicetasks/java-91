package t11_enums.tests;

enum Color {
    RED,
    GREEN,
    BLUE;

    private int code = ordinal() * 10;

    public  int getCode() {
        return code;
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println(Color.BLUE.getCode());
    }
}