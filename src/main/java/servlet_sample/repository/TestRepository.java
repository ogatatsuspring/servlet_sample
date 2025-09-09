package servlet_sample.repository;

import java.util.ArrayList;
import java.util.List;

import servlet_sample.entity.TestEntity;

public class TestRepository {

  public List<TestEntity> selectAll() {

    List<TestEntity> entities = new ArrayList<TestEntity>();
    // DBからデータを全件持ってきてリストで返す。
    // ここではテストとして手動でセット。
    entities.add( new TestEntity( 1, "Memo1" ) );
    entities.add( new TestEntity( 2, "Memo2" ) );
    entities.add( new TestEntity( 3, "Memo3" ) );

    return entities;

  }

}
