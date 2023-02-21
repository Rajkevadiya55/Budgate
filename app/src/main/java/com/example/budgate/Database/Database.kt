package com.example.budgate.Database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.budgate.BudgetModel

class Database(context: Context): SQLiteOpenHelper(context,"MYData.db",null,1)  {
    override fun onCreate(db: SQLiteDatabase?) {
        var sql="CREATE TABLE budget(id INTEGER PRIMARY KEY AUTOINCREMENT,income INTEGER,expense INTEGER,p_method TEXT)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
        fun addIncome(income: Int,p_method:String,party:String) {

            var db=writableDatabase
            var value= ContentValues()
            value.put("income",income)
            value.put("p_method",p_method)
            db.insert("budget",null,value)
    }

    fun addExpense(income: Int,p_method: String){
        var db = writableDatabase
        var values = ContentValues()
        values.put("income",income)
        values.put("p_method",p_method)
        db.insert("budget",null,values)
    }

    fun showData():ArrayList<BudgetModel>{


        var bgtList = ArrayList<BudgetModel>()
        var db = readableDatabase
        var sql = "SELECT * FROM budget"
        var cursor : Cursor = db.rawQuery(sql,null)
        cursor.moveToFirst()


        for (i in 0 until cursor.count){

            var id = cursor.getInt(0)
            var income = cursor.getInt(1)
            var expense = cursor.getInt(2)
            var p_method = cursor.getString(3)


            var bgt = BudgetModel(id, income, expense, p_method)
            bgtList.add(bgt)
            cursor.moveToNext()
        }

        return bgtList

    }
}