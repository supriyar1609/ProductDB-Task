package com.axis.app

import com.axis.model.product
import com.axis.service.ProductService
import java.util.*

fun main(){
    var productService=ProductService()

    var sc  = Scanner(System.`in`)
    print("Enter id: ")
    var productId:Int=sc.nextInt()
    print("Enter product name : ")
    var productName:String=sc.next()
    print("Enter product price : ")
    var productPrice:Double=sc.nextDouble()
    print("Enter product quantity : ")
    var productQuantity:Int =sc.nextInt()

    var product= product(productId,productName,productPrice,productQuantity)

    // productService.insertProduct()
    productService.insertUserProduct(product)
    productService.displayAllProducts()

}