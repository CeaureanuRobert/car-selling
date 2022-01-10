//package com.example.carselling.Controller;
//
//import antlr.StringUtils;
//import com.example.carselling.DAO.DealsDAO;
//import com.example.carselling.Model.Deal;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.view.RedirectView;
//
//import java.io.IOException;
//import java.util.List;
//
//@RequestMapping("/car-sell")
//@RestController
//public class DealController {
//
//    @Autowired
//    private final DealsDAO dealsDAO;
//
//    public DealController(@Qualifier("accessDeals") DealsDAO dealsDAO) {
//        this.dealsDAO = dealsDAO;
//    }
//
//    @PostMapping("/addDeal")
//    public RedirectView addDeal(Deal deal, @RequestParam("image") MultipartFile multipartFile){
//    }
//
//    @GetMapping("/deals")
//    public List<Deal> getAllDeals(){
//        return dealsDAO.findAll();
//    }
//}
