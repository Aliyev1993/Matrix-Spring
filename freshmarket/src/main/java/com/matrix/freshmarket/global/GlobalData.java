package com.matrix.freshmarket.global;

import com.matrix.freshmarket.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {

    public static List<ProductEntity> cart;

    static {
        cart =new ArrayList<ProductEntity>();
    }
}
