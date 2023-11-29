package com.example.showlistcustomer;

import src.Customer;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "listCustomerServlet", value = "/listservlet")
public class ListCustomerServlet extends HttpServlet {
    ArrayList<Customer> customers = new ArrayList<>();

    public void init() {
        Customer customer = new Customer("a123","Mai Văn Hoàn","1983-08-20","Hà Nội");
        Customer customer2 = new Customer("a124","Nguyễn Văn Nam","1983-08-21","Bắc Giang");
        Customer customer3 = new Customer("a125","Nguyễn Thái Hòa","1983-08-22","Nam Định");
        Customer customer4 = new Customer("a126","Trần Đăng Khoa","1983-08-17","Hà Tây");
        Customer customer5 = new Customer("a127","Nguyễn Đình Thi","1983-08-19","Hà Nội");
        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("customers",customers);
        RequestDispatcher view = request.getRequestDispatcher("customerList.jsp");
        view.forward(request,response);
    }

    public void destroy() {
    }
}