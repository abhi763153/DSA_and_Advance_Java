package MySQLDatabase;

import java.sql.*;

public class ConnectToDB {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            String userName = "root";
            String password = "Abhi$hek123";

            String url = "jdbc:mysql://localhost/test";

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected successfully");

            Statement statement;
            ResultSet resultSet;

            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Student (sid, name, marks) VALUES (200, 'Sahil', 98)");
            resultSet = statement.executeQuery("select * from Student");

            while (resultSet.next()){
                String name =  resultSet.getString("name");
                int marks = resultSet.getInt("marks");

                System.out.println(name + " " + marks);
            }

            resultSet.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e){
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                    System.out.println("Database connection closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
