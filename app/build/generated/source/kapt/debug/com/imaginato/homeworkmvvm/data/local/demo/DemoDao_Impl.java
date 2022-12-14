package com.imaginato.homeworkmvvm.data.local.demo;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DemoDao_Impl implements DemoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDemo;

  public DemoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDemo = new EntityInsertionAdapter<Demo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Demo`(`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Demo value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public void insertDemo(final List<Demo> demo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDemo.insert(demo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
