package servlet_sample.service;

import java.util.List;

import servlet_sample.entity.TestEntity;
import servlet_sample.repository.TestRepository;

public class TestService {

  public void writeData() {

    TestRepository repo = new TestRepository(); // DAO作って全件をDTOのリストで受け取る
    List<TestEntity> entities = repo.selectAll();

    // リポジトリから帰ってきたエンティティのリストの内容をファイルに書き出す。
    // ここではテストでコンソールに出力。
    for ( TestEntity entity: entities ) {
      System.out.println( "[ " + entity.getId() + ", " + entity.getMemo() + " ]" );
    }

    return;

  }

}
