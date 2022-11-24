package com.axis.service

import com.axis.model.product
import com.axis.utility.ProductUtil
class ProductService {
    var productUtil=ProductUtil()

    fun insertProduct(){
        var res =productUtil.insert()
        println(res)
    }

    fun displayAllProducts(){
        productUtil.selectAllProducts()
    }

    fun insertUserProduct(product:product){
        productUtil.insertUserInput(product)
    }


}