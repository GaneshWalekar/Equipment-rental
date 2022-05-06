package in.techdenovo.japps.controller;

import in.techdenovo.japps.dao.ProductDao;
import in.techdenovo.japps.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDao productDao = new ProductDao();
        List<Product> products = productDao.getFeaturedProducts();

//        for(Product prod:products) {
//            System.out.println(prod.getId()+" : "+prod.getProd_name()+" : "+prod.getProd_value()+" : "+prod.getProd_url());
//        }

        req.setAttribute("prods",products);
        req.getRequestDispatcher("home.jsp").forward(req,resp);
    }
}
