package in.techdenovo.japps.model;

public class Product {


    private int id;
    private String prod_name;
    private String prod_value;
    private String prod_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_value() {
        return prod_value;
    }

    public void setProd_value(String prod_value) {
        this.prod_value = prod_value;
    }

    public String getProd_url() {
        return prod_url;
    }

    public void setProd_url(String prod_url) {
        this.prod_url = prod_url;
    }
}
