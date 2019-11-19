package com.example.project3.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.project3.R;

public class dataHelper extends SQLiteOpenHelper {
    Context context;

    private static int version = 1;
   private static String dbname = "DB.sqlite";
   private  static String CreateTable = "CREATE TABLE GAME_LIST ("+
           "id INTEGER PRIMARY KEY AUTOINCREMENT, "+
           "picid TEXT, "+
           "name TEXT, "+
           "price TEXT, "+
           "detail TEXT "+
           ");";
   private static String Insert = "INSERT INTO GAME_LIST(picid,name,price,detail)"+
           "VALUES"+
           "("+R.drawable.pic1+ ",'Overcooking','250',"+"'"+"Overcooked เป็นเกมส์ที่ผู้เล่นต้องเล่นกันเป็นทีม โดย จำกัดผู้เล่นอยู่ที่ 1 ถึง 4 คน โดยผู้เล่นและเพื่อน จะต้องช่วยกันทำอาหารและเสิร์ฟอาหาร ภายใต้เงื่อนไขและเวลาที่ทางเกมส์จะกำหนดมาให้ ไม่ว่าจะเป็นการทำอาหาร ในห้องอาหารธรรมดาทั่วไป, บนท้ายรถบรรทุก, บนลาวา หรือ ก้อนน้ำแข็ง เป็นไงละครับ แค่ฟังดูก็น่าสนุกจนอดใจไม่ไหวแล้วใช่ไหมครับ"+"'"+"),"+
           "("+R.drawable.pic2+",'Mario','300',"+"'"+"เกมใน ซีรีย์ Super Mario Bros ที่เป็นเกมแอคชั่น 2 มิติ กำเนิดบนเครื่อง แฟมิคอมในปี 1985 ด้วยรูปแบบที่แปลกใหม่ และ ความสนุกของเกมทำให้เกมประสบความสำเร็จสูงมากจนกลายเป็นตำนานในยุคนั้น และ ในปีต่อมาได้ออก Super Mario Bros 2 (ที่ภาคญี่ปุ่นแทบไม่ต่างจากภาคแรก) แต่ภาคที่นำไปจำหน่ายที่ อเมริกา ได้นำ เกม อาลาดิน ไปเปลี่ยนตัวเอกเป็น Mario และเปลี่ยนชื่อเป็น Super Mario Bros 2 ไปจำหน่ายแทน และใน ปี 1988 หลังจากการโหมโฆษณา และภาพในตัวเกมที่ยกเครื่องใหม่ทั้งหมด ทำให้ Super Mario Bros 3 เป็นที่จับตามอง และคาดหวัง ของเกมเมอร์ในยุคนั้นเป็นอย่างมาก และเมื่อเกมออก Nintendo ก็ไม่ทำให้ผิดหวัง"+"'"+"),"+
           "("+R.drawable.pic3+",'Overwatch','350',"+"'"+"เนื้อเรื่องของ Overwatch เกิดขึ้นในโลกอนาคต 60 ปี นับจากปัจจุบัน โดย Overwatch เป็นชื่อขององค์กรที่สหประชาชาติจัดตั้งขึ้นเมื่อ 30 ปีก่อนเนื้อเรื่องในเกม ทว่า องค์กรนี้ถูกทำลายไป 6 ปี ก่อนจะถึงช่วงเวลาในเนื้อเรื่อง ด้วยข้อหาโจมตีและวางระเบิดสำนักงานใหญ่ที่สวิสเซอร์แลนด์ ซึ่งมีรายงานว่ามีผู้เสียชีวิตอย่างน้อย 2 คน คือ Gabriel Reyes และ John “Jack” Morrison ซึ่งเป็นผ้ก่อตั้งและสมาชิกคนสำคัญขององค์กร และอาจรวมถึง Ana Amari ผู้เป็นแม่ของ Pharah หลังเหตุการณ์นั้น Overwatch โดนยุบ และประกาศว่าเป็นองค์กรผิดกฎหมาย ส่วนสมาชิกองค์กรก็กระจัดพลัดพรายไป"+"'"+"),"+
           "("+R.drawable.pic4+",'Payday','400','"+"ปี 2011 ธนาคาร First World Bank ได้ถูกกลุ่มโจรสี่คนในชุดสูทสวมหน้ากากตัวตลกบุกปล้นอย่างอุกอาจกลางเมือง กวาดเงินไปได้มากมาย ทั้งสี่คนใช้ชื่อแฝงว่า Dallas, Hoxton, Chains และ Wolf หลบหนีไปอย่างไร้ร่องรอย ทุกอย่างถูกวางแผนเอาไว้อย่างเป็นระบบ มีการวางเส้นทางหลบหนีและอุปกรณ์เพียบพร้อม พยานในที่เกิดเหตุให้การว่า พวกเขาทั้งสี่คนเรียกตัวเองว่า แก๊ง Payday"+"');";


    public dataHelper(@Nullable Context context) {
        super(context, dbname, null, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         db.execSQL(CreateTable);
         db.execSQL(Insert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
