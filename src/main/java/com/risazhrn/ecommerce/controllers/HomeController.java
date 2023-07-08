package com.risazhrn.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.risazhrn.ecommerce.entity.Product;
import com.risazhrn.ecommerce.entity.ProductTransaction;
import com.risazhrn.ecommerce.services.ProductService;
import com.risazhrn.ecommerce.services.ProductTransactionService;
import com.risazhrn.ecommerce.services.TransactionService;

@Controller
public class HomeController{
    @Autowired
    private ProductService productService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private ProductTransactionService productTransactionService;


    @GetMapping("/transaksi")
    public String transaksi(Model model) {
        model.addAttribute("transactions", transactionService.findAll());
        return "riwayatTransaksi";
    }

    @GetMapping("/detailTransaksi/{id}")
    public String detail(@PathVariable("id") int id,  Model model){
        model.addAttribute("products", transactionService.findById(id).getProducts());
        // for (ProductTransaction p: transactionService.findById(id).getProducts()) {
        //     System.out.println(p.getProduct().getName());
        // }
        return "detailTransaksi";
    }

    // @GetMapping("/add")
    // public String add(Model model){
    //     model.addAttribute("product", new Product());
    //     return "add";
    // }

    // @PostMapping("/save")
    // public String save(@RequestBody Product product, Model model){
    //     productService.addProduct(product);
    //     String message = "Hai Risa!";
    //     model.addAttribute("msg", message);
    //     model.addAttribute("products", productService.findAll());
    //     return "redirect:/";
    // }

    // @GetMapping("/delete/{id}")
    // public String delete(@PathVariable("id") Long id){
    //     productService.deleteById(id);
    //     return "redirect:/";
    // }

    // @GetMapping("/edit/{id}")
    // public String delete(@PathVariable("id") Long id,  Model model){
    //     model.addAttribute("product", productService.findById(id));
    //     return "update";
    // }
    
    // @PostMapping("/update")
    // public String update(Product product, Model model){
    //     productService.updateProduct(product);
    //     return "redirect:/";
    // }

    // @GetMapping("/detail/{id}")
    // public String detail(@PathVariable("id") Long id,  Model model){
    //     model.addAttribute("product", productService.findById(id));
    //     return "detail";
    // }

    
}