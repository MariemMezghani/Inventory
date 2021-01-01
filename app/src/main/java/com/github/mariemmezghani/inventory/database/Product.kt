package com.github.mariemmezghani.inventory.database

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product (

    @PrimaryKey(autoGenerate = true)
    var id:Long = 0L,

    @ColumnInfo(name = "name")
    var name:String = "product",

    @ColumnInfo(name="quantity")
    var quantity:Int = -1,

    @ColumnInfo(name = "description")
    var description:String="",

    @ColumnInfo(name = "stock_price")
    var stock_price : Double = 0.0

    //var image:Image="@drawable/ic_email"
)