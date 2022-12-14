package com.imaginato.homeworkmvvm.data.local.demo;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.imaginato.homeworkmvvm.data.local.login.UserInfoDao;
import com.imaginato.homeworkmvvm.data.local.login.UserInfoDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DemoDatabase_Impl extends DemoDatabase {
  private volatile DemoDao _demoDao;

  private volatile UserInfoDao _userInfoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Demo` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserInfo` (`user_Id` TEXT NOT NULL, `user_name` TEXT NOT NULL, `isDeleted` INTEGER NOT NULL, `Header` TEXT NOT NULL, PRIMARY KEY(`user_Id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0ab4a64eac3538fa43a7bf9e85841188')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Demo`");
        _db.execSQL("DROP TABLE IF EXISTS `UserInfo`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDemo = new HashMap<String, TableInfo.Column>(2);
        _columnsDemo.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsDemo.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDemo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDemo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDemo = new TableInfo("Demo", _columnsDemo, _foreignKeysDemo, _indicesDemo);
        final TableInfo _existingDemo = TableInfo.read(_db, "Demo");
        if (! _infoDemo.equals(_existingDemo)) {
          throw new IllegalStateException("Migration didn't properly handle Demo(com.imaginato.homeworkmvvm.data.local.demo.Demo).\n"
                  + " Expected:\n" + _infoDemo + "\n"
                  + " Found:\n" + _existingDemo);
        }
        final HashMap<String, TableInfo.Column> _columnsUserInfo = new HashMap<String, TableInfo.Column>(4);
        _columnsUserInfo.put("user_Id", new TableInfo.Column("user_Id", "TEXT", true, 1));
        _columnsUserInfo.put("user_name", new TableInfo.Column("user_name", "TEXT", true, 0));
        _columnsUserInfo.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0));
        _columnsUserInfo.put("Header", new TableInfo.Column("Header", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserInfo = new TableInfo("UserInfo", _columnsUserInfo, _foreignKeysUserInfo, _indicesUserInfo);
        final TableInfo _existingUserInfo = TableInfo.read(_db, "UserInfo");
        if (! _infoUserInfo.equals(_existingUserInfo)) {
          throw new IllegalStateException("Migration didn't properly handle UserInfo(com.imaginato.homeworkmvvm.data.local.login.UserInfo).\n"
                  + " Expected:\n" + _infoUserInfo + "\n"
                  + " Found:\n" + _existingUserInfo);
        }
      }
    }, "0ab4a64eac3538fa43a7bf9e85841188", "7128a38e748d6717143e49336454e039");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Demo","UserInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Demo`");
      _db.execSQL("DELETE FROM `UserInfo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DemoDao getDemoDao() {
    if (_demoDao != null) {
      return _demoDao;
    } else {
      synchronized(this) {
        if(_demoDao == null) {
          _demoDao = new DemoDao_Impl(this);
        }
        return _demoDao;
      }
    }
  }

  @Override
  public UserInfoDao getUserInfoDao() {
    if (_userInfoDao != null) {
      return _userInfoDao;
    } else {
      synchronized(this) {
        if(_userInfoDao == null) {
          _userInfoDao = new UserInfoDao_Impl(this);
        }
        return _userInfoDao;
      }
    }
  }
}
