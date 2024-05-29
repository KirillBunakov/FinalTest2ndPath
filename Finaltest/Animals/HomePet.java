package Finaltest.Animals;

public class HomePet extends BaseAnimal {
  String typeOfAnimal;

  public HomePet(String name, int countOfLegs, boolean hasTool) {
    super(name, countOfLegs, hasTool);
  }

  @Override
  public int getCountOfLegs() {
    // TODO Auto-generated method stub
    return super.getCountOfLegs();
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return super.getName();
  }

  @Override
  public boolean getHasTool() {
    // TODO Auto-generated method stub
    return super.getHasTool();
  }

  @Override
  public void setCountOfLegs(int countOfLegs) {
    // TODO Auto-generated method stub
    super.setCountOfLegs(countOfLegs);
  }

  @Override
  public void setHasTool(boolean hasTool) {
    // TODO Auto-generated method stub
    super.setHasTool(hasTool);
  }

  @Override
  public void setName(String name) {
    // TODO Auto-generated method stub
    super.setName(name);
  }

  @Override
  public String Voice(String phrase) {
    // TODO Auto-generated method stub
    return super.Voice(phrase);
  }

  @Override
  public String run() {
    // TODO Auto-generated method stub
    return super.run();
  }

  @Override
  public void iCanDo() {
    // TODO Auto-generated method stub
    super.iCanDo();
    System.out.println(" - Могу слушаться, а могу и не слушаться, я же домашнее животное");
  }

  @Override
  public String getTypeOfAnimal() {
    return "Домашнее животное";
  }

  @Override
  public String toString() {
    return super.toString();
  }

}
