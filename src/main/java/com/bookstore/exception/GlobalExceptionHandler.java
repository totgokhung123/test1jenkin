//package com.bookstore.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(Exception.class)
//    public String handleBadRequest(HttpServletRequest request, Exception ex, Model model) {
//        model.addAttribute("error", "400");
//        model.addAttribute("message", ex.getMessage());
//        model.addAttribute("url", request.getRequestURL());
//        return "error";
//    }
//
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(Exception.class)
//    public String handleNotFound(HttpServletRequest request, Exception ex, Model model) {
//        model.addAttribute("error", "404");
//        model.addAttribute("message", "Page not found");
//        model.addAttribute("url", request.getRequestURL());
//        return "error";
//    }
//
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public String handleInternalServerError(HttpServletRequest request, Exception ex, Model model) {
//        model.addAttribute("error", "500");
//        model.addAttribute("message", "Internal server error");
//        model.addAttribute("url", request.getRequestURL());
//        return "error";
//    }
//}