package me.daffakurnia.android.githubusers.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FavoriteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(favorite: Favorite)

    @Delete
    fun delete(favorite: Favorite)

    @Query("SELECT * FROM favorite ORDER BY id ASC")
    fun getAllUsers(): LiveData<List<Favorite>>

    @Query("SELECT * FROM favorite WHERE login = :username")
    fun getUser(username: String): LiveData<Favorite>
}