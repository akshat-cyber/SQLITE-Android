package com.example.sql;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class layerDB {
   private dbHelper db;
   private Context context;
   private SQLiteDatabase database;
    layerDB(Context context) {
         db = new dbHelper(context);
         this.context = context;
    }
   public long addData (String opt1, String opt2) {
        database = db.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Contractor.TableContents.COLUMN_NAME_A, opt1);
        contentValues.put(Contractor.TableContents.COLUMN_NAME_A, opt2);
        long statusCode = database.insert(Contractor.TableContents.TABLE_NAME, null, contentValues);
        return statusCode;
    }
   public void readData (Context context) {
       Toast.makeText(context, "Under Construction", Toast.LENGTH_SHORT).show();
    }
}
