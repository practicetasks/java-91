package t11_enums.example_3;

class Practice {
    public static void main(String[] args) {
        System.out.println(getDownloadLink(DeviceType.IOS));
    }

    public static String getDownloadLink(DeviceType type) {
        return switch (type) {
            case ANDROID -> "https://play.google.com/store/apps/раздельный_сбор_мусора";
            case IOS -> "https://apps.apple.com/org/app/раздельный_сбор_мусора";
            case WEB -> "https://сайт_про_раздельный_сбор_мусора.org";
        };
    }
}

enum DeviceType {
    ANDROID,
    IOS,
    WEB
}