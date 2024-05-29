package Finaltest.Animals;

public abstract class BaseAnimal {
  private int id;
  String name;
  int countOfLegs;
  boolean hasTool;
  static int generalId = 1; // счетчик всех созданных животных
  String typeOfAnimal;

  public BaseAnimal(String name, int countOfLegs, boolean hasTool) {
    this.name = name;
    this.countOfLegs = countOfLegs;
    this.hasTool = hasTool;
    this.id = generalId;
    generalId++;
  }

  public String getName() {
    return name;
  }

  public int getCountOfLegs() {
    return countOfLegs;
  }

  public boolean getHasTool() {
    if (hasTool == true)
      System.out.println("У меня есть хвост!");
    else if (hasTool == false)
      System.out.println("У меня нет хвоста!");
    return hasTool;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCountOfLegs(int countOfLegs) {
    this.countOfLegs = countOfLegs;
  }

  public void setHasTool(boolean hasTool) {
    this.hasTool = hasTool;
  }

  public String Voice(String phrase) {
    return phrase;
  }

  public String run() {
    return "I am running";
  };

  public void iCanDo() {
    System.out.println("Вот что я умею: \n - Назвать свое имя getName() \n - Подать голос voice() \n - Побежать run()");
  }

  public String getTypeOfAnimal() {
    return typeOfAnimal;
  }

  public void setTypeOfAnimal(String typeOfAnimal) {
    this.typeOfAnimal = typeOfAnimal;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "id=" + id + ", name=" + name + ", countOfLegs=" + countOfLegs + ", hasTool=" + hasTool
        + ", typeOfAnimal=" + getTypeOfAnimal();
  }

  public static int getGeneralId() {
    return generalId;
  }

}
