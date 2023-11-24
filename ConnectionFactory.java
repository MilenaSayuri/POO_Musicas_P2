import java.io.FileInputStream;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.io.File;
import java.util.Properties;
public class ConnectionFactory {
  private static Properties properties;
  static{
    try{
      properties = new Properties();
      
      var raiz = Thread.currentThread().getContextClassLoader().getResource("").getPath();
       //A variável raiz é responsável por armazenar o caminho do sistema para que possamos localizar o arquivo conf.properties
      properties.load(new FileInputStream(new File(raiz + "conf.properties")));
    }
    catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
  }

  public static java.sql.Connection conectar () throws Exception{
    String host = properties.getProperty("DB_HOST");
    String port = properties.getProperty("DB_PORT");
    String name = properties.getProperty("DB_NAME");
    String user = properties.getProperty("DB_USER");
    String password = properties.getProperty("DB_PASSWORD");
    String s = String.format(
      "jdbc:postgresql://%s:%s/%s",
      host, port, name
    );
    var conexao = DriverManager.getConnection(s, user, password);
    return conexao;

  }
}
