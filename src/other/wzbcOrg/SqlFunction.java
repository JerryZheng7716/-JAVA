package other.wzbcOrg;
import java.sql.*;

public class SqlFunction {
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String link = "jdbc:sqlserver://localhost:1433;DatabaseName=WZBCORG";
    String userName = "sa";
    String passWord = "123456";
    Connection connection= null;
    PreparedStatement preparedStatement = null;
    boolean b=true;
    int x = 0;
    ResultSet resultSet=null;
    public ResultSet doSqlSelect(String sqlLanguage , String[] psString,boolean islike){
        try {
            Class.forName(driver);
            System.out.println("成功加载驱动");
            connection = DriverManager.getConnection(link, userName,passWord);
            System.out.println("成功连接数据库");
            preparedStatement=connection.prepareStatement(sqlLanguage);
            for (int i = 0; i < psString.length; i++) {
            	if(islike){
            		preparedStatement.setString(i+1, "%"+psString[i]+"%");
            	}else {
            		preparedStatement.setString(i+1, psString[i]);
				}
				
			}
            resultSet = preparedStatement.executeQuery();       
            
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return resultSet;
    }
    
    public int doSqlUpdate(String sqlLanguage , String[] psString){
        try {
            Class.forName(driver);
            System.out.println("成功加载驱动");
            connection = DriverManager.getConnection(link, userName,passWord);
            System.out.println("成功连接数据库");     
            preparedStatement=connection.prepareStatement(sqlLanguage);
            for (int i = 0; i < psString.length; i++) {
				preparedStatement.setString(i+1, psString[i]);
			}
            x = preparedStatement.executeUpdate();                      
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeAllLink();
		return x;
    }
    

    public  void closeAllLink(){
        try {
            if (connection!=null){
                connection.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }if(resultSet!=null){
            	resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

