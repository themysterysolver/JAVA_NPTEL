import java.sql.*;

public class myFirstDB{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/myfirssqldb";
        String user="root";
        String password= "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
            String query="SELECT * FROM user_info;";
            Statement statment=connection.createStatement();
            ResultSet resultSet=statment.executeQuery(query);
            System.out.println("UserName Password\n--------------");
            while(resultSet.next()){
                System.out.println(resultSet.getString("username")+"      "+resultSet.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
