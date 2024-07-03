package BloodBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.AbstractTableModel;
/* loaded from: ResultSeTableModel.class */
public class ResultSeTableModel extends AbstractTableModel {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;
    private boolean connectedToDatabase;

    public ResultSeTableModel(String url, String userName, String password, String defaultQuery) throws SQLException {
        this.connectedToDatabase = false;
        this.connection = DriverManager.getConnection(url, userName, password);
        this.statement = this.connection.createStatement(1004, 1007);
        this.connectedToDatabase = true;
        setQuery(defaultQuery);
    }

    public int getRowCount() throws IllegalStateException {
        if (!this.connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        return this.numberOfRows;
    }

    public int getColumnCount() throws IllegalStateException {
        if (!this.connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        try {
            return this.metaData.getColumnCount();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return 0;
        }
    }

    public Object getValueAt(int row, int column) throws IllegalStateException {
        if (!this.connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        try {
            this.resultSet.absolute(row + 1);
            return this.resultSet.getObject(column + 1);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return "";
        }
    }

    public void setQuery(String query) throws SQLException, IllegalStateException {
        if (!this.connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        this.resultSet = this.statement.executeQuery(query);
        this.metaData = this.resultSet.getMetaData();
        this.resultSet.last();
        this.numberOfRows = this.resultSet.getRow();
        fireTableStructureChanged();
    }

    public void disconnectFromDatabase() {
        try {
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            this.connectedToDatabase = false;
        }
        if (this.connectedToDatabase) {
            this.resultSet.close();
            this.statement.close();
            this.connection.close();
        }
    }

    public String getColumnName(int column) throws IllegalStateException {
        if (!this.connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        try {
            return this.metaData.getColumnName(column + 1);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return "";
        }
    }
}
