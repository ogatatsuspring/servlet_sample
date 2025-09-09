package servlet_sample.entity;

public class TestEntity {

  private int id;
  private String memo;

  public TestEntity(){
  }

  public TestEntity( int id, String memo ) {
    this.id = id;
    this.memo = memo;
  }

  public int getId() {
    return this.id;
  }

  public String getMemo() {
    return this.memo;
  }

  public void setId( int id ) {
    this.id = id;
    return;
  }

  public void setMemo( String memo ) {
    this.memo = memo;
    return;
  } 

}
