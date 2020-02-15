package com.ioc.example.customer;

public class CustomerBL {

    public CustomerBL() {

    }

    public String GetCustomerName(int id) {
        DataAccess _dataAccess = DataAccessFactory.GetDataAccess();
        return _dataAccess.GetCustomerName(id);
    }
}

class DataAccess // would be a new file in real app
{
    public DataAccess() {
    }

    public String GetCustomerName(int id) {
        return "Dummy Customer Name"; // get it from DB in real app
    }
}

class DataAccessFactory {
    public static DataAccess GetDataAccess() {
        return new DataAccess();
    }
}