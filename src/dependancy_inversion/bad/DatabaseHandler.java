package dependancy_inversion.bad;

public class DatabaseHandler {
    private MySQLDatabase mySQLDatabase;
    private OracleDatabase oracleDatabase;
    public DatabaseHandler(){
        this.mySQLDatabase = new MySQLDatabase();
    }
    public void connect(){
        this.mySQLDatabase.connect();
    }
    public void disconnect(){
        this.mySQLDatabase.disconnect();
    }

}
