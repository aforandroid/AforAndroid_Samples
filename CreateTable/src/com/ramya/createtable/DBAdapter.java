package com.ramya.createtable;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBAdapter 
{
		static final String DATABASE_NAME = "AFORANDROID.db";
		static final int DATABASE_VERSION = 1;
		public static final int NAME_COLUMN = 1;
		// TODO: Create public field for each column in your table.
		// SQL Statement to create a new database.
		static final String DATABASE_CREATE = "create table "+"MYTABLE"+"( " +"ID"+" integer primary key autoincrement,"+ "POST  text,DESCRIPTION text); ";
		// Variable to hold the database instance
		public static  SQLiteDatabase db;
		// Context of the application using the database.
		private final Context context;
		// Database open/upgrade helper
		private DataBase dbHelper;
		public  DBAdapter(Context _context) 
		{
			context = _context;
			dbHelper = new DataBase(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		public  DBAdapter open() throws SQLException 
		{
			db = dbHelper.getWritableDatabase();
			return this;
		}
		public static void close() 
		{
			db.close();
		}
		public  SQLiteDatabase getDatabaseInstance()
		{
			return db;
		}	
		public void insertEntry(String POST,String DESCRIPTION)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("POST", POST);
			newValues.put("DESCRIPTION",DESCRIPTION);
			// Insert the row into your table
			db.insert("MYTABLE", null, newValues);			
		}
		public void deleteEntry(String POST)
		{
		    String where="POST=?";
		    db.delete("MYTABLE", where, new String[]{POST}) ;
		}
		public void updateTable(String POST,String DESCRIPITION)
		{
				// Define the updated row content.
				ContentValues updatedValues = new ContentValues();
				// Assign values for each row.
				updatedValues.put("POST",POST);
				updatedValues.put("DECRIPTION", DESCRIPITION);
		        String where="POST = ?";
			    db.update("MYTABLE",updatedValues, where, new String[]{POST});			   
			}
		}

