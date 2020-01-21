package web.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {}

    @Value
    public static class AuthInfo {
        private String cardNumber;
        private String month;
        private String year;
        private String ownerNameCard;
        private String codeCard;
    }

    public static AuthInfo getValidCardNumber() {
        return new AuthInfo("4444444444444441", "08", "22",
                "Alexander Kachalov", "999");
    }

    public static AuthInfo getNotValidCardNumber() {
        return new AuthInfo("4444444444444442", "08", "22",
                "Alexander Kachalov", "999");
    }

}
