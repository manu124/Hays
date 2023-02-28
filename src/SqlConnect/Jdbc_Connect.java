package SqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_Connect {
    public static void main(String[] args) {
        Pojo p = new Pojo();
        String url = "jdbc:mysql://localhost:3306/mysqlconnect";
        String username="root";
        String pass="Manu12345";
        Connection connection=null ;
        try{
            connection = DriverManager.getConnection(url,username,pass);
            if(connection!=null){
                System.out.println("database is connected");
            }
            Statement statement = connection.createStatement();//interface to write sql
            ResultSet resultSet =statement.executeQuery("select * from student");
            while(resultSet.next()){
                p.setName(resultSet.getString(2));
                p.setId((resultSet.getInt(1)));
                System.out.println(p.getId()+" "+p.getName());
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
       /* finally {
            connection.close();
        }

        */
    }
}

