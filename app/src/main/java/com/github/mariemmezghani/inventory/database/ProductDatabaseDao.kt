package com.github.mariemmezghani.inventory.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface ProductDatabaseDao {
    @Insert
    suspend fun insert(product:Product)

    @Update
    suspend fun update(product:Product)

    @Query("SELECT * from product_table WHERE id = :key")
    suspend fun get(key: Long): Product?

    @Query("SELECT * FROM product_table ORDER BY id DESC")
    fun getAllProducts(): LiveData<List<Product>>
}
