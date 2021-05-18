package lesson04;

import javax.sql.DataSource;

public class DataSourceDecorator implements DataSourse {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
      // wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return null;
    }

}
