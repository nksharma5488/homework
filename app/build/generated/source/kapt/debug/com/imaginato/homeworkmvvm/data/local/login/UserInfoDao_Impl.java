package com.imaginato.homeworkmvvm.data.local.login;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserInfoDao_Impl implements UserInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserInfo;

  public UserInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserInfo = new EntityInsertionAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserInfo`(`user_Id`,`user_name`,`isDeleted`,`Header`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUserId());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        final int _tmp;
        _tmp = value.isDeleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getHeader() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHeader());
        }
      }
    };
  }

  @Override
  public void insertUserInfo(final UserInfo userInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserInfo.insert(userInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
