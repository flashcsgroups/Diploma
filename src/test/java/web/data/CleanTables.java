package web.data;

import java.sql.*;

public class CleanTables {

    public static void cleanTables() throws SQLException {
        String deleteOrderEntity = "delete from order_entity;";
        String deletePaymentEntity = "delete from payment_entity;";
        String deleteCreditEntity = "delete from credit_request_entity;";

        try (
                Connection connectionMysql = DriverManager.getConnection(getUrl(), getUser(), getPassword());

                PreparedStatement statementOrderEntity = connectionMysql.prepareStatement(deleteOrderEntity);
                PreparedStatement statementPaymentEntity = connectionMysql.prepareStatement(deletePaymentEntity);
                PreparedStatement statementCreditEntity = connectionMysql.prepareStatement(deleteCreditEntity);
        ) {
            statementOrderEntity.executeUpdate();
            statementPaymentEntity.executeUpdate();
            statementCreditEntity.executeUpdate();
        }
    }

    private static String getUrl() {
        return System.getProperty("test.db.url");
    }

    private static String getUser() {
        return "app";
    }

    private static String getPassword() {
        return "pass";
    }
}
