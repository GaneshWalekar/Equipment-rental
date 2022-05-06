package in.techdenovo.japps.dao;

import in.techdenovo.japps.model.Product;
import in.techdenovo.japps.utils.DbUtility;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    boolean flag=false;
    DbUtility dbUtility=new DbUtility();


        public List<Product> allProductList(String category, String searchInput){


        List<Product> productsList = new ArrayList<>();
        String query="select * from products";
        try {


                PreparedStatement ps = dbUtility.getConnection().prepareStatement(query);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Product product = new Product();
                    product.setId(rs.getInt("prod_id"));
                    product .setProd_name(rs.getString("prod_name"));
                    product.setProd_value(rs.getString("prod_value"));
                    product.setProd_url(rs.getString("prod_url"));
                    productsList.add(product);

                }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return productsList;
    }

    public List<Product> getFeaturedProducts() {
            List<Product> products = new ArrayList<>();
            String query="select * from products";
            try {
                PreparedStatement ps = dbUtility.getConnection().prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    Product product = new Product();
                    product.setId(rs.getInt("prod_id"));
                    product .setProd_name(rs.getString("prod_name"));
                    product.setProd_value(rs.getString("prod_value"));
                    product.setProd_url(rs.getString("prod_url"));
                    products.add(product);

                }
            }catch (SQLException e){

            }

            return products;
    }
}
